
package dao;

import config.DatabaseConnection;
import models.Veterinario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VeterinarioDAO {
    
    public List<Veterinario> obtenerVeterinarios() {
        List<Veterinario> veterinarios = new ArrayList<>();
        String sql = "SELECT * FROM Veterinarios";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Veterinario veterinario = new Veterinario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getString("telefono")
                );
                veterinarios.add(veterinario);
            }                 
        } catch (SQLException e) { 
            System.out.println("Error al obtener veterinarios: " + e.getMessage());
        }
        return veterinarios;
    }
}
