package a_2.clase.simpleFactory;

import a_2.clase.personal.Asistent;
import a_2.clase.personal.Brancardier;
import a_2.clase.personal.Medic;
import a_2.clase.personal.PersonalSpital;

public class Factory {
    public PersonalSpital getPersonal(TipPersonal tip,String nume) {
        switch (tip) {
            case BRANCARDIER -> {
                return new Brancardier(nume);
            }
            case ASISTENT -> {
                return new Asistent(nume);
            }
            case MEDIC -> {
                return new Medic(nume);
            }
            default -> {
                return null;
            }
        }
    }
}