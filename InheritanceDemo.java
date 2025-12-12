public class InheritanceDemo {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal");
        Lion myLion = new Lion("Simba");

        genericAnimal.makeSound(); // Calls Animal version
        myLion.makeSound();        // Calls Lion version (overridden)
    }
}