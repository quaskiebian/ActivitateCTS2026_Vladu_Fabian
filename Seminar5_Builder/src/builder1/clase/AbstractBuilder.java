package builder1.clase;

public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNumePacient(String numePacient);
    AbstractBuilder setPatRabatabil(boolean patRabatabil);
    AbstractBuilder setMicDejunInclus(boolean micDejunInclus);
    AbstractBuilder setPapuciCamera(boolean papuciCamera);
    AbstractBuilder setHalatInterior(boolean halatInterior);
}
