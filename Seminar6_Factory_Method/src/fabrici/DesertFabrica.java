package fabrici;

import clase.FelDeMancare;
import clase.Papanasi;
import clase.Placinta;

public class DesertFabrica implements FelDeMancareFabrica {
    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj, String denumire, int calorii) {
        if (tipFelDeMancare.equals(TipDesert.PAPANASI)) {
            return new Papanasi(gramaj, denumire, calorii);
        }
        else if (tipFelDeMancare.equals(TipDesert.PLACINTA)) {
            return new Placinta(gramaj, denumire, calorii);
        }
        return null;
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj, String denumire) {
        return this.getFelDeMancare(tipFelDeMancare,gramaj,denumire,500);
    }
}
