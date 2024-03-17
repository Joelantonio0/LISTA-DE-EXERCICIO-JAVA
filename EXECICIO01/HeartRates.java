import java.time.LocalDate;
/**
 * @author Joel António
 * @version 1.0
 * Classe que representa a frequência cardíaca de uma pessoa.
 */
public class HeartRates {
    private String nome;
    private String sobrenome;
    public static DataNascimento dataNascimento;

    /**
     * Construtor padrão da classe HeartRates.
     */
    public HeartRates() {

    }

    /**
     * Construtor da classe HeartRates que inicializa os atributos nome, sobrenome e data de nascimento.
     * 
     * @param n o nome da pessoa
     * @param s o sobrenome da pessoa
     * @param d a data de nascimento da pessoa
     */
    public HeartRates(String n, String s, DataNascimento d) {
        this.nome = n;
        this.sobrenome = s;
        dataNascimento = d;
    }

    /**
     * Construtor da classe HeartRates que inicializa os atributos nome e data de nascimento.
     * 
     * @param n o nome da pessoa
     * @param d a data de nascimento da pessoa
     */
    public HeartRates(String n, DataNascimento d) {
        this.nome = n;
        dataNascimento = d;
    }

    /**
     * Método para obter o nome da pessoa.
     * 
     * @return o nome da pessoa
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Método para definir o nome da pessoa.
     * 
     * @param n o nome da pessoa
     */
    public void setNome(String n) {
        this.nome = n;
    }

    /**
     * Método para obter o sobrenome da pessoa.
     * 
     * @return o sobrenome da pessoa
     */
    public String getSobrenome() {
        return this.sobrenome;
    }

    /**
     * Método para definir o sobrenome da pessoa.
     * 
     * @param s o sobrenome da pessoa
     */
    public void setSobrenome(String s) {
        this.sobrenome = s;
    }

    /**
     * Método para calcular a idade da pessoa em anos.
     * 
     * @return a idade da pessoa em anos
     */
    public int calcularIdadeEmAnos() {
        LocalDate dataAtual = LocalDate.now();
        int ano = dataAtual.getYear();
        return ano - dataNascimento.getAno();
    }

    /**
     * Método para calcular a frequência cardíaca máxima da pessoa.
     * 
     * @return a frequência cardíaca máxima da pessoa
     */
    public int calcularFrenquenciaCardMax() {
        return 220 - calcularIdadeEmAnos();
    }

    /**
     * Método para calcular a frequência cardíaca alvo da pessoa com base em uma porcentagem fornecida.
     * 
     * @param percentagem a porcentagem desejada para calcular a frequência cardíaca alvo
     * @return a frequência cardíaca alvo da pessoa
     */
    public int calcularFrequenciaCardAlvo(int percentagem) {
        return calcularFrenquenciaCardMax() * percentagem / 100;
    }

}
