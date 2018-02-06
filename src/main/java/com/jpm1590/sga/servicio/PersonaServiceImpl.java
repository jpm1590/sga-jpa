/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm1590.sga.servicio;

import com.jpm1590.sga.domain.Persona;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author olimpica
 */
@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService {

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1,"Juliana","Puerto","Molina","jpm1590@gmail.com","5631009"));
        personas.add(new Persona(2,"Gustavo","Puerto","Jimenez","guspuji@hotmail.com","5631009"));
        return personas;
    }

    @Override
    public Persona encontrarPersonaPorID() {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail() {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
        
    }

    @Override
    public void modificarPersona(Persona persona) {
        
    }

    @Override
    public void eliminarPersona(Persona persona) {
        
    }
    
}
