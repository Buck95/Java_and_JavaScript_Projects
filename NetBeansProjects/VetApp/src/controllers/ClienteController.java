
package controllers;

import java.util.List;
import dao.ClienteDAO;
import models.Cliente;

public class ClienteController {
    
    private ClienteDAO clienteDAO;

    public ClienteController() {
        this.clienteDAO = new ClienteDAO();
    }
    
    public void agregarCliente(String nombre, String email, String telefono, String direccion){
        
        Cliente cliente = new Cliente(nombre, email, telefono, direccion);
        clienteDAO.agregarCliente(cliente);
        System.out.println("Cliente agregado correctamente\n" + cliente); 
    }
    
    public List<Cliente> obtenerCliente(){
        return clienteDAO.obtenerCliente();
    
    
    
    }
    
    
}

