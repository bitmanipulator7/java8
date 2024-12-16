import java.util.*;

public class StreamOperationsPractice01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 7, 8, 4, 5);

        // Using streams to filter numbers greater than 5
        numbers.stream().filter(n -> n > 5).forEach(System.out::println);
    }
}
