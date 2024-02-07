import fr.morin.horloge.*;
public class Main {
    public static void main(String[] args) {
        HeureMinute H1 = null;
        try {
            H1 = new HeureMinute((byte) 23, (byte) 34);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        HeureMinute H2 = null;
        try {
            H2 = new HeureMinute();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(H1);
        System.out.println(H2);

        try {
            H1.setHeureMinute(15,10);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(H1);

        //H1.setHeureMinute(-34,62);
        H1.avancerMinute(30);

        System.out.println(H1);

        //H1.setMinute(-56);
        H1.avancerMinute(30);

        System.out.println(H1);

        H1.avancerMinute(-30);

        System.out.println(H1);
    }
}