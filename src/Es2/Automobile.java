package Es2;

import java.util.Scanner;

public class Automobile {
    private int distanza;
    private int litri;

    public Automobile(int distanza, int litri) {
        this.distanza = distanza;
        this.litri = litri;
    }

    public double divisione(int km, int l) {
        return (double) km / l;
    }

    public void rapporto () throws RapportoException{
        try (Scanner myScanner = new Scanner(System.in)){
            distanza = myScanner.nextInt();
            litri = myScanner.nextInt();
            if (litri != 0){
                divisione(distanza,litri);
            } else {
                System.out.println("Non è possibile calcolare il rapporto.");
            }
        } catch ()
    }
}
