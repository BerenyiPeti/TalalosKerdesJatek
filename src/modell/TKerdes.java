package modell;

public class TKerdes {

    private int valasz;

    public TKerdes() {
        this(1);
    }

    public TKerdes(int valasz) {
        this.valasz = valasz;
    }
    
    public void kiir() {
        System.out.printf("Van előtted 3 láda. Mindegyiken van egy címke, "
                + "ami mond valamit.\n"
                + "A feladatod, hogy kitaláld, melyik rejti a kincset.\n"
                + "A címkéken ezek állnak:\n");
        
        System.out.println("");
        System.out.println("Arany láda: Bennem van a kincs");
        System.out.println("Ezüst láda: Nem én rejtem a kincset");
        System.out.println("Bronz láda: Az arany láda hazudik");
    }

}
