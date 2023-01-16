package view;

import Controller.AllObjekController;
import Controller.Tas_Controller;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HomeFrame_GUI extends MainFrame_GUI {

    private JLabel namaLabel,merkLabel,warnaLabel,jenisLabel,genderLabel,kodeLabel;
    private  JTextField namaField,merkField,warnaField,jenisField,genderField,kodeField;
    private JButton tambahBtn,updateBtn,hapusBtn;
    public JTable tabel = new JTable();
    public JScrollPane scroll = new JScrollPane(tabel);
    int index;
    private static Tas_Controller tas_c = new Tas_Controller();

    public HomeFrame_GUI(){
        super("Home",900,700);
        component();
        event();
    }

    @Override
    protected void component(){

        tabel.setModel(AllObjekController.tas_c.listbuku());
        boundedAdd(scroll,150,200,700,300);



        namaLabel = new JLabel("Nama : ");
        setFontSize(namaLabel,14);
        boundedAdd(namaLabel,30,50,80,20);
        namaField = new JTextField();
        setFontSize(namaField,12);
        boundedAdd(namaField,30,80,100,20);

        merkLabel = new JLabel("Merk");
        setFontSize(merkLabel,14);
        boundedAdd(merkLabel,150,50,80,20);
        merkField = new JTextField();
        setFontSize(merkField,12);
        boundedAdd(merkField,150,80,100,20);

        warnaLabel = new JLabel("Warna");
        setFontSize(warnaLabel,14);
        boundedAdd(warnaLabel,270,50,80,20);
        warnaField = new JTextField();
        setFontSize(warnaField,12);
        boundedAdd(warnaField,270,80,100,20);

        jenisLabel = new JLabel("Jenis");
        setFontSize(jenisLabel,14);
        boundedAdd(jenisLabel,390,50,80,20);
        jenisField = new JTextField();
        setFontSize(jenisField,12);
        boundedAdd(jenisField,390,80,100,20);

        genderLabel = new JLabel("Gender");
        setFontSize(genderLabel,14);
        boundedAdd(genderLabel,510,50,80,20);
        genderField = new JTextField();
        setFontSize(genderField,12);
        boundedAdd(genderField,510,80,100,20);

        kodeLabel = new JLabel("kode");
        setFontSize(kodeLabel,14);
        boundedAdd(kodeLabel,630,50,80,20);
        kodeField = new JTextField();
        setFontSize(kodeField,12);
        boundedAdd(kodeField,630,80,100,20);

        tambahBtn = new JButton();
        tambahBtn.setText("Tambah");
        tambahBtn.setHorizontalTextPosition(JButton.CENTER);
        tambahBtn.setVerticalTextPosition(JButton.CENTER);
        setFontSize(tambahBtn,14);
        boundedAdd(tambahBtn,30,120,100,20);

        updateBtn = new JButton();
        updateBtn.setText("Update");
        updateBtn.setHorizontalTextPosition(JButton.CENTER);
        updateBtn.setVerticalTextPosition(JButton.CENTER);
        setFontSize(updateBtn,14);
        boundedAdd(updateBtn,150,120,100,20);

        hapusBtn = new JButton();
        hapusBtn.setText("Hapus");
        hapusBtn.setHorizontalTextPosition(JButton.CENTER);
        hapusBtn.setVerticalTextPosition(JButton.CENTER);
        setFontSize(hapusBtn,14);
        boundedAdd(hapusBtn,270,120,100,20);


    }

    @Override
    protected void event() {
        tambahBtn.addActionListener(e -> {
            String nama = namaField.getText();
            String merk = merkField.getText();
            String warna =  warnaField.getText();
            String jenis = jenisField.getText();
            String gender = genderField.getText();
            String kode = kodeField.getText();

            try{
                AllObjekController.tas_c.insert(kode,nama,merk,warna,gender,jenis);
                JOptionPane.showMessageDialog(null,"input sukses",
                        "information",JOptionPane.INFORMATION_MESSAGE);
                tabel.setModel(AllObjekController.tas_c.listbuku());
                reset();
            }catch (Exception exception){
                JOptionPane.showMessageDialog(null,"salah"+exception,
                        "information",JOptionPane.INFORMATION_MESSAGE);
            }

        });

        updateBtn.addActionListener(e -> {
            String nama = namaField.getText();
            String merk = merkField.getText();
            String warna =  warnaField.getText();
            String jenis = jenisField.getText();
            String gender = genderField.getText();
            String kode = kodeField.getText();

            try{
                AllObjekController.tas_c.update(index,kode,nama,merk,warna,gender,jenis);
                JOptionPane.showMessageDialog(null,"input sukses",
                        "information",JOptionPane.INFORMATION_MESSAGE);
                tabel.setModel(AllObjekController.tas_c.listbuku());
                reset();
            }catch (Exception exception){
                JOptionPane.showMessageDialog(null,"inputan salah"+exception,
                        "information",JOptionPane.INFORMATION_MESSAGE);
            }

        });

        hapusBtn.addActionListener(e -> {


            try{
                AllObjekController.tas_c.delete(index);
                JOptionPane.showMessageDialog(null,"input sukses",
                        "information",JOptionPane.INFORMATION_MESSAGE);
                tabel.setModel(AllObjekController.tas_c.listbuku());
                reset();
            }catch (Exception exception){
                JOptionPane.showMessageDialog(null,"inputan salah",
                        "information",JOptionPane.INFORMATION_MESSAGE);
            }

        });



        tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabel.getSelectedRow();
                index = i;
                kodeField.setText(AllObjekController.tas_c.listbuku().getValueAt(i,0).toString());
                namaField.setText(AllObjekController.tas_c.listbuku().getValueAt(i,1).toString());
                merkField.setText(AllObjekController.tas_c.listbuku().getValueAt(i,2).toString());
                warnaField.setText(AllObjekController.tas_c.listbuku().getValueAt(i,3).toString());
                jenisField.setText(AllObjekController.tas_c.listbuku().getValueAt(i,4).toString());
                genderField.setText(AllObjekController.tas_c.listbuku().getValueAt(i,5).toString());

            }
        });

    }

    void reset(){
        namaField.setText(null);
        merkField.setText(null);
        warnaField.setText(null);
        jenisField.setText(null);
        genderField.setText(null);
        kodeField.setText(null);
    }
}
