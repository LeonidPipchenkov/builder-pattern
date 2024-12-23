package net.happiness;

public class User {

    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final String phoneNumber;
    private final String address;

    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Name: ").append(this.firstName).append(" ").append(this.lastName).append(";\n")
                .append("Age: ").append(this.age).append("; ")
                .append("Phone: ").append(this.phoneNumber).append("; ")
                .append("Address: ").append(this.address).append(".")
                .toString();
    }

    public static class UserBuilder {

        private final String firstName;
        private final String lastName;
        private Integer age;
        private String phoneNumber;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public UserBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

}
