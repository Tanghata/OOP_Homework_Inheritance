package Inheritance_and_Abstraction.Homework;

public class Cat extends Animal {

    private Integer weight;
    private String furPattern;

    public Cat(String biologicalClass, String species, String color, String name, Integer age,
               Integer weight, Boolean animalIsDomesticated, String furPattern, Integer hoursSinceMeal) {
        this.setBiologicalClass(biologicalClass);
        this.setSpecies(species);
        this.setColor(color);
        this.setName(name);
        this.setAge(age);
        this.setAnimalIsDomesticated(animalIsDomesticated);
        this.setHoursSinceMeal(hoursSinceMeal);
        this.weight = weight;
        this.furPattern = furPattern;
    }

    public Cat() {

    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    protected String getFurPattern() {
        return furPattern;
    }

    protected void setFurPattern(String furPattern) {
        this.furPattern = furPattern;
    }

    public void isCatUnderweight () {
        if(this.weight<=3) {
            System.out.println("This cat is underweight");
        }
        else if (this.weight>3 && this.weight<=5) {
            System.out.println("This cat has normal weight");
        }
        else {
            System.out.println("This cat is overweight");
        }
    }
}
