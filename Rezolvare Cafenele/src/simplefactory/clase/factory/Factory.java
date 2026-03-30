package simplefactory.clase.factory;

import simplefactory.clase.bautura.Bautura;
import simplefactory.clase.bautura.Cafea;
import simplefactory.clase.bautura.Ceai;
import simplefactory.clase.bautura.CiocolataCalda;

public class Factory {
    public Bautura getBautura(TipBautura tip, String nume, float volum, float pret) {
        switch (tip) {
            case CAFEA -> {
                return new Cafea(nume, volum, pret);
            }
            case CEAI -> {
                return new Ceai(nume, volum, pret);
            }
            case CIOCOLATA_CALDA -> {
                return new CiocolataCalda(nume, volum, pret);
            }
            default -> {
                return null;
            }
        }

    }
}
