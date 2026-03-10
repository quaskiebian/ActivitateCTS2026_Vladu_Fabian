package ro.ase.cts.zoo;

import ro.ase.cts.animals.Animal;

public class ZooKeeper {
    public String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal){
        System.out.println("Zookeperul "+name+" a hranit "+animal);
    }
}
