//Object Class
public class Siswa {
    //variabel
    private int id;
    private String nama;
    private double ipk;

    public int getID() {
        return this.id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getnama() {
        return this.nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public double getipk() {
        return this.ipk;
    }

    public void setipk(double ipk) {
        this.ipk = ipk;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    //Constructor (yg membangun object)
    public Siswa() {
        id = 0;
        nama = "Kosong";
        ipk = 0.0;

    } 

    public Siswa(int i, String n, double d) {
        id = i;
        nama = n;
        ipk = d;
    }

    
    //Method
    public void print() {
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("IPK : " + ipk);
    }
}
