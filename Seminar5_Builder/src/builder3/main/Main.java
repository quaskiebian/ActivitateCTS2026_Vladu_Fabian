package builder3.main;

import builder3.clase.Internare;

public class Main {
    public static void main(String[] args) {
        Internare internare = new Internare.InternareBuilder()
                .setNumePacient("Gabriel")
                .setMicDejunInclus(true)
                .build();

        System.out.println(internare.toString());
    }
}
