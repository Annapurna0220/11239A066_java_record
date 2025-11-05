import java.applet.Applet;
import java.awt.*;

/*
<applet code="FaceApplet" width=300 height=300></applet>
*/

public class FaceApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 150, 150); // Face

        g.setColor(Color.black);
        g.fillOval(90, 90, 15, 25);  // Left eye
        g.fillOval(145, 90, 15, 25); // Right eye

        g.drawArc(90, 130, 70, 40, 0, -180); // Smile
    }
}
