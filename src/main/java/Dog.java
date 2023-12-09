
public class Dog extends Pet {
    public Dog(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Bark!");
    }
}

