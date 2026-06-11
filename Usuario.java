package Biblioteca;

import java.util.ArrayList;

public class Usuario {

    private String nome;
    private ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(Livro livro) {

        if (livro.isDisponivel()) {

            livro.setDisponivel(false);
            livrosEmprestados.add(livro);

            System.out.println(nome +
                    " emprestou o livro: " +
                    livro.getTitulo());

        } else {

            System.out.println("Livro '" +
                    livro.getTitulo() +
                    "' indisponível.");
        }
    }

    public void devolverLivro(Livro livro) {

        if (livrosEmprestados.contains(livro)) {

            livro.setDisponivel(true);
            livrosEmprestados.remove(livro);

            System.out.println(nome +
                    " devolveu o livro: " +
                    livro.getTitulo());

        } else {

            System.out.println("Esse livro não está com o usuário.");
        }
    }

    public void listarLivrosEmprestados() {

        System.out.println("\nLivros emprestados por " + nome + ":");

        if (livrosEmprestados.isEmpty()) {
            System.out.println("Nenhum livro emprestado.");
        } else {

            for (Livro livro : livrosEmprestados) {
                System.out.println("- " + livro.getTitulo());
            }
        }
    }
}