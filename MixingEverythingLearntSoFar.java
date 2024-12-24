import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MixingEverythingLearntSoFar {
    public static void main(String[] args) {
        Behaviors0192 behavior = () -> {
            System.out.println("Hello there!");
        };
        behavior.doSomething();

        Behaviors0192 behavior0122 = () -> System.out.println("Hello there 122!");
        behavior0122.doSomething();

        /*
        Behaviors0193 behavior0123 = (x) -> {
            int result = x * x;
            result = result / 2;
            return result;
        };*/
        Behaviors0193 behavior0123 = (x) -> (x * x) / 2;
        int result = behavior0123.doSomething(10);
        System.out.println(result);

        Behaviors0193 behavior0124 = MixingEverythingLearntSoFar::customMethod0192; // Method Reference
        result = behavior0124.doSomething(100);
        System.out.println(result);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }

    public static int customMethod0192(int n) {
        int number = n * 5;
        number += 100;
        return number;
    }
}

interface Behaviors0192 {
    void doSomething();
}

interface Behaviors0193 {
    int doSomething(int n);
}