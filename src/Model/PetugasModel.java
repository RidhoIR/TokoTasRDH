package Model;
import Entity.Petugas_Entity;

import java.util.*;

public class PetugasModel implements InterfaceModel {


    ArrayList<Petugas_Entity> list = new ArrayList<>();

    public ArrayList<Petugas_Entity> getDataPetugas(){
        return list;
    }

    @Override
    public void insert(Object x) {
        list.add((Petugas_Entity)x);
    }

    @Override
    public void update(int index, Object x) {
        list.set(index, (Petugas_Entity)x);
    }

    @Override
    public void delete(int index) {
        list.remove(index);
    }

    @Override
    public void view() {

    }

    public Petugas_Entity showDataPetugas(int index){
        return list.get(index);
    }

    Petugas_Entity user = null;

    public boolean cekPetugas(String id, String password){
        for(Petugas_Entity petugasEntity : getDataPetugas()){
            if(petugasEntity.getNama().equals(id) && petugasEntity.getPassword().equals(password)){
                user = petugasEntity;
                return true;
            }
        }
        return false;
    }
}
