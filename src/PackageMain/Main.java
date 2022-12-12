package PackageMain;
import Controller.login;
import Model.DatabaseTas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int pil;

        login lgn = new login();
        lgn.loginadmin(1234,5678);

        // Entity.tas tas1 = new Entity.tas();
        DatabaseTas tambah = new DatabaseTas();
        // Entity.petugas ptgs = new Entity.petugas();
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Pilihan ");
            System.out.println("1. ADD TAS");
            System.out.println("2. ADD PETUGAS");
            System.out.println("3. VIEW TAS");
            System.out.println("4. SEARCH TAS");
            System.out.println("5. DELETE TAS");
            System.out.println("6. UPDATE TAS");
            System.out.println("0. Exit");
            System.out.print("Masukkan pilihan : ");
            pil = input.nextInt();
            switch(pil){
                case 1:
                    tambah.tambah();
                    break;
                case 2:
                    // Entity.petugas pgs = new Entity.petugas();
                    // ptgs.petugas1();
                    break;
                case 3:
                    tambah.tampil();
                    // Entity.tas tas1 =new Entity.tas();
                    // tas1.output();

                    // Entity.petugas ptgs = new Entity.petugas();
                    // ptgs.output();
                    break;
                case 4:
                    tambah.MainCari();
                    break;
                case 5:
                    tambah.DeleteTas();
                    break;
                case 6:
                    tambah.MainUpdate();
                    
            }
        }while(pil !=0 );
        
    }

    

}
