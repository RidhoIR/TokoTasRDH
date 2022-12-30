package Entity;

public abstract class User {
    protected int id;
    protected String nama;
    protected String telepon;

    public User(int id, String nama, String telp){
        this.id = id;
        this.nama = nama;
        this.telepon = telp;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}
