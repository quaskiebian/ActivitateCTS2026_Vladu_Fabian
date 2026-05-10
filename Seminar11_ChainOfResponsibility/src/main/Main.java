package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler troleibuz=new CalatorieTroleibuz();
        CalatorieHandler autobuz=new CalatorieAutobuz();
        CalatorieHandler tramvai=new CalatorieTramvai();
        CalatorieHandler metrou=new CalatorieMetrou();

        troleibuz.setSuccesor(autobuz);
        autobuz.setSuccesor(tramvai);
        tramvai.setSuccesor(metrou);

        System.out.println(troleibuz.recomandaMijlocDeTransport(2));
        System.out.println(troleibuz.recomandaMijlocDeTransport(4));
        System.out.println(troleibuz.recomandaMijlocDeTransport(8));
        System.out.println(troleibuz.recomandaMijlocDeTransport(12));

    }
}