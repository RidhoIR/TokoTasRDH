package Entity;

public class Petugas_Entity extends User {

    private String password;

    public Petugas_Entity(String id, String nama, String telp, String pass){
        super(id,nama,telp);
        this.password = pass;
    }

    public Petugas_Entity(){

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setNama(String nama){
        this.nama = nama;
    }

    @Override
    public String getNama(){
        return nama;
    }

    @Override
    public void setTelepon(String telp){
        this.telepon = telp;
    }

    @Override
    public String getTelepon(){
        return telepon;
    }

    @Override
    public void setId(String id){
        this.id = id;
    }

    @Override
    public String getId(){
        return id;
    }
}
