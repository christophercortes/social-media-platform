import java.util.Scanner;

class Post extends Profiles {
    public void post() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n@" + getName() + "." + getLastName() + " " + "post page\n");
        System.out.println(getFollowers() + " " + getPost());
        
        int menuPost;        
        do {
            System.out.println("\nMenu\n");
            System.out.println("1 - View my lists of followers");
            System.out.println("2 - View my last posts");
            menuPost = scanner.nextInt();
            scanner.nextLine();

            if (menuPost == 1) {
                System.out.println("==========================");
                System.out.println("My followers are:\n" + getFollowers());
            }
            else if (menuPost == 2) {
                System.out.println("==========================");
                System.out.println("My last posts are:\n" + getPost());
            } else {
                System.err.println("Must insert a valid number");
            }
        } while (menuPost != 1 && menuPost != 2);

        scanner.close();
    }
    
}