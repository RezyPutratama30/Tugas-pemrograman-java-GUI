package org.Rezyganteng.fundamental.gui;

import javax.swing.*;

public class RunFromBiodata {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("Formulir Pendaftaran Anggota");
        jFrame.setContentPane(new FromBiodata().getRootpanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(800,600);
        jFrame.setVisible(true);
    }
}
