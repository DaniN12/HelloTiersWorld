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

/**
 *
 * @author kbilb
 */
public class DBUserDataAccessor implements DataAccessible {

    private Connection conexion;
    private PreparedStatement sentencia;
    ResultSet rs = null;
    
    final String CARGARusuario = "SELECT * FROM info";
    
    @Override
   public User getUserData() {
    User usuario = null; // Inicializa la variable fuera del bloque try

    // Abre la conexión a la base de datos
    try {
        String url = "jdbc:mysql://localhost:3306/users?serverTimezone=Europe/Madrid&useSSL=false";
        conexion = DriverManager.getConnection(url, "root", "abcd*1234");

        // Prepara y ejecuta la consulta
        sentencia = conexion.prepareStatement(CARGARusuario);
        ResultSet rs = sentencia.executeQuery();

        // Verifica si hay resultados
        if (rs.next()) { // Cambia a usar rs.next() para verificar la existencia de resultados
            usuario = new User();
            usuario.setId(rs.getInt("id"));
            usuario.setNombre(rs.getString("nombre"));
            usuario.setApellido(rs.getString("apellido"));
            usuario.setEmail(rs.getString("email"));
        }

    } catch (SQLException e) {
        System.out.println("Error al intentar abrir la BD: " + e.getMessage());
        e.printStackTrace();
    } finally {
        // Cierra recursos en el bloque finally
        try {
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) { // Asegúrate de que la conexión se cierre
                conexion.close();
            }
        } catch (SQLException error) {
            System.out.println("Error al intentar cerrar la conexión: " + error.getMessage());
            error.printStackTrace();
        }
    }

    return usuario; // Retorna el usuario (puede ser null si no se encontró)
    }
}

    
