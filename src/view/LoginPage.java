package view;

import java.util.Scanner;

public class LoginPage {
    Scanner input = new Scanner(System.in);
//    LoginController lgn = new LoginController();

    public void login(){
        System.out.print("Masukkan ID User : ");
        int id1 = input.nextInt();
        System.out.print("Masukkan Password : ");
        int pw = input.nextInt();
//        lgn.loginadmin(id1,pw);
    }


}
