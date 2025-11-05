import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("BorderLayout Example");
        f.setLayout(new BorderLayout());

        f.add(new JButton("NORTH"), BorderLayout.NORTH);
        f.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        f.add(new JButton("EAST"), BorderLayout.EAST);
        f.add(new JButton("WEST"), BorderLayout.WEST);
        f.add(new JButton("CENTER"), BorderLayout.CENTER);

        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
