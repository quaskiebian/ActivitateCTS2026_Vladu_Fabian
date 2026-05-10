package main;

import clase.Medic;
import clase.Pacient;
import clase.Salon;
import facade.SpitalFacade;

public class Main {
    public static void main(String[] args) {

        Pacient pacient=new Pacient("Fabian",7);
        Medic medic=new Medic("Marius");
        Salon salon=Salon.getInstance();


        SpitalFacade spitalFacade=new SpitalFacade(new Medic("Bogdan"), Salon.getInstance());
        spitalFacade.interneazaPacient(pacient);
        Pacient pacient2=new Pacient("Darius",2);
        spitalFacade.interneazaPacient(pacient2);

        Pacient pacient3=new Pacient("Denis",5);
        spitalFacade.interneazaPacient(pacient3);

        Pacient pacient4=new Pacient("Radu",8);
        spitalFacade.interneazaPacient(pacient4);
    }
}