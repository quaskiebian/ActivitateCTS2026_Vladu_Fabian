package b_2.builder.clase;

public class Rezervare {
    private String numeClient;
    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientala;
    private String genMuzica;

    public Rezervare(RezervareBuilder rezervare) {
        this.numeClient = rezervare.numeClient;
        this.asezareLaGeam = rezervare.asezareLaGeam;
        this.scauneErgonomice = rezervare.scauneErgonomice;
        this.decorareMasa = rezervare.decorareMasa;
        this.muzicaAmbientala = rezervare.muzicaAmbientala;
        this.genMuzica = rezervare.genMuzica;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public boolean isAsezareLaGeam() {
        return asezareLaGeam;
    }

    public boolean isScauneErgonomice() {
        return scauneErgonomice;
    }

    public boolean isDecorareMasa() {
        return decorareMasa;
    }

    public boolean isMuzicaAmbientala() {
        return muzicaAmbientala;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", asezareLaGeam=").append(asezareLaGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", muzicaAmbientala=").append(muzicaAmbientala);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class RezervareBuilder implements AbstractBuilder {
        private String numeClient;
        private boolean asezareLaGeam;
        private boolean scauneErgonomice;
        private boolean decorareMasa;
        private boolean muzicaAmbientala;
        private String genMuzica;

        public RezervareBuilder(String numeClient) {
            this.numeClient = numeClient;
            this.asezareLaGeam = false;
            this.scauneErgonomice = false;
            this.decorareMasa = false;
            this.muzicaAmbientala = false;
            this.genMuzica = "";
        }

        public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam) {
            this.asezareLaGeam = asezareLaGeam;
            return this;
        }

        public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
            this.scauneErgonomice = scauneErgonomice;
            return this;
        }

        public RezervareBuilder setDecorareMasa(boolean decorareMasa) {
            this.decorareMasa = decorareMasa;
            return this;
        }

        public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
            this.muzicaAmbientala = muzicaAmbientala;
            return this;
        }

        public RezervareBuilder setGenMuzica(String genMuzica) {
            this.genMuzica = genMuzica;
            return this;
        }

        @Override
        public Rezervare build() {
            return new Rezervare(this);
        }
    }
}
