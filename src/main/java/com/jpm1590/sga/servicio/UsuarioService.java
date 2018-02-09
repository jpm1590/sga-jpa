/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm1590.sga.servicio;

import com.jpm1590.sga.domain.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jpm1590
 */

@Local
public interface UsuarioService {
    
    public List<Usuario> listarUsuarios();
    
    public Usuario encontrarUsuarioPorID(Usuario persona);
    
    public Usuario encontrarUsuarioPorUsername(Usuario persona);
    
    public void registrarUsuario(Usuario persona);
    
    public void modificarUsuario(Usuario persona);
    
    public void eliminarUsuario(Usuario persona);
}
