package homework;

public abstract class Animal {
    private boolean isCarnivore = false;
    private String animalSound;
    private int numberOfLegs;


    protected boolean getIsCarnivore() {
        return isCarnivore;
    }

    protected void setIsCarnivore(boolean isCarnivore) {
        this.isCarnivore = isCarnivore;
    }

    private String getAnimalSound() {
        return animalSound;
    }

    protected void setAnimalSound(String animalSound) {
        this.animalSound = animalSound;
    }

    private int getNumberOfLegs() {
        return numberOfLegs;
    }

    protected void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void animalsFood(){
        if(this.isCarnivore){
            System.out.println("This animal is carnivore");
        }
        if (!this.isCarnivore){
            System.out.println("This animal is herbivore");
        }
    }

}
