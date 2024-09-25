import javax.swing.*;
import java.awt.*;
import java.util.Queue;

public class Gui extends JFrame {

    private final PostOffice postOffice;
    private static final int CUSTOMER_DIMENSIONS=15;
    private final Graphics g;
    private int queue_size=0;

    public Gui(PostOffice postOffice) {

        this.postOffice = postOffice;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        Canvas canvas=new Canvas();
        c.add(canvas,BorderLayout.CENTER);
        JButton new_customer=new JButton("Nuovo cliente");
        c.add(new_customer,BorderLayout.SOUTH);
        new_customer.addActionListener(e -> postOffice.addCustomer());
        setBounds(0,0,516,558);
        setResizable(false);

        setVisible(true);
        g=canvas.getGraphics();
    }

    public synchronized void customerExit(int id){
        g.setColor(new Color(255,199,136));
        switch (id){
            case 0->{shadowOut(317,275);}
            case 1->{shadowOut(317,315);}
            case 2->{shadowOut(317,375);}
            case 3->{shadowOut(317,415);}
        }
        g.setColor(Color.BLACK);
    }

    public synchronized void updateSportelliStatus(int id) {
        g.setColor(Color.BLACK);
        switch (id){
            case 0->{primoSportello();}
            case 1->{secondoSportello();}
            case 2->{terzoSportello();}
            case 3->{quartoSportello();}
        }
    }

    private void shadowOut(int x, int y){
        try{
            g.setColor(new Color(18, 18, 17));
            g.fillOval( x,y,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            Thread.sleep(50);
            g.setColor(new Color(31, 29, 28));
            g.fillOval( x,y,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            Thread.sleep(50);
            g.setColor(new Color(41, 39, 36));
            g.fillOval( x,y,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            Thread.sleep(50);
            g.setColor(new Color(74, 67, 60));
            g.fillOval( x,y,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            Thread.sleep(50);
            g.setColor(new Color(105, 92, 77));
            g.fillOval( x,y,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            Thread.sleep(50);
            g.setColor(new Color(135, 116, 93));
            g.fillOval( x,y,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            Thread.sleep(50);
            g.setColor(new Color(168, 142, 111));
            g.fillOval( x,y,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            Thread.sleep(50);
            g.setColor(new Color(209, 169, 123));
            g.fillOval( x,y,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            Thread.sleep(50);
            g.setColor(new Color(255,199,136));
            g.fillOval(x,y,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void shadowIn(){
        try{
            g.setColor(new Color(255,199,136));
            g.fillOval(242,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            Thread.sleep(50);
            g.setColor(new Color(209, 169, 123));
            g.fillOval(242,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            Thread.sleep(50);
            g.setColor(new Color(168, 142, 111));
            g.fillOval(242,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            Thread.sleep(50);
            g.setColor(new Color(135, 116, 93));
            g.fillOval(242,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            Thread.sleep(50);
            g.setColor(new Color(105, 92, 77));
            g.fillOval(242,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            Thread.sleep(50);
            g.setColor(new Color(74, 67, 60));
            g.fillOval(242,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            Thread.sleep(50);
            g.setColor(new Color(41, 39, 36));
            g.fillOval(242,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            Thread.sleep(50);
            g.setColor(new Color(31, 29, 28));
            g.fillOval(242,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            Thread.sleep(50);
            g.setColor(new Color(18, 18, 17));
            g.fillOval(242,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            Thread.sleep(50);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    //MUOVE AL PRIMO SPORTELLO---------------------------------------------------------------------
    private void primoSportello(){
        int x;
        int y;

        shadowIn();

        g.setColor(Color.BLACK);
        g.fillOval( 242,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);

        for(x=0;x<35;x++){
            g.setColor(new Color(255,199,136));
            g.fillOval(242+x,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            g.setColor(Color.BLACK);
            g.fillOval(242+x+1,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for(y=0;y<70;y++){
            g.setColor(new Color(255,199,136));
            g.fillOval(242+x,345-y,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            g.setColor(Color.BLACK);
            g.fillOval(242+x,345-(y+1),CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for(int i=0;i<40;i++){
            g.setColor(new Color(255,199,136));
            g.fillOval(242+x+i,345-y,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            g.setColor(Color.BLACK);
            g.fillOval(242+x+i+1,345-y,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    //MUOVE AL PRIMO SPORTELLO---------------------------------------------------------------------

    //MUOVE AL SECONDO SPORTELLO-------------------------------------------------------------------
    private void secondoSportello(){
        int x;
        int y;

        shadowIn();

        g.setColor(Color.BLACK);
        g.fillOval( 242,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);

        for(x=0;x<75;x++){
            g.setColor(new Color(255,199,136));
            g.fillOval(242+x,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            g.setColor(Color.BLACK);
            g.fillOval(242+x+1,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for(y=0;y<30;y++){
            g.setColor(new Color(255,199,136));
            g.fillOval(242+x,345-y,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            g.setColor(Color.BLACK);
            g.fillOval(242+x,345-(y+1),CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    //MUOVE AL SECONDO SPORTELLO-------------------------------------------------------------------

    //MUOVE AL TERZO SPORTELLO---------------------------------------------------------------------
    private void terzoSportello(){
        int x;
        int y;

        shadowIn();

        for(x=0;x<75;x++){
            g.setColor(new Color(255,199,136));
            g.fillOval(242+x,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            g.setColor(Color.BLACK);
            g.fillOval(242+x+1,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for(y=0;y<30;y++){
            g.setColor(new Color(255,199,136));
            g.fillOval(242+x,345+y,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            g.setColor(Color.BLACK);
            g.fillOval(242+x,345+(y+1),CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    //MUOVE AL TERZO SPORTELLO---------------------------------------------------------------------

    //MUOVE AL QUARTO SPORTELLO--------------------------------------------------------------------
    private void quartoSportello(){
        int x;
        int y;


        shadowIn();

        for(x=0;x<35;x++){
            g.setColor(new Color(255,199,136));
            g.fillOval(242+x,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            g.setColor(Color.BLACK);
            g.fillOval(242+x+1,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for(y=0;y<70;y++){
            g.setColor(new Color(255,199,136));
            g.fillOval(242+x,345+y,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            g.setColor(Color.BLACK);
            g.fillOval(242+x,345+(y+1),CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for(int i=0;i<40;i++){
            g.setColor(new Color(255,199,136));
            g.fillOval(242+x+i,345+y,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            g.setColor(Color.BLACK);
            g.fillOval(242+x+i+1,345+y,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    //MUOVE AL QUARTO SPORTELLO--------------------------------------------------------------------

    public void queueRefresh(boolean[] array, Queue<Integer> queue){

            for(int i=0;i<10;i++){
                if(i>=10-queue.size()){
                    g.setColor(Color.BLACK);
                    g.fillOval(i*22+22,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
                }
                else{
                    g.setColor(new Color(234,117,54));
                    g.fillOval(i*22+22,345,CUSTOMER_DIMENSIONS,CUSTOMER_DIMENSIONS);
                }
            }
            g.setColor(Color.BLACK);
        //}
    }

    public synchronized void updateQueueStatus() {
        Queue<Integer> queue = postOffice.getQueue();
        StringBuilder queueText = new StringBuilder();
        queueText.append("Coda:\n");
        boolean[] array=new boolean[10];
        int i=9;
        for (Integer customerId : queue) {
            if(queue.contains(customerId)){
                array[i]=true;
            }
            i--;
        }
        queueRefresh(array,queue);
        queue_size=queue.size();
    }
}
