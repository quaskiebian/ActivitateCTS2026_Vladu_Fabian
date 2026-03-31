package clase.mijlocTransport;

public class Autobuz implements MijlocDeTransport {
    private int nrLinie;
    private String marca;

    public Autobuz(int nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport() {
        StringBuilder sb = new StringBuilder("Autobuzul: ");
        sb.append("de pe linia ").append(this.nrLinie);
        sb.append(" este produs de: ").append(this.marca);
        System.out.println(sb.toString());
    }
}
