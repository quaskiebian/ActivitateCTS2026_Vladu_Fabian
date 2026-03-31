package singleton.main;

import simplefactory.clase.bautura.Bautura;
import simplefactory.clase.bautura.Ceai;
import simplefactory.clase.factory.Factory;
import simplefactory.clase.factory.TipBautura;
import singleton.clase.CasaDeMarcat;

public class Main {
    public static void main(String[] args) {
        Factory fabrica = new Factory();
        CasaDeMarcat comanda1 = CasaDeMarcat.getInstanta();
        comanda1.adaugaBautura(fabrica.getBautura(TipBautura.CAFEA,"Tyson",300,40));
        comanda1.adaugaBautura(fabrica.getBautura(TipBautura.CEAI,"John",350,30));

        comanda1.afiseazaComanda();
        comanda1.calculeazaPret();
    }
}
