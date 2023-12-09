
public class Cat extends Pet {
    public Cat(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Purr!");
    }
}
