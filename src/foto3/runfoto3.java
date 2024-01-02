package foto3;

import javax.swing.*;

public class runfoto3 {
    public static void main(String[] args) {
        JFrame data = new JFrame();
        data.setContentPane(new foto3gui().getMain());
        data.setVisible(true);
        data.setSize(1920,1080);
        data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
