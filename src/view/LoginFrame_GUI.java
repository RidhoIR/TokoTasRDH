package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import java.awt.*;

public class LoginFrame_GUI extends MainFrame_GUI {
    private JLabel userLabel, passLabel, logoLabel, registLabel,iconLabel;
    private JTextField UsernameField;
    private JPasswordField PasswordField;
    private JButton loginButton, registButton;
    private ImageIcon logo = new ImageIcon("src/assets/mylogo.png");

    public LoginFrame_GUI(){
        super("Login",415, 560);
        // component();
        // event();
    }

    protected void component(){

//        setBackground(Color.decode("#0000"));


        ImageIcon imgLoad = loadImage("src/assets/mylogo.png", 500, 500);
        iconLabel = new JLabel(imgLoad);
        boundedAdd(iconLabel, 103, 50, 195, 195);

//        logoLabel = new JLabel();
//        logoLabel.setText("RDH-Store");
//        logoLabel.setIcon(logo);
//        setFontSize(logoLabel, 20);
//        setFontStyle(logoLabel, Font.BOLD);
//        logoLabel.setHorizontalTextPosition(JLabel.CENTER);
//        logoLabel.setVerticalTextPosition(JLabel.BOTTOM);
//        boundedAdd(logoLabel, 140, 30, 200, 200);

        userLabel = new JLabel("Username");
        setFontSize(userLabel, 15);
        setFontStyle(userLabel, Font.BOLD);
        boundedAdd(userLabel, 41, 245, 67, 20);

        UsernameField = new JTextField();
        setFontSize(UsernameField,15);
        boundedAdd(UsernameField, 41, 270, 334, 38);

        passLabel = new JLabel("Password");
        setFontSize(passLabel, 15);
        setFontStyle(passLabel, Font.PLAIN);
        boundedAdd(passLabel, 41, 320, 62, 20);

        PasswordField = new JPasswordField();
        setFontSize(PasswordField,15);
        boundedAdd(PasswordField, 41, 345, 334, 38);

        registLabel = new JLabel("Belum punya account?");
        setFontSize(registLabel, 13);
        setFontStyle(registLabel, Font.PLAIN);
        boundedAdd(registLabel, 160, 410, 150, 20);

        loginButton = new JButton("Login");
        loginButton.setBackground(color("#E6E6FA"));
        loginButton.setForeground(color("#00000"));
//        loginButton.setBorderPainted(false);
        loginButton.setFocusPainted(false);
        boundedAdd(loginButton, 165, 480, 85, 30);

        registButton = new JButton("Daftar");
        registButton.setBackground(new Color(255,255,0));
        registButton.setForeground(color("#00000"));
        setFontSize(registButton, 12);
        setFontStyle(registButton, Font.BOLD);
        registButton.setFocusPainted(false);
        registButton.setBorderPainted(false);
        boundedAdd(registButton, 310, 405, 65, 30);

    }

    protected void event(){

        loginButton.addActionListener(e -> {


                AllObjekController.petugas_c.dataPetugas();
                if (AllObjekController.petugas_c.petugas_m.cekPetugas(UsernameField.getText(),PasswordField.getText())){
                    JOptionPane.showMessageDialog(null,"berhasil login",
                            "information",JOptionPane.INFORMATION_MESSAGE);
                    new HomeFrame_GUI().setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"NPM atau password salah","information",JOptionPane.INFORMATION_MESSAGE);
                }





//            if(petugas_c.login(username, password)){
//                JOptionPane.showMessageDialog(null,"berhasil login",
//                        "information",JOptionPane.INFORMATION_MESSAGE);
////                new VerifPinFrame().setVisible(true);
//                dispose();
//            } else{
//                JOptionPane.showMessageDialog(null,
//                        "Username atau Password Salah",
//                        "Login Gagal",
//                        JOptionPane.ERROR_MESSAGE);
//            }

        });

        registButton.addActionListener(e -> {
            new RegisterFrame_GUI().setVisible(true);
            dispose();
        });
    }

}
