import java.time.LocalDate;
import java.time.Month;

public class DateTimePractice01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);

        //Creating local date by providing input arguments
        LocalDate firstDayOf2024 = LocalDate.of(2024, Month.JANUARY, 1);
        System.out.println("firstDayOf2024: " + firstDayOf2024);
    }
}
