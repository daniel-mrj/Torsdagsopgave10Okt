package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Customer ArrayList
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Daniel", "Johansson", "dj123"));
        customers.add(new Customer("Hans", "Jensen", "hjens44"));
        customers.add(new Customer("Michael", "James", "james321"));

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
