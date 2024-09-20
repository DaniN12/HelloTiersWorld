/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Access_Tier;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author kbilb
 */
public class UserManagerFactory {
    
    private Properties properties;
    
    public DataAccessible getUserData(){
    
        properties = new Properties();
        try (FileInputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}

        
    
    

