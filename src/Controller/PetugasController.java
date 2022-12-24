package Controller;

import Entity.Tas;
import Model.PetugasModel;

import java.util.Scanner;

public class PetugasController {

    PetugasModel ptgs = new PetugasModel();
    Scanner input = new Scanner(System.in);

    public void tambah(){
        System.out.print("Kode Barang : ");
        int kode = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Tipe Tas : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Merk : ");
        String merk = input.nextLine();
        System.out.print("Masukkan Warna : ");
        String warna = input.nextLine();
        ptgs.insert(kode,nama, merk, warna);
    }

    public void update(){
        System.out.print("id : ");
        int kode = input.nextInt();
        input.nextLine();
        System.out.print("Masukan nama baru : ");
        String nama = input.nextLine();
        System.out.print("Masukkan telepon baru : ");
        String merk = input.nextLine();
        System.out.print("Masukkan password baru : ");
        String warna = input.nextLine();
        ptgs.Update(kode, nama, merk, warna);
    }

    public void Delete(){
        int kodebarang;
        System.out.print("Id yang akan dihapus ? : ");
        kodebarang = input.nextInt();
        ptgs.delete(kodebarang);
    }


}
