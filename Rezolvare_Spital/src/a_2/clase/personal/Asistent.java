package a_2.clase.personal;

public class Asistent implements PersonalSpital {
    private String nume;

    public Asistent(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("Asistentul: ");
        sb.append(this.nume);
        System.out.println(sb.toString());
    }
}
