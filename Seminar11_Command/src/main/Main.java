package main;

import clase.Autobuz;
import clase.Command;
import clase.Operator;
import clase.Plecare;

public class Main {
    public static void main(String[] args) {

        Operator operator=new Operator();
        Autobuz autobuz=new Autobuz("B111FAB");

        Command comanda1=new Plecare(autobuz,221);

        operator.adaugaComanda(comanda1);
        operator.executaComanda();
        operator.adaugaComanda(new Plecare(autobuz,331));
        operator.executaComanda();
        operator.executaComanda();

    }
}