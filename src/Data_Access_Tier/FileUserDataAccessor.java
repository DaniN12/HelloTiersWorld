/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Access_Tier;

import Model.User;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 *
 * @author kbilb
 */
public class FileUserDataAccessor implements DataAccessible {

    @Override
    public User getUserData(){
        
        User user = new User();
        try {
            ResourceBundle userData = ResourceBundle.getBundle("Config.user");

            user.setId(Integer.parseInt(userData.getString("id")));
            user.setNombre(userData.getString("nombre"));
            user.setApellido(userData.getString("apellido"));
            user.setEmail(userData.getString("email"));
        } catch (Exception error) {
            
            Logger.getLogger("Data_Access_Tier").severe(error.getLocalizedMessage());
            
            new Alert(Alert.AlertType.ERROR,error.getLocalizedMessage(),ButtonType.OK).showAndWait();
            
        }
        
        return user;
        
    }
    
    
}
