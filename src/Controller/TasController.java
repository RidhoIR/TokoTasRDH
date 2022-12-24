package Controller;
import Entity.*;
import Model.*;

import java.util.ArrayList;

public class TasController {
    public TasModel tas_model = new TasModel();

    public TasController(){

    }

    public ArrayList<Tas> view(){
        return tas_model.getDataTas();

    }

    public void insert(int KodeBarang, String nama, String merk,String warna, String Gender, String Jenis){
        Tas tas = new Tas();
        tas.setKodebarang(KodeBarang);
        tas.setNama(nama);
        tas.setMerk(merk);
        tas.setWarna(warna);
        tas.setJenis(Jenis);
        tas.setGender(Gender);
        tas_model.insert(tas);
    }

    public void update(int index,int KodeBarang, String nama, String merk,String warna, String Gender, String Jenis){
        Tas tas = new Tas();
        tas.setKodebarang(KodeBarang);
        tas.setNama(nama);
        tas.setMerk(merk);
        tas.setWarna(warna);
        tas.setJenis(Jenis);
        tas.setGender(Gender);
        tas_model.update(index,tas);
    }

    public void delete(int index){
        tas_model.delete(index);
    }

    public int cekBuku(String KodeBarang){
        int keterangan = -1;
        if(tas_model.getDataTas().size()>0){
            for(int i=0;i<tas_model.getDataTas().size();i++){
                if(KodeBarang.equals(tas_model.getDataTas().get(i).getKodeBarang())){
                    keterangan = i;
                    break;
                }else{
                    keterangan = -1;
                }
            }
        }
        return keterangan;
    }

    public Tas lihatDaftarTas(int index){
        return tas_model.getDataTas().get(index);
    }



}
