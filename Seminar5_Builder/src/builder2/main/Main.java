package builder2.main;

import builder1.clase.AbstractBuilder;
import builder1.clase.Internare;
import builder1.clase.InternareBuilder;
import builder2.clase.AbstractBuilder2;
import builder2.clase.InternareBuilder2;

public class Main {
    public static void main(String[] args) {
        Internare internare1 = new Internare();
        internare1.setNumePacient("Fabian");
        internare1.setPatRabatabil(true);

        Internare internare2 = new Internare();
        internare2.setNumePacient("Vini");
        internare2.setPatRabatabil(true);

        System.out.println(internare1);

        AbstractBuilder builder = new InternareBuilder("Dragos");
        Internare internare3 = builder.setPatRabatabil(true).build();
        Internare internare4 = builder.setPapuciCamera(true).setNumePacient("Daniel").build();

        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        AbstractBuilder2 builder2 = new InternareBuilder2();
        builder2.setMicDejunInclus(true);
        builder2.clase.Internare internare5 = builder2.build("Ion");
        builder2.clase.Internare internare6 = builder2.build("Iulius");

        internare5.setHalatInterior(true);
        System.out.println(internare5.toString());
        System.out.println(internare6.toString());
    }
}
