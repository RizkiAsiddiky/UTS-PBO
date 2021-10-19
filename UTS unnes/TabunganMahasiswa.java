public class TabunganMahasiswa extends Tabungan{
    private String Universitas;
    public String Jurusan;

    TabunganMahasiswa(String noRekening, Pelajar pelajar, double Saldo, String Universitas, String Jurusan){
        super(noRekening, Saldo, pelajar);
        this.Universitas = Universitas;
        this.Jurusan = Jurusan;
    }

    public String getUniversitas(){
        return Universitas;
    }

    public String getJurusan(){
        return Jurusan;
    }
    
    public void show(){
        System.out.println("No rekening : " + getRekening());
        System.out.println("Universitas : " + getUniversitas());
        System.out.println("Jurusan : " + getJurusan());
        System.out.println("Saldo: " + getSaldo());
    }
}
