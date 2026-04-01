package builder3.clase;

import builder1.clase.InternareBuilder;

public class Internare {
    private String numePacient;
    private boolean patRabatabil;
    private boolean micDejunInclus;

    public Internare(InternareBuilder builder) {
        this.numePacient = builder.numePacient;
        this.patRabatabil = builder.patRabatabil;
        this.micDejunInclus = builder.micDejunInclus;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    public boolean isMicDejunInclus() {
        return micDejunInclus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", patRabatabil=").append(patRabatabil);
        sb.append(", micDejunInclus=").append(micDejunInclus);
        sb.append('}');
        return sb.toString();
    }

    public static class InternareBuilder implements AbstractBuilder3 {
        private String numePacient;
        private boolean patRabatabil;
        private boolean micDejunInclus;

        public InternareBuilder setNumePacient(String numePacient) {
            this.numePacient = numePacient;
            return this;
        }

        public InternareBuilder setPatRabatabil(boolean patRabatabil) {
            this.patRabatabil = patRabatabil;
            return this;
        }

        public InternareBuilder setMicDejunInclus(boolean micDejunInclus) {
            this.micDejunInclus = micDejunInclus;
            return this;
        }

        @Override
        public Internare build() {
            return new Internare(this);
        }
    }
}
