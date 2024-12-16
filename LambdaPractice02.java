public class LambdaPractice02 {
    public static void main(String[] args) {
        //StringFunction exclaim = s -> s + "!";
        // Instead of using lambda expressions, we can write a anonymous class for implementing explain
        StringFunction exclaim = new StringFunction() {
            public String run(String str) {
                return str + "!";
            }
        };
        StringFunction ask = s -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}

interface StringFunction {
    String run(String str);
}