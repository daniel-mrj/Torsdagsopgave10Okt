package task3;

public class Room {
    private int numberOfLamps;
    private int numberOfWindows;

    //Konstuktør
    public Room(int numberOfLamps, int numberOfWindows) {
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    // Getters og setters

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}
