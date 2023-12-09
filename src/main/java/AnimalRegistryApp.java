import java.util.Scanner;

public class AnimalRegistryApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final AnimalRegistry registry = new AnimalRegistry();

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to the Animal Registry!");
            System.out.println("1. Add a new animal");
            System.out.println("2. List animal commands");
            System.out.println("3. Teach a new command");
            System.out.println("4. List animals by birthdate");
            System.out.println("5. Show total number of animals");
            System.out.println("0. Exit");
            System.out.print("Please enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addNewAnimal();
                    break;
                case 2:
                    listAnimalCommands();
                    break;
                case 3:
                    teachNewCommand();
                    break;
                case 4:
                    registry.listAnimalsByBirthDate();
                    break;
                case 5:
                    System.out.println("Total animals: " + AnimalRegistry.getAnimalCount());
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void addNewAnimal() {
        try {
            System.out.println("Enter animal type (Dog, Cat, Hamster): ");
            String type = scanner.nextLine();
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter birth date (YYYY-MM-DD): ");
            String birthDate = scanner.nextLine();
            System.out.println("Enter commands (comma separated): ");
            String commands = scanner.nextLine();

            Animal animal = createAnimal(type, name, birthDate, commands);
            registry.addAnimal(animal);
        } catch (Exception e) {
            System.out.println("Error adding animal: " + e.getMessage());
        }
    }

    private static Animal createAnimal(String type, String name, String birthDate, String commands) throws IllegalArgumentException {
        switch (type.toLowerCase()) {
            case "dog":
                return new Dog(name, birthDate, commands);
            case "cat":
                return new Cat(name, birthDate, commands);
            case "hamster":
                return new Hamster(name, birthDate, commands);
            default:
                throw new IllegalArgumentException("Unknown animal type.");
        }
    }

    private static void listAnimalCommands() {
        System.out.println("Enter the name of the animal to list commands: ");
        String name = scanner.nextLine();
        registry.listAnimalCommands(name);
    }

    private static void teachNewCommand() {
        System.out.println("Enter the name of the animal to teach a new command: ");
        String name = scanner.nextLine();
        System.out.println("Enter the new command to teach: ");
        String newCommand = scanner.nextLine();
        registry.teachNewCommand(name, newCommand);
    }
}

