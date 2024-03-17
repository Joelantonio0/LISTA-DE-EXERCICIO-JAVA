package livraria;

/**
 * @author Joel António
 * @version 1.0
 * Classe de teste para a classe Livro, criamos 11 instâncias da classe Livro
 */
public class TestarLivros {
    public static void main(String[] args) {
        // Criando um objeto livroFavorito e definindo seu título e quantidade de páginas
        Livro livroFavorito = new Livro();
        livroFavorito.setTitulo("O Pequeno Príncipe");
        livroFavorito.setQtdPaginas(98);
        // Exibindo informações sobre o livroFavorito
        System.out.println("O livro " + livroFavorito.getTitulo() + " tem " + livroFavorito.getQtdPaginas() + " páginas");
        // Definindo a quantidade de páginas lidas e exibindo o progresso da leitura
        livroFavorito.setPaginasLidas(20);
        System.out.println(livroFavorito.verificarProgresso());
        livroFavorito.setPaginasLidas(50);
        System.out.println(livroFavorito.verificarProgresso());

        // Criando 10 objetos Livro
        Livro l1 = new Livro();
        Livro l2 = new Livro();
        Livro l3 = new Livro();
        Livro l4 = new Livro();
        Livro l5 = new Livro();
        Livro l6 = new Livro();
        Livro l7 = new Livro();
        Livro l8 = new Livro();
        Livro l9 = new Livro();
        Livro l10 = new Livro();
        
        // Configurando e exibindo informações sobre cada livro
        System.out.println("====================================================");
        l1.setTitulo("Pai Rico Pai Pobre");
        l1.setQtdPaginas(100);
        System.out.println("O livro " + l1.getTitulo() + " tem " + l1.getQtdPaginas() + " páginas");
        l1.setPaginasLidas(70);
        System.out.println(l1.verificarProgresso());
        l1.setPaginasLidas(20);
        System.out.println(l1.verificarProgresso());
        System.out.println("====================================================");
        l2.setTitulo("O Senhor dos Anéis: A Sociedade do Anel");
        l2.setQtdPaginas(372);
        System.out.println("O livro " + l2.getTitulo() + " tem " + l2.getQtdPaginas() + " páginas");
        l2.setPaginasLidas(100);
        System.out.println(l2.verificarProgresso());
        l2.setPaginasLidas(50);
        System.out.println(l2.verificarProgresso());
        System.out.println("====================================================");
        l3.setTitulo("Harry Potter e a Pedra Filosofal");
        l3.setQtdPaginas(309);
        System.out.println("O livro " + l3.getTitulo() + " tem " + l3.getQtdPaginas() + " páginas");
        l3.setPaginasLidas(30);
        System.out.println(l3.verificarProgresso());
        l3.setPaginasLidas(50);
        System.out.println(l3.verificarProgresso());
        System.out.println("====================================================");
        l4.setTitulo("Cem Anos de Solidão");
        l4.setQtdPaginas(417);
        System.out.println("O livro " + l4.getTitulo() + " tem " + l4.getQtdPaginas() + " páginas");
        l4.setPaginasLidas(200);
        System.out.println(l4.verificarProgresso());
        l4.setPaginasLidas(100);
        System.out.println(l4.verificarProgresso());
        System.out.println("====================================================");
        l5.setTitulo("A Menina que Roubava Livros");
        l5.setQtdPaginas(480);
        System.out.println("O livro " + l5.getTitulo() + " tem " + l5.getQtdPaginas() + " páginas");
        l5.setPaginasLidas(20);
        System.out.println(l5.verificarProgresso());
        l5.setPaginasLidas(150);
        System.out.println(l5.verificarProgresso());
        System.out.println("====================================================");
        l5.setTitulo("Dom Quixote");
        l5.setQtdPaginas(1056);
        System.out.println("O livro " + l5.getTitulo() + " tem " + l5.getQtdPaginas() + " páginas");
        l5.setPaginasLidas(500);
        System.out.println(l5.verificarProgresso());
        l5.setPaginasLidas(150);
        System.out.println(l5.verificarProgresso());
        System.out.println("====================================================");
        l6.setTitulo("Trabalhe 4 horas por semana");
        l6.setQtdPaginas(242);
        System.out.println("O livro " + l6.getTitulo() + " tem " + l6.getQtdPaginas() + " páginas");
        l6.setPaginasLidas(230);
        System.out.println(l6.verificarProgresso());
        l6.setPaginasLidas(10);
        System.out.println(l6.verificarProgresso());
        l6.setPaginasLidas(2);
        System.out.println(l6.verificarProgresso());
        System.out.println("====================================================");
        l7.setTitulo("A Culpa é das Estrelas");
        l7.setQtdPaginas(313);
        System.out.println("O livro " + l7.getTitulo() + " tem " + l7.getQtdPaginas() + " páginas");
        l7.setPaginasLidas(30);
        System.out.println(l7.verificarProgresso());
        l7.setPaginasLidas(100);
        System.out.println(l7.verificarProgresso());
        System.out.println("====================================================");
        l8.setTitulo("1984");
        l8.setQtdPaginas(328);
        System.out.println("O livro " + l8.getTitulo() + " tem " + l8.getQtdPaginas() + " páginas");
        l8.setPaginasLidas(50);
        System.out.println(l8.verificarProgresso());
        l8.setPaginasLidas(200);
        System.out.println(l8.verificarProgresso());
        System.out.println("====================================================");
        l9.setTitulo("Orgulho e Preconceito");
        l9.setQtdPaginas(279);
        System.out.println("O livro " + l9.getTitulo() + " tem " + l9.getQtdPaginas() + " páginas");
        l9.setPaginasLidas(100);
        System.out.println(l9.verificarProgresso());
        l9.setPaginasLidas(150);
        System.out.println(l9.verificarProgresso());
        System.out.println("====================================================");
        l10.setTitulo("A Revolução dos Bichos");
        l10.setQtdPaginas(141);
        System.out.println("O livro " + l10.getTitulo() + " tem " + l10.getQtdPaginas() + " páginas");
        l10.setPaginasLidas(20);
        System.out.println(l10.verificarProgresso());
        l10.setPaginasLidas(70);
        System.out.println(l10.verificarProgresso());
        System.out.println("====================================================");
    }
}