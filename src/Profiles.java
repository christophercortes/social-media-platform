import java.util.ArrayList;
import java.util.Scanner;

class Profiles extends Register {
    private String followers;
    private String post;

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followerName) {
        this.followers = followerName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String userPost) {
        this.post = userPost;
    }

    public void profile() {
        System.err.println("\nGreenFlag\n");
        System.out.println("User name: @" + getName().toLowerCase() + "." + getLastName().toLowerCase());

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listFollowers = new ArrayList<>();
        ArrayList<String> posts = new ArrayList<>();

        int menuSelect;

        do {
            System.out.println("\nMenu\n");
            System.out.println("1 - Add follower");
            System.out.println("2 - Delete follower");
            System.out.println("3 - Create a post");
            menuSelect = scanner.nextInt();
            scanner.nextLine();

            if (menuSelect == 1) {
                System.out.println("Enter a new follower:");
                String newFollower = scanner.nextLine();
                listFollowers.add(newFollower);
            }
            else if (menuSelect == 2) {
                System.out.println("Delete a follower:");
                String deleteFollower = scanner.nextLine();
                listFollowers.remove(deleteFollower);
            }
            else if (menuSelect == 3) {
                System.out.println("What's on your mind, " + getName());
                String newPost = scanner.nextLine();
                posts.add(newPost);
            } else {
                System.err.println("You must select a valid number");
            }
        } while (menuSelect != 1 && menuSelect != 2 && menuSelect != 3);
        
        scanner.close();
    }
}