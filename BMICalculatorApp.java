import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BMICalculatorApp {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Person> people = new ArrayList<>();
    
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("    BMI Calculator Application   ");
        System.out.println("=================================");
        
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1:
                    calculateSingleBMI();
                    break;
                case 2:
                    addPerson();
                    break;
                case 3:
                    displayAllPeople();
                    break;
                case 4:
                    displayBMIInfo();
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for using BMI Calculator!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
            if (running) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }
    
    private static void displayMenu() {
        System.out.println("\n--- Main Menu ---");
        System.out.println("1. Calculate BMI (Quick)");
        System.out.println("2. Add Person and Calculate BMI");
        System.out.println("3. View All People and Their BMIs");
        System.out.println("4. View BMI Information");
        System.out.println("5. Exit");
    }
    
    private static void calculateSingleBMI() {
        System.out.println("\n--- Quick BMI Calculation ---");
        
        double weight = getDoubleInput("Enter weight (kg): ");
        double height = getDoubleInput("Enter height (m): ");
        
        try {
            BMI bmi = new BMI(weight, height);
            System.out.println("\nResults:");
            System.out.println(bmi);
            System.out.println("Health Advice: " + bmi.getHealthAdvice());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void addPerson() {
        System.out.println("\n--- Add Person ---");
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        double weight = getDoubleInput("Enter weight (kg): ");
        double height = getDoubleInput("Enter height (m): ");
        int age = getIntInput("Enter age: ");
        
        try {
            Person person = new Person(name, weight, height, age);
            BMI bmi = new BMI(weight, height);
            people.add(person);
            
            System.out.println("\nPerson added successfully!");
            System.out.println(person);
            System.out.println(bmi);
            System.out.println("Health Advice: " + bmi.getHealthAdvice());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void displayAllPeople() {
        System.out.println("\n--- All People and Their BMIs ---");
        
        if (people.isEmpty()) {
            System.out.println("No people added yet.");
            return;
        }
        
        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            BMI bmi = new BMI(person.getWeight(), person.getHeight());
            
            System.out.println("\n" + (i + 1) + ". " + person);
            System.out.println("   " + bmi);
            System.out.println("   Health Advice: " + bmi.getHealthAdvice());
        }
    }
    
    private static void displayBMIInfo() {
        System.out.println("\n--- BMI Information ---");
        System.out.println(BMI.getCategoryRanges());
        System.out.println("BMI (Body Mass Index) is calculated as weight (kg) / height² (m²)");
        System.out.println("It's a useful indicator of healthy body weight for adults.");
        System.out.println("However, it doesn't account for muscle mass, bone density, or distribution of fat.");
        System.out.println("Always consult healthcare professionals for comprehensive health assessment.");
    }
    
    private static double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
    
    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }
}