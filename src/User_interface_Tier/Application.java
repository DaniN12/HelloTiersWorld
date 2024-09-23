/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_interface_Tier;

import java.util.logging.Logger;
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
        Parent root = FXMLLoader.load(getClass().getResource("/View/UserDataWindow.fxml"));
        //create scene
        Scene scene = new Scene(root);
        //Put scene on stage
        stage.setScene(scene);
        //Put a title to the window
        stage.setTitle("User Data Window");
        //Show stage
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
