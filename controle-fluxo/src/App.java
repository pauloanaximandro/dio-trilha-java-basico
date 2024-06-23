import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Object aPause = new Object();

        do {
            
            System.out.println("Telefone tocando...");
            synchronized(aPause) {
                aPause.wait(1000);
            }


        } while (tocando());

        System.out.println("Alô?");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
    }
}
