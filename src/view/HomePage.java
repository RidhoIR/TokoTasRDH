package view;

import java.util.Scanner;

public class HomePage {

    Scanner input = new Scanner(System.in);
//    PetugasPage_CLI petugas_p = new PetugasPage_CLI();
    TasPage_CLI tas_p = new TasPage_CLI();

    public void menuUtama(){
        int pilih;
        do{
            System.out.println("\n"
                    +" == Menu Utama == "+"\n"
                    +"1. DATA TAS"+"\n"
                    +"2. DATA PETUGAS"+"\n"
                    +"0.Exit"+"\n"
                    +"Pilih : ");
            pilih = input.nextInt();

            switch(pilih){
                case 1:
                    tas_p.menu();
                    break;
                case 2:
//                    petugas_p.menu();
                    break;
                default:
                    System.out.println("pilihan tidak ada!!");

            }
        }while(pilih != 0);
    }
}
