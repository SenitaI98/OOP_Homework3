package homework;

public class  Cat extends Animal {
    private boolean isWild;

    public Cat(boolean isCarnivore,String animalSound, int numberOfLegs, boolean isWild){
        this.setIsCarnivore(isCarnivore);
        this.setAnimalSound(animalSound);
        this.setNumberOfLegs(numberOfLegs);
        this.isWild = isWild;
    }


    public String wildOrDomestic (){
        if(this.isWild){
            return "This animal is wild animal";
        } else {
            return "This animal is domestic animal";
        }
    }
    protected void setWild(boolean wild) {
        isWild = wild;
    }

}
