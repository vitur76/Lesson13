package Task1;


// Clasa principală pentru testare
public class Main {
    public static void main(String[] args) {
        // Crearea unui obiect Manager
        Manager manager = new Manager("Alice", 45, 8000);
        manager.displayInfo();
        manager.attendTraining();
        manager.conductInterview();

        // Crearea unui obiect Programmer
        Programmer programmer = new Programmer("Bob", 30, 5000);
        programmer.displayInfo();
        programmer.attendTraining();
    }
}
