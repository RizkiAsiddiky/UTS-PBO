

public class Pelajar {
    private String Nama;
    private int Umur;
    private String Alamat;

    
    Pelajar(String Nama, int Umur, String Alamat){
        this.Nama = Nama;
        this.Umur= Umur;
        this.Alamat = Alamat;
    }

    public void SetNama(String Nama){
        this.Nama = Nama;
    }
    
    public void SetUmur(int Umur){
        this.Umur = Umur;

    }
    public void SetAlamat(String Alamat){
        this.Alamat = Alamat;
    }

    public String getNama(){
        return this.Nama;
    }
    public int getUmur(){
        return this.Umur;
    }

    public String getAlamat() {
        return this.Alamat;
    }
    
    public void display(){
        System.out.println("Nama : " + getNama());
        System.out.println("Umur : " + getUmur() + " tahun");
        System.out.println("Alamat : " + getAlamat());
    }
    
}

