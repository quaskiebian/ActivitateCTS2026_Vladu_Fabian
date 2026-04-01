package fabrici;

import clase.FelDeMancare;

public interface FelDeMancareFabrica {
    public FelDeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj, String denumire, int calorii);

    public FelDeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj,String denumire);

}
