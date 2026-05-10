package b_5.adapter;

import b_5.clase.SoftNou;
import b_5.clase.SoftPrintare;

public class AdapterSoft extends SoftPrintare {
    private SoftNou softNou;

    public AdapterSoft(SoftNou softNou) {
        this.softNou = softNou;
    }

    @Override
    public void printeazaFactura() {
        softNou.afiseazaMesaj();
    }
}
