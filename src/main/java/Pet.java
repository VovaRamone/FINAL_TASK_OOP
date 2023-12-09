
public abstract class Pet extends Animal {
    public Pet(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    // Метод, специфичный для домашних животных
    public void play() {
        System.out.println(getName() + " is playing.");
    }
}

