package builder1.main;


import builder1.clase.AbstractBuilder;
import builder1.clase.Internare;
import builder1.clase.InternareBuilder;

public class Main {
    public static void main(String[] args) {
        Internare internare1 = new Internare();
        internare1.setNumePacient("Kylian Mbappe");
        internare1.setPatRabatabil(true);

        Internare internare2 = new Internare();
        internare2.setNumePacient("Gigi");
        internare2.setPapuciCamera(true);

        AbstractBuilder builder = new InternareBuilder("Gigi");
        Internare internare3 = builder.setPatRabatabil(true).build();
        Internare internare4 = builder.setPapuciCamera(true).setNumePacient("Gigel").build();

        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

    }
}