package homework;

public class SiameseCat extends Cat {
    private String eyeColor;
    private boolean stripes;

    public SiameseCat(boolean isCarnivore, String animalSound, int numberOfLegs, boolean isWild, String eyeColor, boolean stripes) {
        super(isCarnivore, animalSound, numberOfLegs, isWild);
        this.setIsCarnivore(isCarnivore);
        this.setAnimalSound(animalSound);
        this.setNumberOfLegs(numberOfLegs);
        this.setWild(isWild);

        this.eyeColor = eyeColor;
        this.stripes = stripes;
    }

    protected void stripeCheck() {
        if (this.stripes) {
            System.out.println("This animal has stripes");
        } else {
            System.out.println("This animal has no stripes");
        }
    }

    protected void blueEyes() {
        if (this.eyeColor.toLowerCase() == "blue") {
            System.out.println("This animal has blue eyes!");
        }
    }

}
