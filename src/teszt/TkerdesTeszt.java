package teszt;

import modell.TKerdes;

public class TkerdesTeszt {

    private static int tesztSzam = 2;
    
    public static void main(String[] args) {
        new TkerdesTeszt().kiirTeszt(tesztSzam);
    }

    public void kiirTeszt(int valasz) {
        TKerdes kerdes = new TKerdes(valasz);
        String eredmeny = kerdes.valasz(tesztSzam);
        assert eredmeny.equals("Helyes") : "Nem jó a válasz ellenőrzése";
        
    }

}
