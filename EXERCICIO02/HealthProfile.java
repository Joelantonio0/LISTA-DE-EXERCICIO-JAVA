
import java.time.LocalDate;
/**
 * Classe que representa o perfil de saúde de uma pessoa, realiza-se calculos da idade em anos, frequências alvo e máximo, IMC
 * @author Joel António
 * @version 1.0
 */
public class HealthProfile {
    private String nome;
    private String sobrenome;
    private Genero genero;
    /**Atributo do objecto*/
    public static DataNascimento dataNascimento;
    private float altura;
    private float peso;
    /**
     * Construtor padrão da classe HeartProfile
     */
    public HealthProfile() {

    }

    /**
     * Construtor da classe HeartProfile que inicializa todos os atributos da classe
     * 
     * @param n o nome da pessoa
     * @param s o sobrenome da pessoa
     * @param d a data de nascimento da pessoa
     * @param g o genero da pessoa
     * @param al a altura da pessoa
     * @param pe o peso da pessoa
     */
    public HealthProfile(String n, String s, DataNascimento d, Genero g, float al, float pe) {
        this.nome = n;
        this.sobrenome = s;
        dataNascimento = d;
        this.genero = g;
        this.altura=al;
        this.peso=pe;
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
     * Método para obter a altura da pessoa.
     * 
     * @return altura, do tipo float.
     */
    public float getAltura(){
        return this.altura;
    }
    /**
     * Método para definir a altura.
     * 
     * @param al a altura 
     */
    public void setAltura(float al){
        this.altura=al;
    }
    /**
     * Método para obter o peso da pessoa.
     * 
     * @return peso, do tipo float.
     */
    public float getPeso(){
        return this.peso;
    }
    /**
     * Método para definir o peso.
     * 
     * @param pe o peso
     */
    public void setPeso(float pe){
        this.peso=pe;
    }
    /**
     * Método para obter o genero.
     * 
     * @return genero, é um enum com três possíveis valores(MASCULINO, FEMENINO, OUTRO).
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * Método para definir o genero.
     * 
     * @param genero valor do genero
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * Método para calcular a idade da pessoa em anos.
     * Foi usado o LocalDate para pegar a data actual
     * @return a idade da pessoa em anos
     */
    public int calcularIdadeEmAnos() {
        LocalDate dataActual = LocalDate.now();
        int ano = dataActual.getYear();
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
    /**
     * Método para calcular o IMC
     * @return o IMC pelo cálculo envolvendo o peso e o dobro da altura e dividindo ambas
     */
    public float calcularIMC(){
        return peso/(altura*altura);
    }

}
