public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Bark! Bark!");
    }

    // Main method to test inheritance
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal");
        Dog dog = new Dog("Max");

        System.out.println("Testing Animal and Dog classes:");

        System.out.println("\nCalling generic animal's makeSound():");
        genericAnimal.makeSound();

        System.out.println("\nCalling dog's makeSound():");
        dog.makeSound();
    }
}
