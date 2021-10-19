public class PrintInfo {

    public static void main(String[] args) {
    
    Pelajar pelajar1 = new Pelajar("Rizki Asiddiky", 20, " Kabupaten Karangasem,Bali");
    pelajar1.getNama();
    pelajar1.display();
    
    TabunganMahasiswa tabunganA = new TabunganMahasiswa("2015051082", pelajar1,230000, "Universitas Pendidkan Ganesha", "Teknik Informatika");

    tabunganA.show();
    }
    
}
