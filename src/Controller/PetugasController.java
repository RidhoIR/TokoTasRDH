package Controller;

import Entity.Petugas;
import Entity.Tas;
import Model.PetugasModel;

import java.util.Scanner;

public class PetugasController {


   public PetugasModel petugas_m = new PetugasModel();

    public PetugasController(){

    }

    public void insert(int id, String nama, String telepon, String password){
        Petugas petugas = new Petugas();
        petugas.setId(id);
        petugas.setNama(nama);
        petugas.setTelepon(telepon);
        petugas.setPassword(password);
        petugas_m.insert(petugas);
    }

    public void update(int index, int id, String nama, String telepon, String password){
        Petugas petugas = new Petugas();
        petugas.setId(id);
        petugas.setNama(nama);
        petugas.setTelepon(telepon);
        petugas.setPassword(password);
        petugas_m.update(index,petugas);
    }

    public void delete(int index){
        petugas_m.delete(index);
    }




}
