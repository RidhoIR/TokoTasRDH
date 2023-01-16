package Controller;
import Entity.*;
import Model.*;
import view.AllObjekController;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Tas_Controller {
    public TasModel tas_model = new TasModel();

    public Tas_Controller(){

    }

    public ArrayList<Tas> view(){
        return tas_model.getDataTas();

    }

    public void insert(String KodeBarang, String nama, String merk,String warna, String Gender, String Jenis){
        Tas tas = new Tas();
        tas.setKodebarang(KodeBarang);
        tas.setNama(nama);
        tas.setMerk(merk);
        tas.setWarna(warna);
        tas.setJenis(Jenis);
        tas.setGender(Gender);
        tas_model.insert(tas);
    }

    public void update(int index,String KodeBarang, String nama, String merk,String warna, String Gender, String Jenis){
        Tas tas = new Tas();
        tas.setKodebarang(KodeBarang);
        tas.setNama(nama);
        tas.setMerk(merk);
        tas.setWarna(warna);
        tas.setJenis(Jenis);
        tas.setGender(Gender);
        tas_model.update(index,tas);
    }

    public DefaultTableModel listbuku(){
        DefaultTableModel dtmlisttas = new DefaultTableModel();
        Object[] kolom ={"Kode","Nama","Merk","Warna","Jenis","Gender"};
        dtmlisttas.setColumnIdentifiers(kolom);
        int size = AllObjekController.tas_c.tas_model.getDataTas().size();
        for (int i=0; i<size; i++){
            Object [] tas = new Object[6];
            tas[0] = AllObjekController.tas_c.tas_model.getDataTas().get(i).getKodeBarang();
            tas[1] = AllObjekController.tas_c.tas_model.getDataTas().get(i).getNama();
            tas[2] = AllObjekController.tas_c.tas_model.getDataTas().get(i).getMerk();
            tas[3] = AllObjekController.tas_c.tas_model.getDataTas().get(i).getWarna();
            tas[4] = AllObjekController.tas_c.tas_model.getDataTas().get(i).getJenis();
            tas[5] = AllObjekController.tas_c.tas_model.getDataTas().get(i).getGender();
            dtmlisttas.addRow(tas);
        }
        return dtmlisttas;
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
