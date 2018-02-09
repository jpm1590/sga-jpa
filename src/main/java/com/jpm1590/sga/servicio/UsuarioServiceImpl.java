/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm1590.sga.servicio;

import com.jpm1590.sga.domain.Usuario;
import com.jpm1590.sga.eis.UsuarioDao;

import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author jpm1590
 */
@Stateless
public class UsuarioServiceImpl implements UsuarioService, UsuarioServiceRemote {

    @javax.inject.Inject
    //@javax.ejb.EJB
    private UsuarioDao usuarioDao;

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioDao.findAllUsuarios();
    }

    @Override
    public Usuario encontrarUsuarioPorID(Usuario persona) {
        return usuarioDao.findById(persona);
    }

    @Override
    public Usuario encontrarUsuarioPorUsername(Usuario persona) {
        return usuarioDao.findByUsername(persona);
    }

    @Override
    public void registrarUsuario(Usuario persona) {
        usuarioDao.insertUsuario(persona);
    }

    @Override
    public void modificarUsuario(Usuario persona) {
        usuarioDao.updateUsuario(persona);
    }

    @Override
    public void eliminarUsuario(Usuario persona) {
        usuarioDao.deleteUsuario(persona);
    }
}
