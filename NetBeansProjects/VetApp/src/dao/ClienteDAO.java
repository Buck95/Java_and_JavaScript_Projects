
package dao;

import config.DatabaseConnection;
import models.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class ClienteDAO {
    
    public void agregarCliente(Cliente cliente){
        String sql = "INSERT INTO clientes (nombre, email, telefono, direccion) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getTelefono());
            stmt.setString(4, cliente.getDireccion());
            
            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0){
                
                try(ResultSet generateKeys = stmt.getGeneratedKeys()){
                    if (generateKeys.next()){
                        cliente.setId(generateKeys.getInt(1));
                    }
                }                                    
            }                
        } catch (SQLException e){ 
            System.out.println("Error al agregar cliente: "+e.getMessage());
        
        }
    }
    
    public List<Cliente>obtenerCliente(){
         List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM clientes";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()){
                Cliente cliente = new Cliente(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getString("telefono"),
                        rs.getString("direccion"));
                clientes.add(cliente);   
            }                 
         } 
        catch (SQLException e){ 
                System.out.println("Error al obtener cliente: "+e.getMessage());
        }
        return clientes;
    }  
}

    
    

