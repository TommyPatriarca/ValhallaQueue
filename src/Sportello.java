
class Sportello extends Thread {
    private final int id;
    private final PostOffice postOffice;
    Gui gui2;
    public Sportello(int id, PostOffice postOffice, Gui gui2) {
        this.id = id;
        this.postOffice = postOffice;
        this.gui2=gui2;
    }

    @Override
    public void run() {
        try {
            while (true) {
                postOffice.serveCustomer(id);
                postOffice.setSportelloAvailability(id, true);
                gui2.updateSportelliStatus(id);
                gui2.updateQueueStatus();
                sleep((long) (Math.random() * 1000)+5000); // Per fortuna non è come IRL
                gui2.customerExit(id);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
