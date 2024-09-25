import java.awt.*;

class QueueUpdaterThread extends Thread {
    private final Gui gui2;

    public QueueUpdaterThread(Gui gui2) {
        this.gui2=gui2;
    }

    @Override
    public void run() {
        while (true) {
            gui2.updateQueueStatus();
        }
    }
}