package Entity;

public class Petugas extends User {

    private String password;

    public Petugas(int id, String nama, String telp, String pass){
        super(id,nama,telp);
        this.password = pass;
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

    public void setTelp(String telp){
        this.telepon = telp;
    }

    public String getTelp(){
        return telepon;
    }

    @Override
    public void setId(int id){
        this.id = id;
    }

    @Override
    public int getId(){
        return id;
    }
}
