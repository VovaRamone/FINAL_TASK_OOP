
public class Donkey extends PackAnimal {
    public Donkey(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Bray!");
    }
}
