package builder2.clase;

import builder1.clase.AbstractBuilder;

public class InternareBuilder2 implements AbstractBuilder2 {
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    public InternareBuilder2() {
        patRabatabil=false;
        micDejunInclus=false;
        papuciCamera=false;
        halatInterior=false;
    }

    @Override
    public AbstractBuilder2 setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder2 setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
        return this;
    }

    @Override
    public AbstractBuilder2 setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
        return this;
    }

    @Override
    public AbstractBuilder2 setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
        return this;
    }

    @Override
    public Internare build(String nume) {
        return new Internare(nume, patRabatabil, micDejunInclus, papuciCamera, halatInterior);
    }

}
