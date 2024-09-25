import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();

        SwingUtilities.invokeLater(() -> {
            Gui gui2=new Gui(postOffice);
            new QueueUpdaterThread(gui2).start();

            for (int i = 0; i < PostOffice.NUM_SPORTS; i++) {
                new Sportello(i, postOffice, gui2).start();
            }
        });
    }
}