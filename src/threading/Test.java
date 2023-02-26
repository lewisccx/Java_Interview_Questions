package threading;

public class Test implements Runnable {
    public static Thread thread1;
    public static Test obj;

    public static void main(String[] args)
    {
        obj = new Test();
        thread1 = new Thread(obj);

        // thread1 created and is currently in the NEW
        // state.
        System.out.println(
                "State of thread1 after creating it - "
                        + thread1.getState());
        thread1.start();

        // thread1 moved to Runnable state
        System.out.println(
                "State of thread1 after calling .start() method on it - "
                        + thread1.getState());
    }

    public void run()
    {
        thread myThread = new thread();
        Thread thread2 = new Thread(myThread);

        // thread1 created and is currently in the NEW
        // state.
        System.out.println(
                "State of thread2 after creating it - "
                        + thread2.getState());
        thread2.start();

        // thread2 moved to Runnable state
        System.out.println(
                "State of thread2 after calling .start() method on it - "
                        + thread2.getState());

        // moving thread1 to timed waiting state
        try {
            // moving thread1 to timed waiting state
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
                "State of thread2 after calling .sleep() method on it - "
                        + thread2.getState());

        try {
            // waiting for thread2 to die
            thread2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
                "State of thread2 when it has finished it's execution - "
                        + thread2.getState());
    }
}

//Explanation: When a new thread is created, the thread is in the NEW state.
//When the start() method is called on a thread, the thread scheduler moves it to Runnable state.
//Whenever the join() method is called on a thread instance, the current thread executing that statement
//will wait for this thread to move to the Terminated state. So, before the final statement is printed on the console,
//the program calls join() on thread2 making the thread1 wait while thread2 completes its execution and
//is moved to the Terminated state. thread1 goes to Waiting state
//because it is waiting for thread2 to complete its execution as it has called join on thread2.
