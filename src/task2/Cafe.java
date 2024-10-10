package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    public void loadMenuData() {
        try {
            File file = new File("coffee.txt");
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                coffeeMenu.add(scan.nextLine());
            }

            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
