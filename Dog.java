package Inheritance_and_Abstraction.Homework;

public class Dog extends Animal {

    private String breed;
    private Integer weight;
    private String typeOfCoat;

    public Dog(String biologicalClass, String species, String breed, String color, String name,
               Integer age, Integer weight, Boolean animalIsDomesticated, String typeOfCoat, Integer hoursSinceMeal) {
        this.setBiologicalClass(biologicalClass);
        this.setSpecies(species);
        this.setName(name);
        this.setAnimalIsDomesticated(animalIsDomesticated);
        this.setAge(age);
        this.setColor(color);
        this.setHoursSinceMeal(hoursSinceMeal);
        this.breed = breed;
        this.weight = weight;
        this.typeOfCoat=typeOfCoat;
    }

    protected String getBreed() {
        return breed;
    }

    protected void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    protected String getTypeOfCoat() {
        return typeOfCoat;
    }

    public void setTypeOfCoat(String typeOfCoat) {
        this.typeOfCoat = typeOfCoat;
    }

    public void feedAnimal () {
        if(this.getHoursSinceMeal()>=4) {
            System.out.println("This dog needs to be fed ASAP");
        }
        else {
            System.out.println("This dog is not hungry yet");
        }
    }
}
