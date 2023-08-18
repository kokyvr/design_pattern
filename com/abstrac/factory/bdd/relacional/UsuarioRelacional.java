package com.abstrac.factory.bdd.relacional;

import com.abstrac.factory.bdd.usuario.UsuarioRepository;

public class UsuarioRelacional implements UsuarioRepository {
    @Override
    public String guardarUsuario(String usuario) {
        return String.format("Guardando %s en  una BD Relacional ", usuario);
    }
}
