package main;


import clase.mijlocTransport.MijlocDeTransport;
import clase.simpleFactory.Factory;
import clase.simpleFactory.TipMijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        Factory fabricaTransport = new Factory();
        MijlocDeTransport autobuz = fabricaTransport.getMijlocTransport(TipMijlocDeTransport.AUTOBUZ, "AAA", 101);
        autobuz.afiseazaTipTransport();

        MijlocDeTransport tramvai = fabricaTransport.getMijlocTransport(TipMijlocDeTransport.TRAMVAI, "BBB", 54);
        tramvai.afiseazaTipTransport();

        MijlocDeTransport troleibuz = fabricaTransport.getMijlocTransport(TipMijlocDeTransport.TROLEIBUZ, "CCC", 63);
        troleibuz.afiseazaTipTransport();

    }

}