package poto2;

import javax.swing.*;

public class runpoto2 {
    public static void main(String[] args) {
        JFrame data = new JFrame("Restoran Exsotic");
        data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        data.setSize(1920,1080);
        data.setVisible(true);
        data.setContentPane(new poto2gui().getMain());
    }
}
