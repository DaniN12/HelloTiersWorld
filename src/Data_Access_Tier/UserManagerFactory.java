/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Access_Tier;

import java.util.ResourceBundle;

/**
 *
 * @author kbilb
 */
public class UserManagerFactory {
    
    public static DataAccessible getUserManager(){
        
        ResourceBundle config = ResourceBundle.getBundle("Config.config");
        String readMethod = config.getString("readMethod");
        
        if (readMethod.equals("0")) {
            return new DBUserDataAccessor();
        } else {
            return new FileUserDataAccessor();
        }
        
    }
    
}

