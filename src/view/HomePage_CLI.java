package view;

import java.util.Scanner;
import Controller.*;

public class HomePage_CLI {
    Scanner input = new Scanner(System.in);
    public TasController tas = new TasController();

    public void menuUtama(){
        int pilih;
        do{
            System.out.println("\n"
                    +" == Menu Utama == "+"\n"
                    +"1. VIEW TAS"+"\n"
                    +"2. INSERT TAS"+"\n"
                    +"3. UPDATE TAS"+"\n"
                    +"4. DELETE TAS"+"\n"
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
                    Update();
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
        tas.insert(kode,nama,merk,warna,jenis,gender);
    }
    public void Update(){
        System.out.print("index barang ke - : ");
        int index = input.nextInt();
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
        tas.update(index,kode,nama,merk,warna,jenis,gender);
    }

        public void Delete(){
        int kodebarang;
        System.out.print("index yang akan dihapus ? : ");
        kodebarang = input.nextInt();
        tas.delete(kodebarang);
    }

    public void view(){
        for(int i = 0; i<tas.tas_model.getDataTas().size(); i++){
            System.out.println("========================");
            System.out.println("kode : "+tas.tas_model.getDataTas().get(i).getKodeBarang());
            System.out.println("Tipe : "+tas.tas_model.getDataTas().get(i).getNama());
            System.out.println("Merk : "+tas.tas_model.getDataTas().get(i).getMerk());
            System.out.println("Warna : "+tas.tas_model.getDataTas().get(i).getWarna());
            System.out.println("Jenis : "+tas.tas_model.getDataTas().get(i).getJenis());
            System.out.println("Gender : "+tas.tas_model.getDataTas().get(i).getGender());

        }
        System.out.println("========================");
    }




    //    public void UpdateTas(int KodeBarang, String nama, String merk, String warna, String gender, String jenis){
//        Tas caritas = FindByID(KodeBarang);
//
//        if(caritas != null){
//            int index = indexData(caritas);
//            objektas.get(index).setKodebarang(KodeBarang);;
//            objektas.get(index).setNama(nama);
//            objektas.get(index).setMerk(merk);
//            objektas.get(index).setWarna(warna);
//            objektas.get(index).setJenis(jenis);
//            objektas.get(index).setGender(gender);
//        }
//    }
//
//
//    public Tas FindByID(int kode){
//        for (Entity.Tas Tas:objektas){
//            if(Tas.kodeBarang == kode){
//                System.out.println("========================");
//                System.out.println("kode : "+Tas.kodeBarang);
//                System.out.println("Tipe : "+Tas.nama);
//                System.out.println("Merk : "+Tas.merk);
//                System.out.println("Warna : "+Tas.warna);
//                System.out.println("Jenis : "+Tas.jenis);
//                System.out.println("Gender : "+Tas.gender);
//                return Tas;
//            }
//        }
//        return null;
//    }
//
//    public void MainCari(){
//        int kodebarang;
//        System.out.print("Masukkan kode : ");
//        kodebarang = input.nextInt();
//        FindByID(kodebarang);
//    }
//
//    public void DeletebyID(int kode){
//        Tas caritas = FindByID(kode);
//        if(caritas!=null){
//            objektas.remove(caritas);
//        }
//    }
//

//
//    public int indexData(Tas Tas){
//        int index = objektas.indexOf(Tas);
//        return index;
//    }
//
//

}
