/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Access_Tier;

import Model.User;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kbilb
 */
public class FileUserDataAccessor implements DataAccessible {

    @Override
    public User getUserData() {
        
        User user = new User();
        boolean encontrado = false;
        
        return user;
        
    }
    
    
}
