package b_2.builder.main;


import b_2.builder.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare.RezervareBuilder("Popa Andrei")
                .setAsezareLaGeam(true)
                .setDecorareMasa(true)
                .build();

        Rezervare rezervare2 = new Rezervare.RezervareBuilder("Florinel Coman")
                .setAsezareLaGeam(true)
                .setMuzicaAmbientala(true)
                .setGenMuzica("Jazz")
                .build();

        Rezervare rezervare3 = new Rezervare.RezervareBuilder("Florin Petcu")
                .build();

        System.out.println(rezervare1);
        System.out.println(rezervare2);
        System.out.println(rezervare3);
    }
}