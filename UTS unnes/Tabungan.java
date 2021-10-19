public class Tabungan {
    private double Saldo;
    public String noRekening;

    public Pelajar Pelajar;

    Tabungan(String noRekening, double Saldo, Pelajar pelajar){
        this.noRekening = noRekening;
        this.Saldo = Saldo;
        this.Pelajar = pelajar;
    }

    public double getSaldo(){
        return Saldo;
    }

    public String getRekening(){
        return noRekening;
    }

    public String getAlamat(){
        return this.Pelajar.getAlamat();
    }

    public void menabung(double jumlahUang){
        this.Saldo += jumlahUang;
    }

    public void menarikTabungan(double jumlahUang){
        this.Saldo -= jumlahUang;
    }

    public double ceksaldo(){
        return this.Saldo;
    }

    public void transfer(Tabungan tujuan, int uang){
        tujuan.menabung(uang);
        this.menarikTabungan(uang + 10000);
    }

    public void show(){
        System.out.println("Nama : " + this.Pelajar.getNama());
        System.out.println("Umur : " + this.Pelajar.getUmur() + " tahun");
        System.out.println("Alamat : " + getAlamat());
        System.out.println("Saldo: " + getSaldo());
    }

}

