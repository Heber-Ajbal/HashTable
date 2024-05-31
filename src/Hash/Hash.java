/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash;

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
public class Hash extends Application {
    
        
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
    
    
        
}
    

