/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm1590.sga.cliente;

import com.jpm1590.sga.servicio.PersonaServiceRemote;
import com.jpm1590.sga.domain.Persona;

import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author jpm1590
 */
public class ClientePersonaService {

    public static void main(String[] args) {

        System.out.println("Iniciando llamada a EJB desde cliente");
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) 
                    jndi.lookup("java:global/sga-jee/PersonaServiceImpl!com.jpm1590.sga.servicio.PersonaServiceRemote");

            List<Persona> personas = personaService.listarPersonas();

            for (Persona persona : personas) {
                System.out.println(persona);
            }
            System.out.println("Fin llamada a EJB desde cliente");
        } catch (NamingException ex) {
            ex.printStackTrace();
        }
    }

}
