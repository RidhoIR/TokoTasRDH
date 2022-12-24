package view;
import Controller.login;

import java.util.Scanner;

public class LoginPage_CLI {
    Scanner input = new Scanner(System.in);
    login lgn = new login();

    public void login(){
        System.out.print("Masukkan ID User : ");
        int id1 = input.nextInt();
        System.out.println("Masukkan Password : ");
        int pw = input.nextInt();
        lgn.loginadmin(id1,pw);
    }


}
