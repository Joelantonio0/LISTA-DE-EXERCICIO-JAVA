/**
 * @author Joel António
 * @version 1.0
 * Representa um demónio reciclável que concede todos os desejos e pode ser reciclado.
 */
public class RecyclableDemon implements Genie {
    private boolean recycled; // Indica se o demónio foi reciclado
    private int grantedWishes; // O número de desejos concedidos por este demónio

    /**
     * Construtor da classe RecyclableDemon.
     */
    public RecyclableDemon() {
        this.recycled = false;
        this.grantedWishes = 0;
    }

    /**
     * Concede um desejo.
     * @return true se o desejo foi concedido, caso contrário false
     */
    public boolean grantWish() {
        grantedWishes++;
        return true;
    }

    /**
     * Recicla o demónio, tornando-o incapaz de conceder mais desejos.
     */
    public void recycle() {
        recycled = true;
    }

    /**
     * Verifica se o demónio foi reciclado.
     * @return true se o demónio foi reciclado, caso contrário false
     */
    public boolean recycled() {
        return recycled;
    }

    /**
     * Obtém o número de desejos concedidos por este demónio.
     * @return O número de desejos concedidos por este demónio
     */
    public int getGrantedWishes() {
        return grantedWishes;
    }

    /**
     * Retorna uma representação em formato de string deste demónio.
     * @return A representação em formato de string deste demónio
     */
    public String toString() {
        return recycled ? "O demónio foi reciclado." : "O demónio reciclável concedeu " + grantedWishes + " desejos.";
    }
}
