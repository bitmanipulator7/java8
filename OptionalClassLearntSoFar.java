import java.util.Optional;

public class OptionalClassLearntSoFar {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[4] = "This is a not null value";
        Optional<String> checkNull = Optional.ofNullable(str[4]);
        checkNull.ifPresent(System.out::println);
        System.out.println(checkNull.get());

        Optional<String> checkNullAgain = Optional.ofNullable(str[9]);
        checkNullAgain.ifPresent(n -> System.out.println(n));
        String defaultName = checkNullAgain.orElse("Ninth element");
        System.out.println(defaultName);
    }

}
