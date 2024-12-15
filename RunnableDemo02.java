import java.io.File;
import java.io.FileNotFoundException;

public class RunnableDemo02 {
    public static void main(String[] args) {
        System.out.println("Main thread is - " + Thread.currentThread().getName());
        Thread t1 = new Thread(new RunnableDemo02().new RunnableImpl());
        t1.start();
    }

    private class RunnableImpl implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + ", executing run method!");

            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                System.out.println("Catch exception here!");
                e.printStackTrace();
            }

            int r = 1 / 0;
            throw new NullPointerException();
        }

    }
}
