package view;

import Controller.PetugasController;

import java.util.Scanner;

public class PetugasPage_CLI {

    public PetugasPage_CLI(){

    }

    PetugasController petugas_c = new PetugasController();
    Scanner input = new Scanner(System.in);

    public void menu(){
        int pilih;
        do{
            System.out.println("\n"
                    +" == Menu Utama == "+"\n"
                    +"1. VIEW PETUGAS"+"\n"
                    +"2. INSERT PETUGAS"+"\n"
                    +"3. UPDATE PETUGAS"+"\n"
                    +"4. DELETE PETUGAS"+"\n"
                    +"0.Exit"+"\n"
                    +"Pilih : ");
            pilih = input.nextInt();

            switch(pilih){
                case 1:
                    view();
                    break;
                case 2:
                    insert();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    Delete();
                    break;
                default:
                    System.out.println("pilihan tidak ada!!");

            }
        }while(pilih != 0);
    }

    public void insert(){
        System.out.print("Id Petugas        : ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Nama Petugas      : ");
        String nama = input.nextLine();
        System.out.print("Telepon Petugas   : ");
        String telepon = input.nextLine();
        System.out.print("Password Petugas  : ");
        String password = input.nextLine();
        petugas_c.insert(id,nama,telepon,password);
    }

    public void update(){
        System.out.print("Masukkan index petugas : ");
        int index = input.nextInt();
        System.out.print("Id Petugas        : ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Nama Petugas      : ");
        String nama = input.nextLine();
        System.out.print("Telepon Petugas   : ");
        String telepon = input.nextLine();
        System.out.print("Password Petugas  : ");
        String password = input.nextLine();
        petugas_c.update(index,id,nama,telepon,password);
    }

    public void Delete(){
        int kodebarang;
        System.out.print("index yang akan dihapus ? : ");
        kodebarang = input.nextInt();
        petugas_c.delete(kodebarang);
    }

    public void view(){
        for(int i = 0; i<petugas_c.petugas_m.getDataPetugas().size(); i++){
            System.out.println("========================");
            System.out.println("id       : "+petugas_c.petugas_m.getDataPetugas().get(i).getId());
            System.out.println("nama     : "+petugas_c.petugas_m.getDataPetugas().get(i).getNama());
            System.out.println("telepon  : "+petugas_c.petugas_m.getDataPetugas().get(i).getTelepon());
            System.out.println("password : "+petugas_c.petugas_m.getDataPetugas().get(i).getPassword());

        }
        System.out.println("========================");
    }


}
