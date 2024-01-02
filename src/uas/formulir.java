package uas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formulir {
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox bln;
    private JComboBox year;
    private JComboBox tgl;
    private JTextField textField3;
    private JButton prosesButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JTextArea textArea4;
    private JTextArea textArea5;
    private JPanel main;

    public JPanel getMain(){return main;}

    public formulir(){
        prosesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setgetform abcd = new setgetform();
                abcd.setNama(textField1.getText());
                abcd.setNim(Integer.parseInt(textField2.getText()));
                abcd.setTtl(Integer.parseInt((String) tgl.getSelectedItem()),
                        bln.getSelectedIndex() + 1,Integer.parseInt ((String) year.getSelectedItem())
                );
                abcd.setAlamat(textField3.getText());
                textArea1.setText("Nama          :" + " " + abcd.getNama());
                textArea2.setText("Nim           :" + " " + abcd.getNim());
                textArea3.setText("Tanggal Lahir :" + " " + abcd.getTtl());
                textArea4.setText("Alamat        :" + " " + abcd.getAlamat());
                textArea5.setText("Usia          :" + " " + abcd.umur());
            }
        });
    }
}
