package Controller;

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

        Scanner loginn = new Scanner(System.in);

        System.out.print("Masukkan ID User : ");
        id1 = loginn.nextInt();

        System.out.print("Masukkan Password : ");
        pw = loginn.nextInt();

        if (id1 == id && pw ==password) {
            System.out.println("BERHASIl");

            // Entity.petugas pgs = new Entity.petugas();
            // pgs.petugas1();

            // Entity.tas ts = new Entity.tas();
            // ts.merk1();

        } else {
            System.out.println("GAGAL");
            login lgn = new login();
            lgn.loginadmin(1234,5678);

        }
    }
}
