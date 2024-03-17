

/**
 * Classe que representa a data de nascimento de uma pessoa.
 * @author Joel António
 * @version 1.0
 */
public class DataNascimento {
    private int dia;
    private String mes;
    private int ano;
    private String[] meses = {"JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"};

    /**
     * Construtor da classe DataNascimento que inicializa os atributos dia, mês e ano.
     * 
     * @param d o dia de nascimento
     * @param m o mês de nascimento
     * @param a o ano de nascimento
     */
    public DataNascimento(int d, String m, int a) {
        this.setDia(d);
        this.setMes(m);
        this.setAno(a);
    }

    /**
     * Método para obter o dia de nascimento.
     * 
     * @return o dia de nascimento
     */
    public int getDia() {
        return this.dia;
    }

    /**
     * Método para definir o dia de nascimento.
     * 
     * @param d o dia de nascimento
     * @throws DataException se o dia fornecido for inválido
     */
    public void setDia(int d) throws DataException {
        if ((d > 0) && (d < 32))
            this.dia = d;
        else
            throw new DataException("Dia inválido, insira um dia válido");
    }

    /**
     * Método para obter o ano de nascimento.
     * 
     * @return o ano de nascimento
     */
    public int getAno() {
        return this.ano;
    }

    /**
     * Método para definir o ano de nascimento.
     * 
     * @param a o ano de nascimento
     */
    public void setAno(int a) {
        this.ano = a;
    }

    /**
     * Método para obter o mês de nascimento.
     * 
     * @return o mês de nascimento
     */
    public String getMes() {
        return this.mes;
    }

    /**
     * Método para definir o mês de nascimento.
     * 
     * @param m o mês de nascimento
     * @throws DataException se o mês fornecido for inválido
     */
    public void setMes(String m) throws DataException {
    	m = m.toUpperCase();
        if (buscarMes(m))
            this.mes = m;
        else
            throw new DataException("Mês inválido, ou mal escrito. Por favor, analise o que escreveu!!");
    }

    /**
     * Método que retorna a data de nascimento completa (dia, mês e ano).
     * 
     * @return a data de nascimento completa
     */
    public String dataCompleta() {
        return "Dia:" + this.dia + " Mes:" + this.mes + " Ano:" + this.ano;
    }

    /**
     * Método privado para verificar se um determinado mês é válido.
     * 
     * @param mes o mês a ser verificado
     * @return true se o mês for válido, false caso contrário
     */
    protected boolean buscarMes(String mes) {
        for (int i = 0; i < meses.length; i++) {
            if (mes.equals(meses[i]))
                return true;
        }
        return false;
    }
}
