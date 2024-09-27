/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Access_Tier;

import java.util.ResourceBundle;

/**
 * Factory class to retrieve the appropriate DataAccessible instance.
 * It decides whether to load data from a database or a file based on configuration.
 * 
 * @author Kelian
 */
public class UserManagerFactory {
    
    /**
     * Returns an implementation of DataAccessible based on configuration.
     * 
     * @return A DataAccessible object, either for database or file access.
     */
    public static DataAccessible getUserManager() {
        ResourceBundle config = ResourceBundle.getBundle("Config.config");
        String readMethod = config.getString("readMethod");
        
        if (readMethod.equals("0")) {
            return new DBUserDataAccessor();
        } else {
            return new FileUserDataAccessor();
        }
    }
}
