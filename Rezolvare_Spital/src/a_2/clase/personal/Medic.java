package a_2.clase.personal;

public class Medic implements PersonalSpital {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("Medicul: ");
        sb.append(this.nume);
        System.out.println(sb.toString());
    }
}
