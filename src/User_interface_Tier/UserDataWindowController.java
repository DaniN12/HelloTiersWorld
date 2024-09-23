/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_interface_Tier;

import Data_Access_Tier.DataAccessible;
import Data_Access_Tier.UserManagerFactory;
import Model.User;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author kbilb
 */
public class UserDataWindowController{
    
    @FXML
    private Label labelId;
    @FXML
    private Label labelNombre;
    @FXML
    private Label labelApellidos;
    @FXML
    private Label labelEmail;
    
    @FXML
    private TextField textFieldId;
    @FXML
    private TextField textFieldNombre;
    @FXML
    private TextField textFieldApellidos;
    @FXML
    private TextField textFieldEmail;
    
    public void initialize() {
        try {
             // Usar la Factoría para obtener el DataAccessible (de BD o de archivo)
            User user = UserManagerFactory.getUserManager().getUserData();
            
            if (user != null) {
                textFieldId.setText(String.valueOf(user.getId()));
                textFieldNombre.setText(user.getNombre());
                textFieldApellidos.setText(user.getApellido());
                textFieldEmail.setText(user.getEmail());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }  
    
}
