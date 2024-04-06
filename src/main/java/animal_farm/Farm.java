package animal_farm;

public class Farm {
    public static void main(String[] args) {
        Pig piggy = new Pig();
        piggy.makeSound();
        piggy.splashMud();
        piggy.eat();
        piggy.greetOwner();


        Duck ducky = new Duck();
        ducky.makeSound();
        ducky.fly();
        ducky.eat();

        Animal animal = new Pig();
        animal.makeSound();
        animal.eat();
        //the splashMud() is not available to animal
        //it is of type animal and cannot access methods specific to type pig
        //if animal is cast to Pig type, then it can access these methods
        ((Pig) animal).splashMud();


    }
}
