package Es2;

import java.util.Scanner;

public class Automobile {
    private int distanza;
    private int litri;

    public Automobile() {
    }

    public double divisione() {
        if (litri == 0) {
            throw new ArithmeticException("Non è possibile la divisione per 0");
        }
        return (double) distanza / litri;
    }

    public void rapporto()  {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Inserisci la distanza in km percorsa: ");
            distanza = myScanner.nextInt();
            System.out.println("Inserisci il consume do benzina in litri: ");
            litri = myScanner.nextInt();
            double rapporto = divisione();
            System.out.println("Il rapporto è di "+  rapporto);
        } catch (ArithmeticException e) {
            System.err.println("Errore "+ e.getMessage());
        }
    }
}
