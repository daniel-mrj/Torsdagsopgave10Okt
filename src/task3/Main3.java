package task3;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        // Instantiate 3 rum
        Room room1 = new Room(3,2);
        Room room2 = new Room(2,1);
        Room room3 = new Room(4,3);

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        // Instantiate building
        Building building = new Building(rooms, 2);

        System.out.println("Total number of lamps: " + countLampsInBuilding(building));
        System.out.println("Total number of windows: " + countWindowsInBuilding(building));
        System.out.println("Total number of rooms: " + countRoomsInBuilding(building));
        System.out.println("Is the building normal? " + isNormal(building));
    }

    // Count metode lamps
    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }
    // Count metode windows
    public static int countWindowsInBuilding(Building building) {
        int totalWindows = 0;
        for (Room room : building.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }
    // Count metode rooms
    public static int countRoomsInBuilding(Building building) {
        int totalRooms = 0;
        for (Room room : building.getRooms()) {
            totalRooms++;
        }
        return totalRooms;
    }
    public static boolean isNormal(Building building) {
        return building.getNumberOfFloors() >= building.getRooms().size();
    }
}
