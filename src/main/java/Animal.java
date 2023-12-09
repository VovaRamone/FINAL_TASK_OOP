

public abstract class Animal {
    private String name;
    private String birthDate;
    private String commands;

    public Animal(String name, String birthDate, String commands) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = commands;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        if (commands == null || commands.trim().isEmpty()) {
            throw new IllegalArgumentException("Commands cannot be empty.");
        }
        this.commands = commands;
    }

    // Абстрактный метод для издавания звука
    public abstract void makeSound();
}

