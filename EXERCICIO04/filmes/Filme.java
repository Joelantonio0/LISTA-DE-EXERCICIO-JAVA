package filmes;

/**
 * @author Joel António
 * @version 1.0
 * Classe para representar um filme com título e duração em minutos.
 */
public class Filme {
    // Atributos privados da classe Filme
    private String titulo; // Título do filme
    private int duracaoEmMinutos; // Duração do filme em minutos
    
    /**
     * Construtor que cria um filme com título e duração em minutos especificados.
     *
     * @param titulo            O título do filme.
     * @param duracaoEmMinutos A duração do filme em minutos.
     */
    public Filme(String titulo, int duracaoEmMinutos) {
        super(); // Chamada ao construtor da classe pai (nesse caso, Object)
        this.titulo = titulo; // Inicialização do atributo título
        this.duracaoEmMinutos = duracaoEmMinutos; // Inicialização do atributo duracaoEmMinutos
    }
    
    /**
     * Construtor padrão que cria um filme sem título e duração.
     */
    public Filme() {
        // Construtor padrão não faz nada aqui, mas poderia ser utilizado para inicializações adicionais
    }
    
    /**
     * Método para obter o título do filme.
     *
     * @return O título do filme.
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Define o título do filme.
     *
     * @param titulo O título do filme.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * Método para obter a duração do filme em minutos.
     *
     * @return A duração do filme em minutos.
     */
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    
    /**
     * Define a duração do filme em minutos.
     *
     * @param duracaoEmMinutos A duração do filme em minutos.
     */
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    
    /**
     * Calcula a duração do filme em horas e minutos.
     *
     * @return Uma string formatada com a duração do filme.
     */
    public String duracaoEmHoras(){
        // Cálculo da quantidade de horas
        int horas = this.getDuracaoEmMinutos() / 60;
        int minutos = this.getDuracaoEmMinutos() % 60;
        return "O filme " + this.getTitulo() + " possui " + horas + " horas e " + minutos + " minutos de duração.";
    }
}
