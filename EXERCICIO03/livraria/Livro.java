package livraria;

/**
 * @author Joel António
 * @version 1.0
 * Classe que representa um livro.
 */
public class Livro {
    private String titulo;
    private int qtdPaginas;
    private int paginasLidas;

    /**
     * Construtor padrão.
     */
    public Livro(){
    }

    /**
     * Construtor que inicializa o título e a quantidade de páginas do livro.
     * 
     * @param t O título do livro.
     * @param qtdPag A quantidade total de páginas do livro.
     */
    public Livro(String t, int qtdPag){
        this.titulo = t;
        this.qtdPaginas = qtdPag;
    }

    /**
     * Método que pega o título do livro.
     * 
     * @return O título do livro.
     */
    public String getTitulo(){
        return this.titulo;
    }

    /**
     * Define o título do livro.
     * 
     * @param t O título do livro.
     */
    public void setTitulo(String t){
        this.titulo = t;
    }

    /**
     * Método que pega a quantidade total de páginas do livro.
     * 
     * @return A quantidade total de páginas do livro.
     */
    public int getQtdPaginas(){
        return this.qtdPaginas;
    }

    /**
     * Define a quantidade total de páginas do livro.
     * 
     * @param qtdPag A quantidade total de páginas do livro.
     */
    public void setQtdPaginas(int qtdPag){
        this.qtdPaginas = qtdPag;
    }

    /**
     * Método que pega a quantidade de páginas lidas do livro.
     * 
     * @return A quantidade de páginas lidas do livro.
     */
    public int getPaginasLidas(){
        return this.paginasLidas;
    }

    /**
     * Adiciona o número de páginas lidas ao livro.
     * 
     * @param pagLidas O número de páginas lidas.
     */
    public void setPaginasLidas(int pagLidas){
        this.paginasLidas += pagLidas;
    }

    /**
     * Método para verificar o progresso da leitura do livro baseando-se na quantidade de páginas lidas.
     * 
     * @return Uma mensagem indicando o progresso da leitura.
     */
    public String verificarProgresso() {
        double progresso = (double) this.paginasLidas / this.qtdPaginas * 100;
        if (progresso >= 100) {
            return "Você concluiu a leitura deste livro!";
        } else {
            return "Você leu " + String.format("%.2f", progresso) + "% do livro.";
        }
    }
}

