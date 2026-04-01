package builder2.clase;

public class Internare {
    private String numePacient;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    public Internare() {
        numePacient="Marius";
        patRabatabil=false;
        micDejunInclus=false;
        papuciCamera=false;
        halatInterior=false;
    }

    public Internare(String numePacient, boolean patRabatabil, boolean micDejunInclus, boolean papuciCamera, boolean halatInterior) {
        this.numePacient = numePacient;
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciCamera = papuciCamera;
        this.halatInterior = halatInterior;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public void setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    public void setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
    }

    public void setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", patRabatabil=").append(patRabatabil);
        sb.append(", micDejunInclus=").append(micDejunInclus);
        sb.append(", papuciCamera=").append(papuciCamera);
        sb.append(", halatInterior=").append(halatInterior);
        sb.append('}');
        return sb.toString();
    }
}
