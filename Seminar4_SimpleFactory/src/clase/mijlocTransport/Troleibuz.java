package clase.mijlocTransport;

public class Troleibuz implements MijlocDeTransport {
    private int nrLinie;
    private String marca;

    public Troleibuz(int nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport() {
        StringBuilder sb = new StringBuilder("Troleibuzul: ");
        sb.append("de pe linia ").append(this.nrLinie);
        sb.append(" este produs de: ").append(this.marca);
        System.out.println(sb.toString());
    }


}
