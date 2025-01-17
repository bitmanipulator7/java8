class LambdaPractice02 {
    public static void main(String[] args) {
        //StringFunction exclaim = s -> s + "!";
        StringFunction exclaim = new StringFunction() {
            public String run(String str) {
                return str + "!";
            }
        };
        StringFunction ask = s -> s + "?";
        StringFunction smile = n -> n + " :) ";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
        printFormatted("Hello", smile);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}

interface StringFunction {
    String run(String str);
}