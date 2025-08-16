
package controllers;

import java.util.List;
import dao.VeterinarioDAO;
import models.Veterinario;

public class VeterinarioController {
    
    private VeterinarioDAO veterinarioDAO;

    public VeterinarioController() {
        this.veterinarioDAO = new VeterinarioDAO();
    }
    
    public List<Veterinario> obtenerVeterinarios() {
        return veterinarioDAO.obtenerVeterinarios();
    }
}