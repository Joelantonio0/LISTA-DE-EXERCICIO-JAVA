/**
 * @author Joel António
 * @version 1.0
 * Representa um génio que concede desejos.
 */
public interface Genie {
    /**
     * Concede um desejo.
     * @return true se o desejo foi concedido, caso contrário false
     */
    boolean grantWish();

    /**
     * Obtém o número de desejos concedidos por este génio.
     * @return O número de desejos concedidos por este génio
     */
    int getGrantedWishes();
}

