import java.util.Scanner;

public class Register {
    // This attribute can't be overridden.
    final int registerAge = 18;

    // Sensitive date is hidden from users (Encapsulation).
    private String name;
    private String lastName;
    private int age;
    private String password;

    // General attributes
    String regex = "[a-zA-Z]{3,}";

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String userName) {
        this.name = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String userLastName) {
        this.lastName = userLastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int userAge) {
        this.age = userAge;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String userPassword) {
        this.password = userPassword;
    }

    // Object
    Scanner scanner = new Scanner(System.in);

    // Methods
    public void register() {
        System.out.println("\nRegister to see photos and videos from your friends\n");

        // First name input
        String firstName;
        do {
            System.out.println("Enter your first name:");
            firstName = scanner.nextLine();
            setName(firstName);

            if (firstName.matches(regex)) {

            } else {
                System.err.println("It must be a valid first name with at least 3 letters.");
            }
        } while (!firstName.matches(regex));

        // Last name input
        String LastName;
        do {
            System.out.println("Enter your last name:");
            LastName = scanner.nextLine();
            setLastName(LastName);

            if (LastName.matches(regex)) {

            } else {
                System.err.println("It must be a valid last name with at least 3 letters.");
            }
        } while (!LastName.matches(regex));

        // User age input
        int userAge;
        do {
            System.out.println("Enter your age:");
            userAge = scanner.nextInt();
            scanner.nextLine();
            setAge(userAge);

            if (userAge < registerAge) {
                System.out.println("You are under age. You can't register.");
            }
        } while (userAge < registerAge);

        // User Password input
        String userPassword;
        do {
            System.out.println("Enter a password:");
            userPassword = scanner.nextLine();
            setPassword(userPassword);

            if (userPassword.matches(regex)) {

            } else {
                System.err.println("It must be a valid password with at least 3 letters.");
            }
        } while (!userPassword.matches(regex));

        System.out.println("\nWelcome " + firstName + "!" + " your registration is complete");
    }
}