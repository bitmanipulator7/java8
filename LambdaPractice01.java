import java.util.ArrayList;

public class LambdaPractice01 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);
        numbers.add(10);
        numbers.add(14);
        System.out.println(numbers);
        numbers.forEach( n -> System.out.print((n + 2) + " ") );
        System.out.println("-----------------------------");
        numbers.forEach( n -> System.out.print((n * n) + " ") );
    }
}
