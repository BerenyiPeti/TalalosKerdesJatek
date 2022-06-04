package modell;

public class TKerdes {

    private int valasz;

    public TKerdes(int valasz) {
        this.valasz = valasz;
    }

    public void kiir() {
        System.out.printf("Van előtted 3 láda. Mindegyiken van egy felirat, "
                + "ami mond valamit, de csak az egyik ládának van igaza.\n"
                + "A feladatod, hogy kitaláld, melyik rejti a kincset.\n"
                + "A ládákon ezek állnak:\n");

        System.out.println("");
        System.out.println("1: Arany láda: Bennem van a kincs");
        System.out.println("2: Ezüst láda: Nem én rejtem a kincset");
        System.out.println("3: Bronz láda: Az arany láda hazudik");
    }

    public String valasz(int szam) {
        valasz = szam;
        int joValasz = 2;
        if (valasz == joValasz) {
            return "Helyes";
        } else {
            return "Hibás";

        }
        
    }

}
