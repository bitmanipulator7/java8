public class MethodReferencePractice03 {
    public static void main(String[] args) {
        Thread t2 = new Thread(MethodReferencePractice03::ThreadStatus);
        t2.start();
    }

    public static void ThreadStatus() {
        System.out.println("Thread is running ...");
    }
}
