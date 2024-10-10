package task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter = 0;

    //Konstruktør

    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = ++counter; //counter tælles op med 1
    }

    // Getters og setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Customer ID: " + id + " First Name: " + firstName + " Last Name: " + lastName + " Username: " + username;
    }
}
