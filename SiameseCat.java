package Inheritance_and_Abstraction.Homework;

public class SiameseCat extends Cat {

    private String origin;

    public SiameseCat(String biologicalClass, String species, String color, String name, Integer age,
                      Integer weight, Boolean animalIsDomesticated, String origin, Integer hoursSinceMeal) {
        this.setBiologicalClass(biologicalClass);
        this.setSpecies(species);
        this.setColor(color);
        this.setName(name);
        this.setAge(age);
        this.setWeight(weight);
        this.setAnimalIsDomesticated(animalIsDomesticated);
        this.setHoursSinceMeal(hoursSinceMeal);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void siameseCatOrigin () {
        if(this.origin=="Thailand") {
            System.out.println("This Siamese cat is native to Thailand (formerly known as Siam)");
        }
        else {
            System.out.println("This is not the original Siamese cat");
        }
    }
}

