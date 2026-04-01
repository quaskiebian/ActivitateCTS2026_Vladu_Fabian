package main;

import clase.FelDeMancare;
import fabrici.*;


public class Main {
    public static void main(String[] args) {
        FelDeMancareFabrica fabrica = new SupaFabrica();
        FelDeMancare supaCrema=fabrica.getFelDeMancare(TipSupa.SUPA_CREMA,500,"Supa morcovi");
        FelDeMancare ciorba=fabrica.getFelDeMancare(TipSupa.CIORBA,400,"ciroba de perisoare");

        FelDeMancareFabrica fabrica2=new DesertFabrica();
        FelDeMancare papanasi=fabrica2.getFelDeMancare(TipDesert.PAPANASI,400," dulceata",600);
        FelDeMancare placinta=fabrica2.getFelDeMancare(TipDesert.PLACINTA,500,"sarbeasca",200);

        supaCrema.afiseaza();
        ciorba.afiseaza();
        papanasi.afiseaza();
        placinta.afiseaza();
    }
}