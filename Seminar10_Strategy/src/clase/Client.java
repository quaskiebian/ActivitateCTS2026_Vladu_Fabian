package clase;

public class Client {
    private String nume;
    private ModalitateDePlata modalitateDePlata;

    public Client(String nume) {
        this.nume = nume;
        modalitateDePlata=new PlataCard(500);
    }

    public void setModalitateDePlata(ModalitateDePlata modalitateDePlata) {
        this.modalitateDePlata = modalitateDePlata;
    }

    public void platesteTranzactie(double suma){
        modalitateDePlata.plateste(nume,suma);
    }

}