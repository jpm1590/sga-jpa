/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm1590.sga.servicio;

import com.jpm1590.sga.domain.Persona;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author olimpica
 */
@Local
public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public Persona encontrarPersonaPorID();
    
    public Persona encontrarPersonaPorEmail();
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
    
}
