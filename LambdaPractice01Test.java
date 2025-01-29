import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class LambdaPractice01Test {

    @Test
    public void testAddTwo() {
        LambdaPractice01 practice01 = new LambdaPractice01();
        List<Integer> input = new ArrayList<>();
        input.add(8);
        input.add(1);
        input.add(4);
        input.add(10);
        input.add(14);

        List<Integer> expected = new ArrayList<>();
        expected.add(10);
        expected.add(3);
        expected.add(6);
        expected.add(12);
        expected.add(14);

        List<Integer> actual = practice01.addTwo(input);
        assertEquals(expected, actual, "The lists should match after adding two to each element");
    }
}
