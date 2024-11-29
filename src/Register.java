import java.util.Scanner;

public class Register {
    //This attribute can't be overridden.
    final int registerAge = 18;

    //Sensitive date is hidden from users (Encapsulation).
    private String name;
    private String lastName;
    private int age;
    private String password;

    //Getter and Setter
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

    //Object
    Scanner scanner = new Scanner(System.in);

    //Methods
    public void register() {
        System.out.println("\n\tRegister to see photos and videos from your friends\n");
        //Firstname
        System.out.println("Enter your name:");
        String firstName = scanner.nextLine();
        setName(firstName);
        //Lastname
        System.out.println("Enter your lastname:");
        String LastName = scanner.nextLine();
        setLastName(LastName);
        //Age
        System.out.println("Enter your age:");
        int userAge = scanner.nextInt();
        scanner.nextLine();
        setAge(userAge);
        //Password
        System.out.println("Enter an alphanumeric password at least 6 characters:");
        String userPassword = scanner.nextLine();
        setPassword(userPassword);

        System.out.println("");

        if (!firstName.isEmpty()) {
            System.out.println("Valid name");
        } else {
            System.out.println("You must insert your firstname");
        }
        if (!LastName.isEmpty()) {
            System.out.println("Valid lastname");
        } else {
            System.out.println("You must insert your lastname");
        }

        if (userAge >= registerAge) {
            System.out.println("valid age");
        } else {
            System.out.println("You must be at least 18");
        }

        if (userPassword.length() >= 6) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password length");
        }

        while (firstName.isEmpty()) {
            System.out.println("Insert your name again");
            firstName = scanner.nextLine();
        }
        if (LastName.isEmpty()) {
            System.out.println("Insert your lastname");
            LastName = scanner.nextLine();
        }
        else if (userPassword.length() >= 6) {
            System.out.println("Insert your password");
            userPassword = scanner.nextLine();

        } else {
            System.out.println();
        }

        System.out.println("Welcome " + firstName + " " + lastName + "\n");
        System.out.println("Your registration is complete");
    }
}
