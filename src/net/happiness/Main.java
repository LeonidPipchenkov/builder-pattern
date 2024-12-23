package net.happiness;

public class Main {

    public static void main(String[] args) {
        User user = new User("Leonid", "Pipchenkov", 25);
        System.out.println(user.getFirstName() + " " + user.getLastName());
    }

}
