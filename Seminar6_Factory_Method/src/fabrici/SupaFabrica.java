package fabrici;

import clase.Ciorba;
import clase.FelDeMancare;
import clase.SupaCrema;

public class SupaFabrica implements FelDeMancareFabrica {
    public FelDeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj, String denumire, int calorii) {
        return this.getFelDeMancare(tipFelDeMancare,gramaj,denumire);
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj, String denumire) {
        if (tipFelDeMancare.equals(TipSupa.SUPA_CREMA)) {
            return new SupaCrema(gramaj, denumire);
        } else if (tipFelDeMancare.equals(TipSupa.CIORBA)) {
            return new Ciorba(gramaj, denumire);
        }
        return null;
        }
}
