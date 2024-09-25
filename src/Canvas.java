import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Canvas extends JPanel {

    Graphics g;

    @Override
    public void paint(Graphics g){

        Image img=null;
        try {
            img = ImageIO.read(new File("test.png"));
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        g.drawImage(img, 0, 0, null);
    }

}
