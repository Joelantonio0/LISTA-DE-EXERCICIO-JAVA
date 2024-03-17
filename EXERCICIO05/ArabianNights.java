// Classe ArabianNights
public class ArabianNights {
    public static void main(String[] args) {
        MagicLamp lamp = new MagicLamp(4);
        
        for (int i = 0; i < 5; i++) {
            Genie genie = lamp.rub(i + 1);
            System.out.println(genie);
        }
        
        for (int i = 0; i < 3; i++) {
            Genie genie = lamp.rub(1);
            System.out.println(genie.grantWish());
        }
        
        for (int i = 0; i < 3; i++) {
            Genie genie = lamp.rub(1);
            System.out.println(genie);
        }
        
        RecyclableDemon demon = new RecyclableDemon();
        lamp.feedDemon(demon);
        
        Genie genie = lamp.rub(7);
        System.out.println(genie);
    }
}

