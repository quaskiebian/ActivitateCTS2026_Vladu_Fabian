package clase;

import java.util.Arrays;

public class Angajat extends clase.Aplicant {
    private String ocupatie;
    private int salariu;
    private static float sumaFinantata=10;

    public static float getSumaFinantata() {
        return sumaFinantata;
    }

    public static void setSumaFinantata(float sumaFinantata) {
        Angajat.sumaFinantata = sumaFinantata;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Angajat() {
        super();

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Angajat{");
        sb.append(super.toString());
        sb.append("ocupatie='").append(ocupatie).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }

    public void afisareVenit() {
        System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+Angajat.sumaFinantata+" Euro/zi in proiect.");
    }

}
