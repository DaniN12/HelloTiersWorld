/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_interface_Tier;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author kbilb
 */
public class Application extends javafx.application.Application {
    /**
     * 
     * @param stage The main window
     * @throws Exception When view can not be found
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("View.UserDataWindow.fxml"));
        //create scene
        Scene scene = new Scene(root);
        //Put scene on stage
        stage.setScene(scene);
        //Show stage
        stage.show();
        
        Properties properties = new Properties();
        try {
            // Cargar el archivo de propiedades
            FileInputStream input = new FileInputStream("config.properties");
            properties.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
