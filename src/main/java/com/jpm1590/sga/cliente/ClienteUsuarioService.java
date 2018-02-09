/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm1590.sga.cliente;

import com.jpm1590.sga.domain.Usuario;
import com.jpm1590.sga.servicio.UsuarioServiceRemote;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author jpm1590
 */
public class ClienteUsuarioService {
    
    public static void main(String[] args){
        
        System.out.println("Iniciando llamada a EJB desde cliente");
        try {
            Context jndi = new InitialContext();
            UsuarioServiceRemote usuarioService = (UsuarioServiceRemote) 
                    jndi.lookup("java:global/sga-jpa/UsuarioServiceImpl!com.jpm1590.sga.servicio.UsuarioServiceRemote");

            List<Usuario> usuarios = usuarioService.listarUsuarios();

            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
            System.out.println("Fin llamada a EJB desde cliente");
        } catch (NamingException ex) {
            ex.printStackTrace();
        }
    }    
}
