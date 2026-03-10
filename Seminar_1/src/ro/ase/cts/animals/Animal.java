package ro.ase.cts.animals;

public abstract class Animal {
    private String name;
    private int age;
    public abstract void eat(String mancare);

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Animal() {
        super();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
