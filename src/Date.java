import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    public void displayDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String formattedDate = date.format(dateFormat);
        System.out.println("\n\tToday is: " + formattedDate);
    }
}
