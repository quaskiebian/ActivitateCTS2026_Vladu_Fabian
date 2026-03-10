package ro.ase.cts.animals;

public class Zebra extends Animal{
    public int nrDungi;

    public Zebra(String name, int age, int nrDungi) {
        super(name, age);
        this.nrDungi = nrDungi;
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Zebra a mancat"+mancare);
    }

    @Override
    public String toString() {
        StringBuilder buffer=new StringBuilder();
        buffer.append("Zebra");
        buffer.append(super.toString());
        buffer.append(" nrDungi ");
        buffer.append(this.nrDungi);
        return buffer.toString();
    }
}
