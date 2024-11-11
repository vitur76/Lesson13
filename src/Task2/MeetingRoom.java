package Task2;
import Task1.*;

import java.util.List;
import java.util.Arrays;

// Clasa MeetingRoom care primește o listă de obiecte Trainable
public class MeetingRoom {
    private List<Trainable> participants;

    // Constructorul primește o listă de participanți Trainable
    public MeetingRoom(List<Trainable> participants) {
        this.participants = participants;
    }

    // Metodă care apelează attendTraining pentru fiecare participant
    public void startTraining() {
        System.out.println("Trainingul a început:");
        for (Trainable participant : participants) {
            participant.attendTraining();
        }
    }

    public static void main(String[] args) {
        // Crearea unor obiecte Manager și Programmer
        Manager manager1 = new Manager("Alice", 45, 8000);
        Programmer programmer1 = new Programmer("Bob", 30, 5000);
        Programmer programmer2 = new Programmer("Charlie", 25, 4500);

        // Crearea unei liste de participanți pentru training
        List<Trainable> participants = Arrays.asList(manager1, programmer1, programmer2);

        // Crearea unei MeetingRoom cu participanți
        MeetingRoom meetingRoom = new MeetingRoom(participants);

        // Pornirea trainingului
        meetingRoom.startTraining();
    }
}

