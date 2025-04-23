package tickets;

public class Train {
    String trainName;
    int trainNumber;

    public Train(String trainName, int trainNumber) {
        this.trainName = trainName;
        this.trainNumber = trainNumber;
    }

    public void displayTrain() {
        System.out.println("Train: " + trainName + " (" + trainNumber + ")");
    }
}
