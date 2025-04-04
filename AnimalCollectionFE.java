// harold kemta

import java.util.Scanner;
public class AnimalCollectionFE {
    private static Scanner keyboard = new Scanner(System.in);
    private static AnimalCollection aCollection = new AnimalCollection();

    public static void main(String[] args) {
        aCollection.addAnimal(new Cat("Whiskers", 3.5, "playful"));
        aCollection.addAnimal(new Dog("Rex", 10.0, 80));
        aCollection.printAnimals();
    }
}
