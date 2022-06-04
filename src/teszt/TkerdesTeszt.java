package teszt;

import modell.TKerdes;

public class TkerdesTeszt {

    public static void main(String[] args) {
        new TkerdesTeszt().kiirTeszt(2);
    }

    public void kiirTeszt(int valasz) {
        TKerdes kerdes = new TKerdes(valasz);
        String eredmeny = kerdes.valasz();
        assert eredmeny.equals("Helyes") : "Nem jó a válasz ellenőrzése";
        
    }

}
