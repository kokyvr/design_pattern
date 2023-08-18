package com.abstrac.factory.bdd.mongodb;

import com.abstrac.factory.bdd.usuario.UsuarioRepository;

public class UsuarioMongoDBRepository implements UsuarioRepository {
    @Override
    public String guardarUsuario(String usuario) {
        return String.format("Guardando %s en MongoDB ",usuario);
    }
}
