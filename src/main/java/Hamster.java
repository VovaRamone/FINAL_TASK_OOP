
public class Hamster extends Pet {
    public Hamster(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Squeak!");
    }
}
