import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationsPractice02 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Example");
        // Using stream to convert each word to uppercase
        words.stream().map(String::toUpperCase).forEach(System.out::println);
        // map() is an intermediate operation that transforms each element
        // using the provided function (String::toUpperCase in this case).

        // ------------------
        // Filtering and collecting results in a new list.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        //collect() is a terminal operation that collects the elements of the stream into a collection like List, Set, etc.

        // ------------------
        // reduce() to perform a reduction on the elements of the stream, such as summing them
        int sum = numbers.stream().reduce(0, (a, b) -> a + b );
        System.out.println("Sum :: " + sum);
        // reduce() is a terminal operation that combines elements using an associative accumulation function.
        // The first argument (0) is the identity value for the sum.
    }
}
