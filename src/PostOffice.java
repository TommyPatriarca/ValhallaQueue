import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;
class PostOffice {
    private static final int MAX_QUEUE_SIZE = 10;
    public static final int NUM_SPORTS = 4;
    private Queue<Integer> queue = new LinkedList<>();
    private boolean[] sportsAvailable = new boolean[NUM_SPORTS];

    public PostOffice() {
        for (int i = 0; i < NUM_SPORTS; i++) {
            sportsAvailable[i] = true;
        }
    }

    public synchronized void addCustomer() {
        if (queue.size() < MAX_QUEUE_SIZE) {
            int customerId = (int) Math.random()*1000;// Genera id
            queue.add(customerId);
            notify(); // damn non va l'id
        } else {
            System.out.println("Coda piena.");
        }
        /*
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

         */
    }

    public synchronized int serveCustomer(int sportelloId) throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Sportello " + sportelloId + " aspetta un cliente.");
            wait(); // aspetta un cliunte
        }

        int customerId = queue.remove();
        System.out.println("Sportello " + sportelloId + " serve il cliente " + customerId);
        return customerId;
    }

    public synchronized boolean isSportelloAvailable(int sportelloId) {
        return sportsAvailable[sportelloId];
    }

    public synchronized void setSportelloAvailability(int sportelloId, boolean available) {
        sportsAvailable[sportelloId] = available;
    }

    public synchronized Queue<Integer> getQueue() {
        return queue;
    }
}
