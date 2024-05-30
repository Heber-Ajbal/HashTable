/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import Controller.HashTables;
import View.frmHash;
import java.sql.Connection;
import grafos.connection.connection;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Heber
 */
public class Grafos extends Application {
    
    connection con = new connection();
    Connection connect;
    Statement st;
    ResultSet rs;
        
    @Override
    public void start(Stage primaryStage) {
        
        //HashTables hash = new HashTables();
        
        frmHash hash = new frmHash();     
       hash.LoadCountry();
       hash.LoadState();
       hash.LoadCity();
        //query();
        hash.show();
        //hash.LoadData("SELECT * FROM cities");
        
        
        //hash.FindHashTable();        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
   /* private void query(){
        try{
            String sql = "SELECT  c.id as IDC, s.id as IDS, s.iso, c.name FROM states s JOIN cities c ON s.id = c.id_state";
            connect = con.gertConnection();
            st = connect.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                String iso = rs.getString("iso");
                String stateName = rs.getString("name");                
                Integer id = Integer.parseInt(rs.getString("IDC"));                                
                Integer idC = Integer.parseInt(rs.getString("IDS")); 
                String ultimasDosLetras = iso.substring(iso.length() - 2);
                String isoNuevo = ultimasDosLetras  + stateName.substring(0, 3); // Combinar iso y las dos primeras letras del nombre del estado
                System.out.println("INSERT INTO states (id, id_state, name, iso) VALUES ('"+ id + "', '" + idC + "', '"+ stateName + "', '" + isoNuevo + "');");
            }
            
            
        }catch(Exception e){}
        
    }*/
    
      private void query() {
        BufferedWriter writer = null;
        try {
            // Configura la conexión a la base de datos y ejecuta la consulta
            String sql = "SELECT c.id as IDC, s.id as IDS, s.iso, c.name FROM states s JOIN cities c ON s.id = c.id_state";
            connect = con.gertConnection(); // Asegúrate de que con.gertConnection() está bien definido
            st = connect.createStatement();
            rs = st.executeQuery(sql);

            // Inicializa el BufferedWriter para escribir en el archivo
            writer = new BufferedWriter(new FileWriter("D:\\output.txt"));

            // Itera a través de los resultados de la consulta
            while (rs.next()) {
                String isoNuevo; 
                String iso = rs.getString("iso");
                String stateName = rs.getString("name");                
                Integer id = Integer.parseInt(rs.getString("IDC"));                                
                Integer idC = Integer.parseInt(rs.getString("IDS")); 
                String ultimasDosLetras = iso.substring(iso.length() - 2);
                if (stateName.length() >= 2) {
                  isoNuevo = ultimasDosLetras + stateName.substring(0,2) + stateName.substring(stateName.length() - 1); // Combinar iso y las dos primeras letras del nombre del estado
                }else{
                  isoNuevo = ultimasDosLetras + stateName.substring(0,1) + stateName.substring(stateName.length() - 1); // Combinar iso y las dos primeras letras del nombre del estado
                }
               

                // Escribe el resultado en el archivo en lugar de imprimir en consola
                writer.write("INSERT INTO cities (id, id_state, name, iso) VALUES ('" + id + "', '" + idC + "', '" + stateName + "', '" + isoNuevo + "');");
                writer.newLine(); // Escribe una nueva línea en el archivo
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cierra el BufferedWriter y los recursos de la base de datos
            try {
                if (writer != null) {
                    writer.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (connect != null) {
                    connect.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
        
        
}
    

