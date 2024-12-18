import java.util.*;

public class StreamOperationsPractice04 {
    // process streams in parallel
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //Using parallel stream for parallel processing
        int sum = numbers.parallelStream().reduce(0, Integer::sum);
        System.out.println("Sum :: " + sum);
        // parallelStream() allows the stream to process elements in parallel,
        // potentially speeding up computations on large datasets
    }
}
