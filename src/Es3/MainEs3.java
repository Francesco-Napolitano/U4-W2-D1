package Es3;

import java.util.Scanner;

public class MainEs3 {
    public static void main (String[] args) throws BancaException {
        ContoCorrente contoCorrente = new ContoCorrente("Fra napo", 70);
        ContoOnLine contoOnLine = new ContoOnLine("Peppe Brescia", 2000, 400);
        System.out.println("Ao, effettua un prelievo sul conto corrente ");
        Scanner myScanner = new Scanner(System.in);
        double prelievo = myScanner.nextDouble();
        contoCorrente.preleva(prelievo);
        System.out.println("Ora preleva sul conto online ");
        double prelievoOnline = myScanner.nextDouble();
        contoOnLine.preleva(prelievoOnline);
    }
}
