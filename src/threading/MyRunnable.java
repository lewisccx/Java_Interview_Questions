package threading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int x =1; x < 10; x++) {
            System.out.println("MyRunnable running for Thread Name: " + Thread.currentThread().getName());
        }
    }
}
