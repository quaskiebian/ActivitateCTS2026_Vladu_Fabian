package a_2.clase.personal;

public class Brancardier implements PersonalSpital {
    private String nume;

    public Brancardier(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("Brancardierul: ");
        sb.append(this.nume);
        System.out.println(sb.toString());
    }
}
