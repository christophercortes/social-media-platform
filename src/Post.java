import java.util.Scanner;

class Post extends Profiles {
    public void post() {
        System.out.println("\n@" + getName() + "." + getLastName() + " " + "post page");

        Scanner scanner = new Scanner(System.in);
        
        int menuPost;        
        do {
            System.out.println("\nMenu\n");
            System.out.println("1 - View my lists of followers");
            System.out.println("2 - View my last posts");
            menuPost = scanner.nextInt();
            scanner.nextLine();

            if (menuPost == 1) {
                System.out.println("==========================");
                System.out.println("Your followers are:\n" + getFollowers() + "\n");
            }
            else if (menuPost == 2) {
                System.out.println("==========================");
                System.out.println("Your last posts are:\n" + getPost() + "\n");
            } else {
                System.err.println("You must insert a valid number");
            }
        } while (menuPost != 1 && menuPost != 2);

        scanner.close();
    }
    
}