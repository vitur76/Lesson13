package Task1;

// Clasa Programmer care extinde Employee și implementează Trainable
public class Programmer extends Employee implements Trainable {
    public Programmer(String name, int age, double salary) {
        super(name, age, salary);
    }

    // Implementarea metodei attendTraining
    @Override
    public void attendTraining() {
        System.out.println(getName() + " participă la un training.");
    }
}
