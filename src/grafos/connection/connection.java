/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Heber
 */
public class connection {
    
    Connection con;
    
    public connection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBISOCountries", "root", "admin");
            System.err.println("FUNCIONA");
        }catch(Exception e){
            System.err.println("ERROR EN LA CONEXION: "+ e);
        }
    }
    
    
    public Connection gertConnection(){
        return con;
    }
}
