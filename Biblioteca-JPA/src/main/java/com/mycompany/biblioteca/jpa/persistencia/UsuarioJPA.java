package com.mycompany.biblioteca.jpa.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class UsuarioJPA {
        public static Usuario validarUsuario (Usuario user) {
        EntityManager manager = JPAUtil.conectar();
        try {
            Query consulta = manager.createQuery("SELECT u FROM usuario u WHERE u.login = :login AND u.senha = :senha");
            consulta.setParameter("login", user.getLogin());
            consulta.setParameter("senha", user.getSenha());
            List<Usuario> lista = consulta.getResultList();
            
            if(!lista.isEmpty()) {
                return lista.get(0);
            }
           
        } catch(Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        } 
        return null;
    }
}
