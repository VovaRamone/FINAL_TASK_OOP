import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalRegistry {
    private List<Animal> animals;
    private static int animalCount = 0;

    public AnimalRegistry() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        animalCount++;
        System.out.println(animal.getName() + " has been added to the registry.");
    }

    public void listAnimalCommands(String name) {
        animals.stream()
                .filter(animal -> animal.getName().equalsIgnoreCase(name))
                .findFirst()
                .ifPresent(animal -> System.out.println(animal.getName() + " can: " + animal.getCommands()));
    }

    public void teachNewCommand(String name, String newCommand) {
        animals.stream()
                .filter(animal -> animal.getName().equalsIgnoreCase(name))
                .findFirst()
                .ifPresent(animal -> {
                    String updatedCommands = animal.getCommands() + ", " + newCommand;
                    animal.setCommands(updatedCommands);
                    System.out.println(animal.getName() + " has learned to: " + newCommand);
                });
    }

    public void listAnimalsByBirthDate() {
        animals.stream()
                .sorted(Comparator.comparing(Animal::getBirthDate))
                .forEach(animal -> System.out.println(animal.getName() + " - " + animal.getBirthDate()));
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

