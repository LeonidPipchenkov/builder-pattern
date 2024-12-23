package net.happiness;

public class Main {

    public static void main(String[] args) {
        User user = new User.UserBuilder("James", "Bond")
                .age(45)
                .phoneNumber("007")
                .address("London")
                .build();
        System.out.println(user);
    }

}
