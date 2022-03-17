package Inheritance_and_Abstraction.Homework;

public class Main {
    public static void main(String[] args) {
        Dog homeDog = new Dog("Mammal", "Dog", "German Shepherd", "black and brown",
                "Togo", 7, 43, true, "double coat", 2);

        Cat homeCat = new Cat("Mammal", "Cat", "gray and white", "Willow", 4,
                3, true, "bicolor", 4);

        SiameseCat homeSiameseCat = new SiameseCat("Mammal", "Cat", "yellow", "Cleopatra",
                12, 4, true, "Thailand", 3);

        // DOG
        System.out.println("\nHome dog");
        System.out.println("-----------------------------------------------------------");
        System.out.println("This dog is " + homeDog.getColor() + " " + homeDog.getBreed() + " named " + homeDog.getName());
        System.out.println(homeDog.getName() + " is " + homeDog.getAge() + " years old, and has " + homeDog.getTypeOfCoat());
        homeDog.canAnimalBeKeptAsPet();
        homeDog.takeAnimalToVeterinarian(homeDog.getAge());
        homeDog.feedAnimal();

        // CAT
        System.out.println("\nHome cat");
        System.out.println("-----------------------------------------------------------");
        System.out.println("This " + homeCat.getColor() + " cat named " + homeCat.getName() + " is " +
                homeCat.getAge() + " years old");
        System.out.println(homeCat.getName() + " has " + homeCat.getFurPattern() + " fur");
        homeCat.canAnimalBeKeptAsPet();
        homeCat.isCatUnderweight();
        homeCat.takeAnimalToVeterinarian(homeCat.getAge());

        // SIAMESE CAT
        System.out.println("\nSiamese cat");
        System.out.println("-----------------------------------------------------------");
        System.out.println("This " + homeSiameseCat.getColor() + " Siamese cat is named " + homeSiameseCat.getName());
        System.out.println(homeSiameseCat.getName() + " is " + homeSiameseCat.getAge() + " years old");
        homeSiameseCat.siameseCatOrigin();
        homeSiameseCat.canAnimalBeKeptAsPet();
        homeSiameseCat.takeAnimalToVeterinarian(homeSiameseCat.getAge());
    }
}
