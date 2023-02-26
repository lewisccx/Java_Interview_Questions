package threading;

public class TestMyRunnable {
    public static void main(String[] args) {
        MyRunnable myrunnable = new MyRunnable();
        //Passing myrunnable object to Thread class constructor
        Thread t1 = new Thread(myrunnable);
        t1.setName("Amit-1 Thread");
        //Starting Thread t1
        t1.start();
//        t1.start();
//       You can call start() on a Thread object only once. If start() is called more than once on a Thread object, it will throw a Runtime Exception.
        Thread t2 = new Thread(myrunnable);
        t2.setName("Amit-2 Thread");
        t2.start();
    }
}
