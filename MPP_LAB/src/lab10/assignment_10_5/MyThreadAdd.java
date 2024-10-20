package lab10.assignment_10_5;

public class MyThreadAdd implements Runnable {

    Queue queue;
    int seed;
    
    MyThreadAdd(Queue queue) {
        this.queue = queue;
    }
    
    MyThreadAdd(Queue queue, int seed) {
        this.queue = queue;
        this.seed = seed;
    }

    
    @Override
    public void run() {
        int count = seed;
        for (int i = 0; i < 1000; i++) {
//            System.out.println(this.getClass().getName() + "_" + seed + " add " + count);
            queue.add(count);
            count += 2;
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        
    }
    
}
