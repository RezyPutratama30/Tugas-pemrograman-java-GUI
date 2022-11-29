import Form.regis.org.FormRegis;

import javax.swing.*;

public class run {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Data");
        jFrame.setContentPane(new FormRegis().getRootP());
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600,500);
        jFrame.setVisible(true);
    }
}