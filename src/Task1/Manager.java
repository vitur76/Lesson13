package Task1;

// Clasa Manager care extinde Employee și implementează Trainable și Interviewable
public class Manager extends Employee implements Trainable, Interviewable {
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    // Implementarea metodei attendTraining
    @Override
    public void attendTraining() {
        System.out.println(getName() + " participă la un training.");
    }

    // Implementarea metodei conductInterview
    @Override
    public void conductInterview() {
        System.out.println(getName() + " conduce un interviu.");
    }
}
