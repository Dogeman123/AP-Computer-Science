package Prog52aForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prog52aForm {
    private JPanel mainpanel;
    private JTextField txtlen;
    private JTextField txtwid;
    private JButton CalculateButton;
    private JButton ClearButton;
    private JLabel lblArea;
    private JLabel lblPerim;
    public Prog52aForm() {
        CalculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int len = Integer.parseInt(txtlen.getText());
                int wid = Integer.parseInt(txtwid.getText());
                int area = len * wid;
                int perim = 2 * len + 2 * wid;
                lblArea.setText("Area: " + area);
                lblPerim.setText("Perimeter: " + perim);

            }
        });
        ClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblArea.setText("Area: ");
                lblPerim.setText("Perimeter: ");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Prog52aForm");
        frame.setContentPane(new Prog52aForm().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
