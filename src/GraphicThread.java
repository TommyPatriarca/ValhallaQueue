public class GraphicThread extends Thread{

    private final PostOffice postOffice;
    Gui gui2;

    public GraphicThread(PostOffice postOffice, Gui gui2) {
        this.postOffice = postOffice;
        this.gui2=gui2;
    }

    @Override
    public void run(){

    }
}
