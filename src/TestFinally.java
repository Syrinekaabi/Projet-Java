import java.io.IOException;

public class TestFinally {

    public static void main(String[] args) {
        try {
            System.out.println("Entrez votre code : ");
            int x = System.in.read();
            // Traiter d'autres opérations ici si nécessaire
            System.out.println("Vous avez saisi : " + (char) x);
        } catch (IOException e) {
            System.err.println("Erreur d'entrée/sortie : " + e.getMessage());
        } finally {
            System.out.println("Merci de votre visite");
        }
    }
}





