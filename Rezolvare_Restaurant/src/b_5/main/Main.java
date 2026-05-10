package b_5.main;

import b_5.adapter.AdapterSoft;
import b_5.clase.SoftNou;
import b_5.clase.SoftPrintare;

public class Main {
    public static void realizeazaPrintare(SoftPrintare softPrintare) { softPrintare.printeazaFactura(); }
    public static void main(String[] args) {
        SoftPrintare softPrintare = new SoftPrintare();
        SoftNou softNou = new SoftNou();

        softPrintare.printeazaFactura();
        softNou.afiseazaMesaj();

        realizeazaPrintare(softPrintare);
        AdapterSoft adapterSoft = new AdapterSoft(softNou);
        adapterSoft.printeazaFactura();
    }
}
