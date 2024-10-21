package lab10.assignment_10_5;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        MyThreadAdd thread1 = new MyThreadAdd(queue, 1);
        MyThreadAdd thread2 = new MyThreadAdd(queue, 2);
        MyThreadRemove thread3 = new MyThreadRemove(queue);
        
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        t1.start();
        t2.start();
//        t3.start();
        
        try {
            t1.join();
            t2.join();
//            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(queue.getSize());
        System.out.println(queue.toString());
        
    }
}
