// harold kemta

import java.util.ArrayList;

class AnimalCollection {
    private ArrayList<Animal> animals;

    public AnimalCollection() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        if (animals.size() < 100) {
            animals.add(animal);
        }
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void printAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
