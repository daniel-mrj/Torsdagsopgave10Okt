package task2;

public class Main2 {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        cafe.loadMenuData();

        System.out.println("Coffee Menu: ");
        for (String coffee : cafe.getCoffeeMenu()) {
            System.out.println(coffee);
        }
    }
}
