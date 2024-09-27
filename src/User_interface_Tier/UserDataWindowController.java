package User_interface_Tier;

import Data_Access_Tier.UserManagerFactory;
import Model.User;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Controller class for the User Data Window in the JavaFX application.
 * It initializes the user data and displays it in the associated view.
 * 
 * The user data is loaded from a data source using the UserManagerFactory.
 * 
 * @author Kelian
 */
public class UserDataWindowController {

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
    
    /**
     * Initializes the controller class.
     * It fetches user data and displays it in the respective text fields.
     * 
     * This method is called automatically after the FXML file is loaded.
     */
    public void initialize() {
        try {
            // Use the factory to obtain the DataAccessible (from DB or file)
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

