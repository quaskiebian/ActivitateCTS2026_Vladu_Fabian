package singleton.clase;

import simplefactory.clase.bautura.Bautura;

import java.util.ArrayList;
import java.util.List;

public class CasaDeMarcat implements ComandaManager {
    private List<Bautura> listaBauturi;
    private static CasaDeMarcat instanta = null;

    private CasaDeMarcat() {
        listaBauturi = new ArrayList<>();
    }

    public static synchronized CasaDeMarcat getInstanta() {
        if(instanta == null) {
            instanta = new CasaDeMarcat();
        }
        return instanta;
    }

    @Override
    public void adaugaBautura(Bautura bautura) {
        this.listaBauturi.add(bautura);
    }

    @Override
    public void afiseazaComanda() {
        for(Bautura bautura : listaBauturi)
            System.out.println(bautura.toString());
    }

    @Override
    public void calculeazaPret() {
        float pret=0;
        for(Bautura bautura : listaBauturi){
            pret += bautura.getPret();
        }
        System.out.println(pret);
    }
}
