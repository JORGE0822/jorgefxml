/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgepcshopfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Jong's TV
 */
public class JorgePCSHOPfx extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       try{
         Parent root= FXMLLoader.load(getClass().getResource("Jorge.fxml"));
            
            Scene scene=new Scene(root);
            scene.getStylesheets().add(getClass().getResource("jorge.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
        }catch(Exception e){
        }
    }

        
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
