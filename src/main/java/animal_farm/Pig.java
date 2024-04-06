package animal_farm;

public class Pig extends Animal implements Pet{

    @Override
    public void makeSound() {
        System.out.println("This piggy says oink oink!");
    }

    public void splashMud() {
        System.out.println("This piggy loves splashing in the mud");
    }

    @Override
    public void greetOwner() {
        System.out.println("This piggy wags its tail.");
    }
}
