
public class Camel extends PackAnimal {
    public Camel(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Grunt!");
    }
}
