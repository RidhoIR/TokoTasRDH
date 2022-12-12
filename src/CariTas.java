import Entity.Tas;

import java.util.ArrayList;

public class CariTas {

    static ArrayList<Tas> objektas = new ArrayList<Tas>();
    // Scanner input = new Scanner(System.in);


    // public CariTas(){
    //     OutputByKode();
    // }
    
    public static void FindTasByKode(String nama){
        for(Entity.Tas Tas:objektas){
            if(Tas.getNama().equals(nama)){
                System.out.println("========================");
                System.out.println("kode : "+Tas.getKodeBarang());
                System.out.println("Tipe : "+Tas.getNama());
                System.out.println("Merk : "+Tas.getMerk());
                System.out.println("Warna : "+Tas.getWarna());
                System.out.println("Jenis : "+Tas.getJenis());
                System.out.println("Gender : "+Tas.getGender());
            }else{
                System.out.println("data tidak ditemukan");
                break;
            }
            
        }
        
    }
}
