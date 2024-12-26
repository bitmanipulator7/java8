import java.util.Optional;

public class OptionalClassPractice02 {
    public static void main(String[] args) {
        String[] str = new String[10];
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if (checkNull.isPresent()) { // check if value is present or not present
            String lowerCaseStr = str[5].toLowerCase();
            System.out.println(lowerCaseStr);
        } else {
            System.out.println("String is not present");
        }
    }
}
