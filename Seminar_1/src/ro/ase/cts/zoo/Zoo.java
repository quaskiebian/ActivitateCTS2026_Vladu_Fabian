package ro.ase.cts.zoo;

import ro.ase.cts.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public String name;
    public ZooKeeper zookeper;
    public List<Animal> animale;

    public Zoo(String name, ZooKeeper zookeper) {
        this.name = name;
        this.zookeper = zookeper;
        this.animale = new ArrayList<>();
    }

    public void feedAllAnimals(){
        for(Animal a:animale){
            zookeper.feedAnimal(a);
        }
    }
    public void adaugaAnimal(Animal a){
        animale.add(a);
    }
}
