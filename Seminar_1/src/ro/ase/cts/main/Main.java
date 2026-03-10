package ro.ase.cts.main;

import ro.ase.cts.animals.Lion;
import ro.ase.cts.animals.Zebra;
import ro.ase.cts.zoo.Zoo;
import ro.ase.cts.zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper("EberechiEze");
        Lion l = new Lion("Hincapie", 25, 44);
        Zebra z = new Zebra("KoloMuani", 27, 3);
        Zoo gradinaZoo = new Zoo("Baneasa", zooKeeper);
        gradinaZoo.adaugaAnimal(l);
        gradinaZoo.adaugaAnimal(z);
        gradinaZoo.feedAllAnimals();
    }
}
