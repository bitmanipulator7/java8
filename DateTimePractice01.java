import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimePractice01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);

        //Creating local date by providing input arguments
        LocalDate firstDayOf2024 = LocalDate.of(2024, Month.JANUARY, 1);
        System.out.println("firstDayOf2024: " + firstDayOf2024);

        LocalDateTime todayIndiaDateTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, yyyy HH:mm:ss");
        System.out.println("Current date time in India: " + dtf.format(todayIndiaDateTime));

        LocalDate dateFromEpoch = LocalDate.ofEpochDay(100);
        System.out.println("100 days from the Epoch Start Date: " + dateFromEpoch);

        LocalDate hundredthDayOf2024 = LocalDate.ofYearDay(2024, 100);
        System.out.println("100th day of 2024: " + hundredthDayOf2024);
    }
}
