package konzolos_verzio;

import java.util.Scanner;
import modell.TKerdes;

public class Program_konzolon {

    private static int beker;

    public static void main(String[] args) {
        TKerdes kerdes = new TKerdes(1);
        kerdes.kiir();
        Scanner sc = new Scanner(System.in);
        System.out.print("Melyikben van a láda?: ");
        do {
            beker = sc.nextInt();
            if (!(beker >= 1 && beker <= 3)) {
                System.out.print("Nem megfelelő számod adtál meg, kérlek add meg újra: ");
            }
        } while (!(beker >= 1 && beker <= 3));

        System.out.println(kerdes.valasz(beker));
        
    }

}
