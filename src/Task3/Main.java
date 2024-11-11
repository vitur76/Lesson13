package Task3;
import Task1.*;

import java.util.ArrayList;
import java.util.List;


// Clasa principală pentru testare
public class Main {
    public static void main(String[] args) {
        // Crearea unei liste de Employee
        List<Employee> employees = new ArrayList<>();

        employees.add(new Manager("MM1", 45, 8000));
        employees.add(new Programmer("PP1", 30, 5000));
        employees.add(new Manager("MM2", 45, 8000));
        employees.add(new Programmer("PP2", 30, 5000));

        // Iterăm prin listă și folosim instanceof și casting pentru a apela metodele corespunzătoare
        for (Employee employee : employees) {
            // Verificăm dacă obiectul este de tip Manager
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                manager.attendTraining();  // Apelăm metoda attendTraining
                manager.conductInterview();  // Apelăm metoda conductInterview
            }
            // Verificăm dacă obiectul este de tip Programmer
            else if (employee instanceof Programmer) {
                Programmer programmer = (Programmer) employee;
                programmer.attendTraining();  // Apelăm metoda attendTraining
            }
        }
    }
}