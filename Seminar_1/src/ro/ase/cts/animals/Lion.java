package ro.ase.cts.animals;

public class Lion extends Animal {
    public int greutate;

    public Lion(String name, int age, int greutate) {
        super(name, age);
        this.greutate = greutate;
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Leul a mancat"+mancare);
    }

    @Override
    public String toString() {
        StringBuilder buffer=new StringBuilder();
        buffer.append("Leu:");
        buffer.append(super.toString());
        buffer.append(" greutate ");
        buffer.append(greutate);
        return buffer.toString();
    }
}
