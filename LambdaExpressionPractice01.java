public class LambdaExpressionPractice01 {
    public static void main(String[] args) {
        System.out.println("Main thread is - " + Thread.currentThread().getName());
        Thread t1 = new Thread(new LambdaExpressionPractice01().new RunnableImpl());
        t1.start();

        // Traditional way
        Runnable oldWay = new Runnable() {
            public void run() {
                System.out.println("Hello from the traditional way!");
            }
        };
        oldWay.run();

        // Lambda way
        Runnable lambdaWay = () -> System.out.println("Hello from the lambda way!");
        lambdaWay.run();
    }

    private class RunnableImpl implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + ", executing run() method!");
        }
    }
}
