import java.util.Optional;

public class OptionalClassPractice01 {
    public static void main(String[] args) {
        String name = null;

        //Wrapping name in an Optional
        Optional<String> optionalName = Optional.ofNullable(name);

        //Using ifPresent to avoid null checks
        optionalName.ifPresent(n -> System.out.println("Name is : " + n));

        //Providing a default value if the name is null
        String defaultName = optionalName.orElse("Default Name");
        System.out.println("Name is: " + defaultName);
    }
}
