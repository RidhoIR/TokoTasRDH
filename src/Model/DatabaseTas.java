package Model;

import Entity.Tas;

import java.util.Scanner;
import java.util.ArrayList;

public class DatabaseTas {
    
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
            System.out.println("kode : "+objektas.get(i).kodeBarang);
            System.out.println("Tipe : "+objektas.get(i).nama);
            System.out.println("Merk : "+objektas.get(i).merk);
            System.out.println("Warna : "+objektas.get(i).warna);
            System.out.println("Jenis : "+objektas.get(i).jenis);
            System.out.println("Gender : "+objektas.get(i).gender);
            
        }
        System.out.println("========================");
    }

    public Tas FindByID(int kode){
        for (Entity.Tas Tas:objektas){
            if(Tas.kodeBarang == kode){
                System.out.println("========================");
                System.out.println("kode : "+Tas.kodeBarang);
                System.out.println("Tipe : "+Tas.nama);
                System.out.println("Merk : "+Tas.merk);
                System.out.println("Warna : "+Tas.warna);
                System.out.println("Jenis : "+Tas.jenis);
                System.out.println("Gender : "+Tas.gender);
                return Tas;
            }
        }
        return null;
    }

    public void MainCari(){
        int kodebarang;
        System.out.print("Masukkan kode : ");
        kodebarang = input.nextInt();
        FindByID(kodebarang);
    }
        
    public void DeletebyID(int kode){
        Tas caritas = FindByID(kode);
        if(caritas!=null){
            objektas.remove(caritas);
        }
    }

    public void DeleteTas(){
        int kodebarang;
        System.out.print("Kode yang akan dihapus ? : ");
        kodebarang = input.nextInt();
        DeletebyID(kodebarang);
    }

    public int indexData(Tas Tas){
        int index = objektas.indexOf(Tas);
        return index;
    }

    public void UpdateTas(int KodeBarang, String nama, String merk, String warna, String gender, String jenis){
        Tas caritas = FindByID(KodeBarang);

        if(caritas != null){
            int index = indexData(caritas);
            objektas.get(index).setKodebarang(KodeBarang);;
            objektas.get(index).setNama(nama);
            objektas.get(index).setMerk(merk);
            objektas.get(index).setWarna(warna);
            objektas.get(index).setJenis(jenis);
            objektas.get(index).setGender(gender);
        }
    }

    public void MainUpdate(){
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
        UpdateTas(kode, nama, merk, warna, gender, jenis);
    }


}
