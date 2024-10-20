package lab10.assignment_10_5;

public class MyThreadRemove implements Runnable {

    Queue queue;
    
    MyThreadRemove(Queue queue) {
        this.queue = queue;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            queue.remove();
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        
    }
    
}
