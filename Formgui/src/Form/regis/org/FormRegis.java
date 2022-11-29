package Form.regis.org;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FormRegis {
    private JTextField textNo;
    private JComboBox comboATM;
    private JComboBox comboBank;
    private JTextField textNama;
    private JButton simpanButton;
    private JTextArea outputLine;
    private JLabel JPict;
    private JButton browseButton;

    public String filename;
    private Container rootP;

    public void insertingDataToFile(String inputtedData) throws IOException {
        try {
            FileWriter myFile = new FileWriter("fileData.txt", true);
            myFile.write(inputtedData);
            myFile.close();
            System.out.println("Succesfully wrote to the file");
        } catch (IOException ex) {
            System.out.println("An error occured");
            ex.printStackTrace();
        }
    }


    public FormRegis() {
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String no = textNo.getText();
                String atm = (String) comboATM.getSelectedItem();
                String bank = (String) comboBank.getSelectedItem();
                String nama = textNama.getText();

                Rezz data = new Rezz();
                data.setNo(no);
                data.setAtm(atm);
                data.setBank(bank);
                data.setNama(nama);

                String Hasil = "Saved!" + "\nNo Kartu = " + no + "\nJenis ATM = " + atm + "\nBank = " + bank +
                        "\nNama Pemilik = " + nama + "\nNama File Gambar = " + filename;

                outputLine.append(Hasil);



            }
        });
        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser Uploadfoto = new JFileChooser();

                int showOpenDialogue = Uploadfoto.showOpenDialog(null);

                if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
                    filename = Uploadfoto.getSelectedFile().getName();

                    File pilihfoto = Uploadfoto.getSelectedFile();
                    String pilihfotoPath = pilihfoto.getAbsolutePath();

                    ImageIcon ii = new ImageIcon(pilihfotoPath);
                    Image image = ii.getImage().getScaledInstance(JPict.getWidth(), JPict.getHeight(), Image.SCALE_SMOOTH);

                    JPict.setIcon(new ImageIcon(image));
                }
                try {
                    insertingDataToFile(  "\n\n");
                    filename = null;
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }




    public void setRootP(Container rootP) {
        this.rootP = rootP;
    }

    public Container getRootP() {

        return getRootP();
    }
}
