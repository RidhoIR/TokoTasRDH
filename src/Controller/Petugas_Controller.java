package Controller;


import Entity.Petugas_Entity;
import Model.PetugasModel;


import java.util.ArrayList;

public class Petugas_Controller {

    public PetugasModel petugas_m = new PetugasModel();
    int loginpetugas = 0;

    private  Petugas_Entity userLogged = null;

    public  boolean login(String username, String password) {
        for (Petugas_Entity user : petugas_m.getDataPetugas()) {
            if ((user.getNama().equals(username)) && (user.getPassword().equals(password))) {
                userLogged = user;
                return true;
            }
        }
        return false;
    }

    public Petugas_Controller(){

    }

    public ArrayList<Petugas_Entity> view(){
        return petugas_m.getDataPetugas();
    }

    public void insert (Petugas_Entity petugas){
        petugas_m.insert(petugas);
    }

    public void update(int index, Petugas_Entity petugas){
        petugas_m.update(index,petugas);
    }

    public void delete(int index){
        petugas_m.delete(index);
    }

    public void dataPetugas(){
        String id[] = {"01","02","03","04"};
        String nama [] = {"Ridho","Fariz","Akbar","Fondasa"};
        String alamat [] = {"Surabaya","Menganti","Sidoarjo","Krian"};
        String password [] = {"111","222","333","444"};

        for (int i= 0; i<nama.length; i++){
            petugas_m.insert(new Petugas_Entity(id[i],nama[i],alamat[i],
                    password[i]));
        }
    }

    public void cekPetugas (String id, String password){
        loginpetugas = petugas_m.cekPetugas(id,password);
    }

    public boolean register(Petugas_Entity petugas){
        for(Petugas_Entity akun : petugas_m.getDataPetugas()){
            if(akun.getNama().equals(petugas.getNama())
                ||(akun.getPassword().equals(petugas.getPassword()))){
                return false;
            }
        }

//        petugas_m.getDataPetugas().add(petugas);
        petugas_m.insert(petugas);
        return true;
    }

    public Petugas_Entity petugas_entity(){
        return petugas_m.showDataPetugas(loginpetugas);
    }



}

