package filmes;

/**
 * @author Joel António
 * @version 1.0
 * Classe de teste para a classe Filme.
 */
public class TestarFilme {

    /**
     * Método principal que testa a funcionalidade da classe Filme.
     *
     * @param args Os argumentos da linha de comando (não utilizados neste caso).
     */
    public static void main(String[] args) {
    	System.out.println("================================");
        // Instância do filme 1
        Filme filme1 = new Filme();
        filme1.setTitulo("Os Vingadores");
        filme1.setDuracaoEmMinutos(142);
        System.out.println(filme1.duracaoEmHoras());

        System.out.println("================================");
        // Instância do filme 2
        Filme filme2 = new Filme();
        filme2.setTitulo("Hotel Transilvânia");
        filme2.setDuracaoEmMinutos(93);
        System.out.println(filme2.duracaoEmHoras());
        System.out.println("================================");
        System.out.println("================================");
        // Exibição dos filmes em cartaz
        System.out.println("Os filmes em cartaz são: " + filme1.getTitulo() + " e " + filme2.getTitulo());
        System.out.println("================================");
        System.out.println("================================");
        // Instância do filme 3
        Filme filme3 = new Filme();
        filme3.setTitulo("Star Wars: O Despertar da Força");
        filme3.setDuracaoEmMinutos(135);
        System.out.println(filme3.duracaoEmHoras());
        System.out.println("================================");
        // Instância do filme 4
        Filme filme4 = new Filme();
        filme4.setTitulo("Jurassic Park");
        filme4.setDuracaoEmMinutos(127);
        System.out.println(filme4.duracaoEmHoras());
        System.out.println("================================");
        // Instância do filme 5
        Filme filme5 = new Filme();
        filme5.setTitulo("O Senhor dos Anéis: A Sociedade do Anel");
        filme5.setDuracaoEmMinutos(178);
        System.out.println(filme5.duracaoEmHoras());
        System.out.println("================================");
        // Instância do filme 6
        Filme filme6 = new Filme();
        filme6.setTitulo("O Poderoso Chefão");
        filme6.setDuracaoEmMinutos(175);
        System.out.println(filme6.duracaoEmHoras());
        System.out.println("================================");
        // Instância do filme 7
        Filme filme7 = new Filme();
        filme7.setTitulo("Harry Potter e a Pedra Filosofal");
        filme7.setDuracaoEmMinutos(152);
        System.out.println(filme7.duracaoEmHoras());
        System.out.println("================================");
    }
}
