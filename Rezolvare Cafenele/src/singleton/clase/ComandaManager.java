package singleton.clase;

import simplefactory.clase.bautura.Bautura;

public interface ComandaManager {
    public void adaugaBautura(Bautura bautura);
    public void afiseazaComanda();
    public void calculeazaPret();
}
