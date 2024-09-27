/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Access_Tier;

import Model.User;

/**
 * Interface defining the contract for accessing user data.
 * Implementations can retrieve data from different sources (e.g., file or database).
 * 
 * @author Dani
 */
public interface DataAccessible {
    
    /**
     * Retrieves user data.
     * 
     * @return A User object containing user data.
     * @throws Exception If an error occurs while retrieving the data.
     */
    public User getUserData() throws Exception;
}
