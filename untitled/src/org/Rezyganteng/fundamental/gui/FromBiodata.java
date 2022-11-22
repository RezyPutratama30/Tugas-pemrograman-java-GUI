package org.Rezyganteng.fundamental.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FromBiodata {
    private JTextField TextNama;
    private JTextField TextAlamat;
    private JTextField TextNo;
    private JTextField TextTTL;
    private JButton clickButton;
    private JPanel rootpanel;
    private JLabel LabelDataAkhir;

    public FromBiodata() {
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String NamaLengkap=TextNama.getText();
                String Alamat=TextAlamat.getText();
                String NoPendaftaran=TextNo.getText();
                String TTL=TextTTL.getText();
                Dosen dsn=new Dosen();
                dsn.setNamaLengkap(NamaLengkap);
                dsn.setAlamat(Alamat);
                dsn.setNoPendaftaran(NoPendaftaran);
                dsn.setTTL(TTL);

                LabelDataAkhir.setText(dsn.toString());

            }
        });
    }

    public JPanel getRootpanel() {
        return rootpanel;
    }
}
