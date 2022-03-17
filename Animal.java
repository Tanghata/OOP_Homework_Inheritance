package Inheritance_and_Abstraction.Homework;

public abstract class Animal {

    private String biologicalClass;
    private String species;
    private String color;
    private String name;
    private Integer age;
    private Boolean animalIsDomesticated=false;
    private Integer hoursSinceMeal=0;

    protected String getBiologicalClass() {
        return biologicalClass;
    }

    protected void setBiologicalClass(String biologicalClass) {
        this.biologicalClass = biologicalClass;
    }

    protected String getSpecies() {
        return species;
    }

    protected void setSpecies(String species) {
        this.species = species;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void setAge(Integer age) {
        this.age = age;
    }

    protected Integer getAge() {
        return age;
    }

    public Boolean getAnimalIsDomesticated() {
        return animalIsDomesticated;
    }

    public void setAnimalIsDomesticated(Boolean animalIsDomesticated) {
        this.animalIsDomesticated = animalIsDomesticated;
    }

    public Integer getHoursSinceMeal() {
        return hoursSinceMeal;
    }

    public void setHoursSinceMeal(Integer hoursSinceMeal) {
        this.hoursSinceMeal = hoursSinceMeal;
    }

    public void canAnimalBeKeptAsPet() {
        if (this.animalIsDomesticated) {
            this.animalIsDomesticated=true;
            System.out.println("This animal can be kept as a pet");
            }
        else {
            System.out.println("This animal is yet to be domesticated");
        }
    }

    public void takeAnimalToVeterinarian (Integer age) {
            if(this.animalIsDomesticated) {
                if(age>=5) {
                    System.out.println(getSpecies() + " named " + getName() +
                            " needs to be examined by veterinarian");
                }
                else {
                    System.out.println(getSpecies() + " named " + getName() +
                            " does not need to be examined by veterinarian");
                }
            }
            else {
                System.out.println("This animal is yet to be domesticated");
            }
    }
}