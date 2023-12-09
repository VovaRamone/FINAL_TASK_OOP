
public class Horse extends PackAnimal {
    public Horse(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Neigh!");
    }
}
