/**
 * @author Joel António
 * @version 1.0
 * Representa um génio bem-humorado que concede todos os desejos.
 */
public class FriendlyGenie implements Genie {
    private int totalWishes;   // O número total de desejos que este génio pode conceder
    private int grantedWishes; // O número de desejos já concedidos por este génio

    /**
     * Construtor da classe FriendlyGenie.
     * @param totalWishes O número total de desejos que este génio pode conceder
     */
    public FriendlyGenie(int totalWishes) {
        this.totalWishes = totalWishes;
        this.grantedWishes = 0;
    }

    /**
     * Concede um desejo.
     * @return true se o desejo foi concedido, caso contrário false
     */
    public boolean grantWish() {
        if (grantedWishes < totalWishes) {
            grantedWishes++;
            return true;
        }
        return false;
    }

    /**
     * Obtém o número de desejos concedidos por este génio.
     * @return O número de desejos concedidos por este génio
     */
    public int getGrantedWishes() {
        return grantedWishes;
    }

    /**
     * Obtém o número de desejos restantes que este génio pode conceder.
     * @return O número de desejos restantes que este génio pode conceder
     */
    public int getRemainingWishes() {
        return totalWishes - grantedWishes;
    }

    /**
     * Verifica se ainda é possível conceder desejos.
     * @return true se ainda é possível conceder desejos, caso contrário false
     */
    public boolean canGrantWish() {
        return grantedWishes < totalWishes;
    }

    /**
     * Retorna uma representação em formato de string deste génio.
     * @return A representação em formato de string deste génio
     */
    public String toString() {
        return "O génio bem-humorado concedeu " + grantedWishes + " desejos e ainda pode conceder " + (totalWishes - grantedWishes) + ".";
    }
}
