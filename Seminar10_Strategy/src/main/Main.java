package main;

import clase.Client;
import clase.ModalitateDePlata;
import clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Alin");
        client.platesteTranzactie(250);

        ModalitateDePlata modalitate1= new PlataCash(500);
        client.setModalitateDePlata(modalitate1);
        client.platesteTranzactie(100);
        client.platesteTranzactie(50);

    }
}