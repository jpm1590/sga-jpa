/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.jpm1590.sga.domain.Persona;
import com.jpm1590.sga.servicio.PersonaService;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author olimpica
 */
public class PersonaServiceTest {

    private PersonaService personaService;

    @Before
    public void setUp() throws Exception {

        EJBContainer contenedor = EJBContainer.createEJBContainer();
        personaService = (PersonaService) contenedor.getContext().
                lookup("java:global/classes/PersonaServiceImpl!com.jpm1590.sga.servicio.PersonaService");
    }

    @Test
    public void testEJBPersonaService() {

        System.out.println("iniciando test ejb Persona Local");
        assertTrue(personaService != null);

        assertEquals(2, personaService.listarPersonas().size());

        System.out.println("El numero de personas es: "
                + personaService.listarPersonas().size());

        this.desplegarPersonas(personaService.listarPersonas());
        System.out.println("Fin de Test ejb Persona Local");
    }

    private void desplegarPersonas(List<Persona> personas) {

        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
