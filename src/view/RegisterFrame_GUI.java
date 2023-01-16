package view;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//import controler.Auth;
import Entity.Petugas_Entity;
import Controller.*;

import java.awt.Font;

public class RegisterFrame_GUI extends MainFrame_GUI {

    private JLabel IdLabel, namaLabel, noTelpLabel, passLabel, pinLabel, daftarLabel;
    private JTextField IdField, namaField, noTelpField, passField, pinField;
    private JButton daftarButton;

    public RegisterFrame_GUI(){
        super("Register", 400, 400);
        component();
        event();
    }

    protected void component(){

        IdLabel = new JLabel("Id");
        setFontSize(IdLabel, 15);
        setFontStyle(IdLabel, Font.PLAIN);
        boundedAdd(IdLabel, 33, 47, 43, 21);

        IdField = new JTextField();
        boundedAdd(IdField, 145, 44, 217, 28);

        namaLabel = new JLabel("Username");
        setFontSize(namaLabel, 15);
        setFontStyle(namaLabel, Font.PLAIN);
        boundedAdd(namaLabel, 34, 90, 72, 21);

        namaField = new JTextField();
        boundedAdd(namaField, 145, 83, 217, 28);

        noTelpLabel = new JLabel("No Telp");
        setFontSize(noTelpLabel, 15);
        setFontStyle(noTelpLabel, Font.PLAIN);
        boundedAdd(noTelpLabel, 33, 132, 73, 21);

        noTelpField = new JTextField();
        boundedAdd(noTelpField, 145, 125, 217, 28);

        passLabel = new JLabel("Password");
        setFontSize(passLabel, 15);
        setFontStyle(passLabel, Font.PLAIN);
        boundedAdd(passLabel, 34, 170, 67, 21);

        passField = new JTextField();
        boundedAdd(passField, 145, 167, 217, 28);


        daftarButton = new JButton("Daftar");
        boundedAdd(daftarButton, 252, 291, 84, 25);
    }

    protected void event(){

        daftarButton.addActionListener(e -> {
            String Id = IdField.getText();
            String nama = namaField.getText();
            String noTelp = noTelpField.getText();
            String password = passField.getText();

            Petugas_Entity petugas = new Petugas_Entity(Id,nama,noTelp,password);

            if (AllObjekController.petugas_c.register(petugas)) {
                JOptionPane.showMessageDialog(null,"berhasil",
                        "information",JOptionPane.INFORMATION_MESSAGE);
                new LoginFrame_GUI().setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Akun sudah pernah dibuat !");
            }
        });

    }

}