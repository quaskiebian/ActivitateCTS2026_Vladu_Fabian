package a_2.main;

import a_2.clase.personal.PersonalSpital;
import a_2.clase.simpleFactory.Factory;
import a_2.clase.simpleFactory.TipPersonal;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        PersonalSpital p1 = factory.getPersonal(TipPersonal.ASISTENT, "Marius");
        PersonalSpital p2 = factory.getPersonal(TipPersonal.MEDIC, "Arin");
        PersonalSpital p3 = factory.getPersonal(TipPersonal.BRANCARDIER, "Elvis");

        p1.afiseazaDetalii();
        p2.afiseazaDetalii();
        p3.afiseazaDetalii();
    }
}
