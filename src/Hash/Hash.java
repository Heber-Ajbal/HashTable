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
        
}
    

