/**
 * @author Joel António
 * @version 1.0
 * Representa uma lâmpada mágica que libera génios quando esfregada.
 */
public class MagicLamp {
    private int geniesCapacity; // Capacidade total de génios da lâmpada
    private int geniesCount;    // Número atual de génios disponíveis na lâmpada
    private int demonsCount;    // Número de vezes que demónios foram liberados da lâmpada

    /**
     * Construtor da classe MagicLamp.
     * @param geniesCapacity A capacidade total de génios que a lâmpada pode liberar
     */
    public MagicLamp(int geniesCapacity) {
        this.geniesCapacity = geniesCapacity;
        this.geniesCount = geniesCapacity; // Inicializa o número atual de génios disponíveis com a capacidade total
        this.demonsCount = 0; // Inicializa o contador de demónios como 0
    }

    /**
     * Esfrega a lâmpada para liberar um génio.
     * @param numberOfWishes O número de desejos que se espera que o génio realize
     * @return O génio ou demónio liberado da lâmpada
     */
    public Genie rub(int numberOfWishes) {
        if (geniesCount > 0) {
            geniesCount--; // Decrementa o número de génios disponíveis na lâmpada
            return new FriendlyGenie(numberOfWishes); // Retorna um génio bem-humorado
        } else {
            demonsCount++; // Incrementa o número de demónios liberados quando não há génios disponíveis
            return new RecyclableDemon(); // Retorna um demónio reciclável
        }
    }

    /**
     * Alimenta o demónio reciclável à lâmpada.
     * @param demon O demónio reciclável a ser alimentado à lâmpada
     */
    public void feedDemon(RecyclableDemon demon) {
        if (demon.recycled()) {
            demonsCount--; // Decrementa o número de demónios quando um demónio reciclável é alimentado à lâmpada
        }
    }

    /**
     * Obtém o número atual de génios disponíveis na lâmpada.
     * @return O número atual de génios disponíveis na lâmpada
     */
    public int getGenies() {
        return geniesCount;
    }

    /**
     * Obtém o número de vezes que demónios foram liberados da lâmpada.
     * @return O número de vezes que demónios foram liberados da lâmpada
     */
    public int getDemons() {
        return demonsCount;
    }

    /**
     * Compara esta lâmpada com outra para verificar se são iguais.
     * @param obj A lâmpada a ser comparada
     * @return true se as lâmpadas forem iguais, caso contrário false
     */
    public boolean equals(Object obj) {
        if (obj instanceof MagicLamp) {
            MagicLamp other = (MagicLamp)obj;
            return this.geniesCapacity == other.geniesCapacity &&
                   this.geniesCount == other.geniesCount &&
                   this.demonsCount == other.demonsCount;
        }
        return false;
    }
}
