package clase.mijlocTransport;

public class Tramvai implements MijlocDeTransport {
    private int nrLinie;
    private String marca;

    public Tramvai(int nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport() {
        StringBuilder sb = new StringBuilder("Tramvaiul: ");
        sb.append("de pe linia ").append(this.nrLinie);
        sb.append(" este produs de: ").append(this.marca);
        System.out.println(sb.toString());
    }
}
