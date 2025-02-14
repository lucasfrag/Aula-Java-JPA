package com.mycompany.biblioteca.jpa.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class LivroJPA {
    public static void cadastrar(Livro livro) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            manager.persist(livro);
            manager.getTransaction().commit();
        } catch(Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        } 
    }
    
    public static List<Livro> listar() {
        List<Livro> lista = new ArrayList<Livro>();
        
        EntityManager manager = JPAUtil.conectar();
        try {
            Query consulta = manager.createQuery("SELECT l FROM livro l");
            lista = consulta.getResultList();
        } catch(Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        } 
        return lista;
    }
    
        public static List<Livro> buscarPorTitulo (String filtro) {
            List<Livro> lista = new ArrayList<Livro>();

            EntityManager manager = JPAUtil.conectar();
            try {
                Query consulta = manager.createQuery("SELECT l FROM livro l WHERE (:titulo is null OR l.titulo LIKE :titulo)");
                consulta.setParameter("titulo", filtro.isEmpty() ? null : "%" + filtro + "%");
                lista = consulta.getResultList();
            } catch(Exception e) {
                manager.getTransaction().rollback();
            } finally {
                JPAUtil.desconectar();
            } 
            return lista;
        }
        
        public static void excluir (int id) {
            EntityManager manager = JPAUtil.conectar();
            try {
                manager.getTransaction().begin();
                Livro l = manager.find(Livro.class, id);
                if (l != null) {
                    manager.remove(l);
                }
                manager.getTransaction().commit();
            } catch(Exception e) {
                manager.getTransaction().rollback();
            } finally {
                JPAUtil.desconectar();
            } 
        }
}
