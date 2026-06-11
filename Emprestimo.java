package Biblioteca;

public class Emprestimo {

    public static void main(String[] args) {

        Livro livro1 = new Livro("Java Básico", "Deitel");
        Livro livro2 = new Livro("POO em Java", "Caelum");
        Livro livro3 = new Livro("Estruturas de Dados", "Loiane");

        Usuario usuario = new Usuario("Tharso");

        System.out.println("=== SISTEMA DE BIBLIOTECA ===\n");

        usuario.emprestarLivro(livro1);
        usuario.emprestarLivro(livro2);

        usuario.listarLivrosEmprestados();

        System.out.println();

        usuario.emprestarLivro(livro1);

        System.out.println();

        usuario.devolverLivro(livro1);

        System.out.println();

        usuario.listarLivrosEmprestados();

        System.out.println();

        livro3.exibirInformacoes();
    }
}