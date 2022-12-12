import Entity.Tas;

import java.util.Scanner;
import java.util.ArrayList;

public class tambahtas {
    
    ArrayList<Tas> objektas = new ArrayList<Tas>();
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
        System.out.print("Masukkan jenis : ");
        String jenis = input.nextLine();
        System.out.print("Masukkan Gender : ");
        String gender = input.nextLine();
        objektas.add(new Tas(kode,nama, merk, warna, jenis, gender));
    }

    public void tampil(){
        for(int i = 0; i<objektas.size(); i++){
            System.out.println("========================");
            System.out.println("Tipe : "+objektas.get(i).kodeBarang);
            System.out.println("Tipe : "+objektas.get(i).nama);
            System.out.println("Merk : "+objektas.get(i).merk);
            System.out.println("Warna : "+objektas.get(i).warna);
            System.out.println("Jenis : "+objektas.get(i).jenis);
            System.out.println("Gender : "+objektas.get(i).gender);
            
        }
        System.out.println("========================");
    }
        



}
