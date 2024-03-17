/**
 * @author Joel António
 * @version 1.0
 * Representa um génio mal-humorado que concede apenas o primeiro desejo.
 */
public class GrumpyGenie implements Genie {
    private boolean wishGranted; // Indica se o desejo foi concedido ou não

    /**
     * Construtor da classe GrumpyGenie.
     */
    public GrumpyGenie() {
        this.wishGranted = false;
    }

    /**
     * Concede um desejo.
     * @return true se o desejo foi concedido, caso contrário false
     */
    public boolean grantWish() {
        if (!wishGranted) {
            wishGranted = true;
            return true;
        }
        return false;
    }

    /**
     * Obtém o número de desejos concedidos por este génio.
     * @return O número de desejos concedidos por este génio (1 se concedido, 0 se não concedido)
     */
    public int getGrantedWishes() {
        return wishGranted ? 1 : 0;
    }

    /**
     * Retorna uma representação em formato de string deste génio.
     * @return A representação em formato de string deste génio
     */
    public String toString() {
        return wishGranted ? "O génio mal-humorado concedeu um desejo." : "O génio mal-humorado tem um desejo para conceder.";
    }
}
