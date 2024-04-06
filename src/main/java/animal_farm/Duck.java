package animal_farm;

public class Duck extends Animal{
    @Override
    public void makeSound() {
        System.out.println("This ducky says quack quack!");
    }

    public void fly() {
        System.out.println("This ducky can fly");
    }
}
