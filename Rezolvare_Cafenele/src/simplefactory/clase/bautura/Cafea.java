package simplefactory.clase.bautura;

import java.sql.SQLOutput;

public class Cafea implements Bautura {
    private String nume;
    private float volum;
    private float pret;

    public Cafea(String nume, float volum, float pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getVolum() {
        return volum;
    }

    public void setVolum(float volum) {
        this.volum = volum;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cafea{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaComanda() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comanda de cafea a fost plasata de: ");
        sb.append(this.nume);
        sb.append(" si are volumul de: ");
        sb.append(this.volum);
        sb.append(" si a costat: " );
        sb.append(this.pret);
        System.out.println(sb.toString());
    }
}
