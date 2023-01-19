package view;

import Controller.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.*;

public class TasFrame_GUI {
    private static Tas_Controller tas_c = new Tas_Controller();
    JFrame tas = new JFrame();
    JLabel namaLabel,merkLabel,warnaLabel,jenisLabel,genderLabel,kodeLabel,top;
    JTextField namaField,merkField,warnaField,jenisField,genderField,kodeField;
    JButton tambahBtn,updateBtn,hapusBtn;
    JTable tabeltas = new JTable();
    JScrollPane scroll = new JScrollPane(tabeltas);
    int index;

    public TasFrame_GUI(){

        tas.setSize(900,700);
        tas.setLayout(null);
        tas.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("DATA BUKU");
        top.setBounds(130,10,600,50);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        tas.add(top);

        tabeltas.setModel(tas_c.listbuku());
        tas.setBounds(300,180,600,270);
        tas.add(scroll);



        namaLabel = new JLabel("Nama : ");
        tas.setBounds(30,150,100,30);
        tas.add(namaLabel);
        namaField = new JTextField();
        tas.setBounds(30,80,100,20);
        tas.add(namaField);

        merkLabel = new JLabel("Merk");
        tas.setBounds(150,50,80,20);
        tas.add(merkLabel);
        merkField = new JTextField();
        tas.setBounds(30,180,200,30);
        tas.add(merkField);

        warnaLabel = new JLabel("Warna");
        tas.setBounds(30,210,100,30);
        tas.add(warnaLabel);
        warnaField = new JTextField();
        tas.setBounds(30,240,200,30);
        tas.add(warnaField);

        jenisLabel = new JLabel("Jenis");
        tas.setBounds(30,270,100,30);
        tas.add(jenisLabel);
        jenisField = new JTextField();
        tas.setBounds(30,300,200,30);
        tas.add(jenisField);

        genderLabel = new JLabel("Gender");
        tas.setBounds(30,330,200,30);
        tas.add(genderLabel);
        genderField = new JTextField();
        tas.setBounds(30,360,200,30);
        tas.add(genderField);

        kodeLabel = new JLabel("kode");
        tas.setBounds(30,390,200,30);
        tas.add(kodeLabel);
        kodeField = new JTextField();
        tas.setBounds(30,420,200,30);
        tas.add(kodeField);

        tambahBtn = new JButton();
        tambahBtn.setText("Tambah");
        tambahBtn.setHorizontalTextPosition(JButton.CENTER);
        tambahBtn.setVerticalTextPosition(JButton.CENTER);
        tas.setBounds(50,470,150,30);
        tas.add(tambahBtn);

        updateBtn = new JButton();
        updateBtn.setText("Update");
        updateBtn.setHorizontalTextPosition(JButton.CENTER);
        updateBtn.setVerticalTextPosition(JButton.CENTER);
        tas.setBounds(50,510,150,30);
        tas.add(updateBtn);

        hapusBtn = new JButton();
        hapusBtn.setText("Hapus");
        hapusBtn.setHorizontalTextPosition(JButton.CENTER);
        hapusBtn.setVerticalTextPosition(JButton.CENTER);
        tas.setBounds(50,550,150,30);
        tas.add(hapusBtn);

        tas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tas.setVisible(true);
        tas.setLocationRelativeTo(null);

        tambahBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    String kode = kodeField.getText();
                    String nama = namaField.getText();
                    String merk = merkField.getText();
                    String warna =  warnaField.getText();
                    String jenis = jenisField.getText();
                    String gender = genderField.getText();

                    AllObjekController.tas_c.insert(nama,merk,warna,gender,jenis);
                    JOptionPane.showMessageDialog(null,"input sukses",
                            "information",JOptionPane.INFORMATION_MESSAGE);
                    tabeltas.setModel(AllObjekController.tas_c.listbuku());


                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null,"salah"+exception,
                            "information",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } );
    }

}




