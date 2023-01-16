package Model;

import Entity.Tas;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class TasModel implements InterfaceModel {
    
    private static ArrayList<Tas> ListTas = new ArrayList<>();


    public ArrayList<Tas> getDataTas(){
        return ListTas;
    }

//    public static void initialData(){
//        Tas tas = new Tas(1,"Dior","Gucci","merah","Backpack","Unisex");
//
//        ListTas.add(tas);
//    }

    @Override
    public void insert(Object x){
        ListTas.add((Tas) x);
    }

    @Override
    public void update(int index, Object x) {
        ListTas.set(index,(Tas) x);
    }

    @Override
    public void delete(int index) {
        ListTas.remove(index);
    }

    @Override
    public void view() {

    }




}
