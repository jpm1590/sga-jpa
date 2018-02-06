/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm1590.sga.cliente;

import com.jpm1590.sga.domain.Persona;
import com.jpm1590.sga.servicio.PersonaServiceRemote;

import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author jpm1590
 */
public class ClientePersonaServiceConIP {

    public static void main(String[] args) {

        System.out.println("Iniciando llamada a EJB desde cliente");
        try {
            Properties props = new Properties();
            props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
            props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
            props.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
            props.setProperty("org.omg.CORBA.ORBInitialHost", "127.0.0.1");
            //props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
            Context jndi = new InitialContext(props);
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
