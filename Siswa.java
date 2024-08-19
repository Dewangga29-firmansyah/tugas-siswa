//Object Class
public class Siswa {
    //variabel
    int id;
    String nama;
    double ipk;

    //Constructor (yg membangun object)
    public Siswa() {
        id = 0;
        nama = "Kosong";
        ipk = 0.0;
    } 

    //Getter
    //Setter
    //Method
    public void print() {
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("IPK : " + ipk);
    }
}
