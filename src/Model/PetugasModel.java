package Model;
import Entity.Petugas;
import Entity.Tas;

import java.util.*;

public class PetugasModel implements InterfaceModel {


    ArrayList<Petugas> list = new ArrayList<>();

    public ArrayList<Petugas> getDataPetugas(){
        return list;
    }

    @Override
    public void insert(Object x) {
        list.add((Petugas)x);
    }

    @Override
    public void update(int index, Object x) {
        list.set(index, (Petugas)x);
    }

    @Override
    public void delete(int index) {
        list.remove(index);
    }

    @Override
    public void view() {

    }
}
