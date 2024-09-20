/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Access_Tier;

import Config.Configuration;

/**
 *
 * @author kbilb
 */
public class UserManagerFactory {
    
    public DataAccessible getUserManager(){
        
        Configuration configuration = new Configuration("config.properties");
        configuration.getProperty("readMethod");
        
        if (configuration.equals("0")) {
            return new DBUserDataAccessor();
        } else {
            return new FileUserDataAccessor();
        }
        
    }
    
}

