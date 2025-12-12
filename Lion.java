public class Lion extends Animal {

    public Lion(String name) {
        super(name); // Calls the superclass constructor
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Roars: RaaaRRaar!");
    }
}