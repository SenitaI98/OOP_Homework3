package homework;

public class Main {
    public static void main(String[] args) {
        System.out.println("DOG");
        Dog someDog = new Dog(true, "Wav Wav :D", 4, "Can be big and can be small", true);
        someDog.animalsFood(); //---method from parent class
        someDog.isAnimalPet(); //---method from child class
        someDog.size(); //---method from child class

        System.out.println("\nCAT");
        Cat someCat = new Cat(true, "Mjauu", 4, false);
        someCat.animalsFood(); //---method from parent class
        System.out.println(someCat.wildOrDomestic()); //---method from child class

        System.out.println("\nSIAMESE CAT");
        SiameseCat mySiameseCat = new SiameseCat(true, "Mjauuu", 4, false, "blue", false);
        mySiameseCat.animalsFood(); //---method from parent class
        mySiameseCat.stripeCheck(); //---method from child class
        mySiameseCat.blueEyes(); //---method from child class


    }


}
