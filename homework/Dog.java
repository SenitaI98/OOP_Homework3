package homework;

public class Dog extends Animal {
    private String bigOrSmall;
    private boolean pet;

    public Dog(boolean isCarnivore, String animalSound, int numberOfLegs, String bigOrSmall, boolean pet) {
        this.setIsCarnivore(isCarnivore);
        this.setAnimalSound(animalSound);
        this.setNumberOfLegs(numberOfLegs);
        this.bigOrSmall = bigOrSmall;
        this.pet = pet;
    }

    public void size() {
        if (this.bigOrSmall.toLowerCase() == "small") {
            System.out.println("This animal is small");
        } else if (this.bigOrSmall.toLowerCase() == "big") {
            System.out.println("This animal is big");
        }
    }

    public void isAnimalPet() {
        if (this.pet) {
            System.out.println("This animal is pet, we can play :)");
        } else {
            System.out.println("This animal isn't pet :(");
        }
    }


}
