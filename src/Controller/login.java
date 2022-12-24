package Controller;
import view.LoginPage_CLI;

import java.util.Scanner;
public class login {
    int id;
    int password;

    public login(){
        id = 1234;
        password = 5678;
    }

    public void loginadmin(int id1, int pw){
        id = id1;
        password = pw;

        LoginPage_CLI login = new LoginPage_CLI();



        if (id1 == id && pw ==password) {
            System.out.println("BERHASIl");

            // Entity.petugas pgs = new Entity.petugas();
            // pgs.petugas1();

            // Entity.tas ts = new Entity.tas();
            // ts.merk1();

        } else {
            System.out.println("GAGAL");
            login.login();

        }
    }
}
