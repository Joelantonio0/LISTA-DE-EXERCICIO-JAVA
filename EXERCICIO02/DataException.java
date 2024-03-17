

/**
 * Uma exceção personalizada para representar erros relacionados a dados em operações de manipulação de datas.
 * @author Joel António
 * @version 1.0
 */
public class DataException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * Construtor que cria uma nova instância de DataException com uma mensagem específica de erro.
     * 
     * @param mensagem a mensagem que descreve o erro
     */
    public DataException(String mensagem) {
        super(mensagem);
    }
}
