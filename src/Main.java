public class Main {
    public static void main(String[] args) {
        //Objects
        Date dateTime = new Date();
        Welcome message = new Welcome();
        Post posts = new Post();
        
        //Call methods
        dateTime.displayDate();
        message.welcomeMessage();
        //Inheritance
        posts.register();
        posts.profile();
        posts.post();
    }
}