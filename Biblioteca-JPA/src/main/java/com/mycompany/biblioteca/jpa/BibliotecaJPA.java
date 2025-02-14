/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca.jpa;

import com.mycompany.biblioteca.jpa.persistencia.JPAUtil;
import com.mycompany.biblioteca.jpa.persistencia.Livro;
import com.mycompany.biblioteca.jpa.persistencia.LivroJPA;
import com.mycompany.biblioteca.jpa.telas.UsuarioLogin;

public class BibliotecaJPA {

    public static void main(String[] args) {
        
        UsuarioLogin tela = new UsuarioLogin();
        tela.setVisible(true);
        
        
        /* TESTES VIA TERMINAL
        
        Livro livro = new Livro();
        livro.setTitulo("Harry Potter");
        livro.setAutor("J.K Rowling");
        livro.setDataLancamento("1997");
        LivroJPA.cadastrar(livro);
        
        List<Livro> lista = LivroJPA.listar();
        
        for (int i = 0; lista.size() > i; i++) {
            System.out.println(lista.get(i).getId() + " - " + lista.get(i).getTitulo());
        }

        */
    }
}
