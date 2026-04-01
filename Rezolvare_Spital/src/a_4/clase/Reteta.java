package a_4.clase;

public class Reteta implements IReteta {
    private String denumireMedicament;
    private float cantitateSolutie1;
    private float cantitateSolutie2;
    private float cantitateSolutie3;

    public Reteta(String denumireMedicament, float cantitateSolutie1, float cantitateSolutie2, float cantitateSolutie3) {
        this.denumireMedicament = denumireMedicament;
        if(cantitateSolutie1 > 0) {
            this.cantitateSolutie1 = cantitateSolutie1;
        }
        else {
            this.cantitateSolutie1 = 0;
        }
        if(cantitateSolutie2 > 0) {
            this.cantitateSolutie2 = cantitateSolutie2;
        }
        else {
            this.cantitateSolutie2 = 0;
        }
        if(cantitateSolutie3 > 0) {
            this.cantitateSolutie3 = cantitateSolutie3;
        }
        else {
            this.cantitateSolutie3 = 0;
        }
    }

    public Reteta() {
    }

    @Override
    public IReteta clonare() {
        Reteta reteta = new Reteta();
        reteta.denumireMedicament = this.denumireMedicament;
        reteta.cantitateSolutie1 = this.cantitateSolutie1;
        reteta.cantitateSolutie2 = this.cantitateSolutie2;
        reteta.cantitateSolutie3 = this.cantitateSolutie3;
        return reteta;
    }

    public void setDenumireMedicament(String denumireMedicament) {
        this.denumireMedicament = denumireMedicament;
    }

    public void setCantitateSolutie1(float cantitateSolutie1) {
        this.cantitateSolutie1 = cantitateSolutie1;
    }

    public void setCantitateSolutie2(float cantitateSolutie2) {
        this.cantitateSolutie2 = cantitateSolutie2;
    }

    public void setCantitateSolutie3(float cantitateSolutie3) {
        this.cantitateSolutie3 = cantitateSolutie3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumireMedicament='").append(denumireMedicament).append('\'');
        sb.append(", cantitateSolutie1=").append(cantitateSolutie1);
        sb.append(", cantitateSolutie2=").append(cantitateSolutie2);
        sb.append(", cantitateSolutie3=").append(cantitateSolutie3);
        sb.append('}');
        return sb.toString();
    }

}
