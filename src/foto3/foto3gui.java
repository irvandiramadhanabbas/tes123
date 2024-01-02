package foto3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class foto3gui {
    private JPanel main;
    private JTextField textField1;
    private JTextField textField2;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton hitungButton;

    public JPanel getMain(){return main;}

    public foto3gui() {
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto3 abcd = new foto3();
                abcd.setRiau(Integer.parseInt(textField1.getText()));
                abcd.setSumut(Integer.parseInt(textField2.getText()));
                textArea1.setText("pajak riau : " + abcd.getRiau()*5/100);
                textArea2.setText("pajak lainnya : " + abcd.getSumut()*3.5/100);
            }
        });
    }
}
