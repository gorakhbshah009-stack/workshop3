package week3;

// Program 8: No-argument constructor that prints "User created!"

class User {

    String name;
    int age;

    // No-argument constructor
    User() {
        System.out.println("User created!");
    }
}

public class Program8 {
    public static void main(String[] args) {

        System.out.println("Creating first user...");
        User user1 = new User();

        System.out.println("Creating second user...");
        User user2 = new User();

        System.out.println("Done!");
    }
}
