package DAY8.CW1;

class MyThread extends Thread{
    public void run(){
        System.out.println("MyThread is running: "+Thread.currentThread().getName());
    }
}

public class ByExtendingThreadClass {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
    }
}
