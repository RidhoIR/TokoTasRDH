package Model;
import Entity.Petugas;
import Entity.Tas;

import java.util.*;

public class PetugasModel {

    ArrayList<Petugas>list= new ArrayList<>();

//    public PetugasModel(){
//        List = new ArrayList<>();
//    }

    public void insert(int id, String nama, String Telepon, String passsword){
        list.add(new Petugas(id,nama,Telepon,passsword));
    }

    public int indexData(Petugas petugas){
        int index = list.indexOf(petugas);
        return index;
    }

    public Petugas FindByID(int kode){
        for (Petugas petugas:list){
            if(petugas.getId() == kode){
                System.out.println("========================");
                System.out.println("kode : "+petugas.getId());
                System.out.println("Tipe : "+petugas.getNama());
                System.out.println("Merk : "+petugas.getTelp());
                System.out.println("Warna : "+petugas.getPassword());
                return petugas;
            }
        }
        return null;
    }

    public void Update(int KodeBarang, String nama, String merk, String warna){
        Petugas caritas = FindByID(KodeBarang);

        if(caritas != null){
            int index = indexData(caritas);
            list.get(index).setId(KodeBarang);;
            list.get(index).setNama(nama);
            list.get(index).setTelp(merk);
            list.get(index).setPassword(warna);
        }
    }

    public void delete(int index){
        list.remove(index);
    }
}
