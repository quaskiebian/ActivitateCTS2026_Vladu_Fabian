package builder2.clase;

import builder1.clase.AbstractBuilder;

public interface AbstractBuilder2 {
    Internare build(String nume);
    AbstractBuilder2 setPatRabatabil(boolean patRabatabil);
    AbstractBuilder2 setHalatInterior(boolean halatInterior);
    AbstractBuilder2 setMicDejunInclus(boolean micDejunInclus);
    AbstractBuilder2 setPapuciCamera(boolean papuciCamera);
}
