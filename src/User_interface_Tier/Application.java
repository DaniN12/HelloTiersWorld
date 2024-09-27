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
 * The main application class for launching the JavaFX User Data Window.
 * It sets up the stage, loads the FXML file, and displays the window.
 * 
 * @author Kelian
 */
public class Application extends javafx.application.Application {
    
    /**
     * The start method is the main entry point for all JavaFX applications.
     * It sets up the stage, loads the FXML view, and displays the window.
     * 
     * @param stage The main window
     * @throws Exception If the view cannot be loaded
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/UserDataWindow.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("User Data Window");
        stage.show();
    }

    /**
     * Main method to launch the JavaFX application.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
