public class Main {
    public static void main(String[] args) {
        //Objects
        Date dateTime = new Date();
        Welcome message = new Welcome();
        Register user = new Register();
        Profiles page = new Profiles();
        
        //Call methods
        dateTime.displayDate();
        message.welcomeMessage();
        user.register();
        page.profile();
    }
}
