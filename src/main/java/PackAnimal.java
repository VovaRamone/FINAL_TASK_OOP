
public abstract class PackAnimal extends Animal {
    public PackAnimal(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    // Метод, специфичный для вьючных животных
    public void carryLoad() {
        System.out.println(getName() + " is carrying a load.");
    }
}

