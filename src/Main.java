public class Main {
    public static void main(String[] args) {
        //Objects
        Date dateTime = new Date();
        Welcome message = new Welcome();
        //This object is not needed because
        //it mixed with Profiles due to inheritance.
        //Register user = new Register();
        Profiles profile = new Profiles();
        
        //Call methods
        dateTime.displayDate();
        message.welcomeMessage();
        //profile.register(); is a combination of
        //regitser class with profile due to inheritance.
        profile.register();
        profile.profile();
    }
}