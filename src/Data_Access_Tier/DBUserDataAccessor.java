/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Access_Tier;

import Model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 * Implementation of DataAccessible to retrieve user data from a database.
 * It connects to a MySQL database and retrieves user information.
 * 
 * @author Dani
 */
public class DBUserDataAccessor implements DataAccessible {

    private Connection conexion;
    private PreparedStatement sentencia;
    ResultSet rs = null;

    final String CARGARusuario = "SELECT * FROM info";

    /**
     * Retrieves user data from a MySQL database.
     * 
     * @return A User object with the data from the database, or null if no data is found.
     */
    @Override
    public User getUserData() {
        User usuario = null;
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/users?serverTimezone=Europe/Madrid&useSSL=false";
            conexion = DriverManager.getConnection(url, "root", "abcd*1234");

            sentencia = conexion.prepareStatement(CARGARusuario);
            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) {
                usuario = new User();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setEmail(rs.getString("email"));
            }

        } catch (SQLException e) {
            System.out.println("Error while opening the DB: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (sentencia != null) {
                    sentencia.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException error) {
                Logger.getLogger("Data_Access_Tier").severe(error.getLocalizedMessage());
                new Alert(Alert.AlertType.ERROR, error.getLocalizedMessage(), ButtonType.OK).showAndWait();
            }
        }
        return usuario;
    }
}
