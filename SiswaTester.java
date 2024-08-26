import java.util.Scanner;

//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //String-->int--->double
        Scanner input = new Scanner(System.in);
        System.out.println("Nama :");
        String nama = input.nextLine();
        System.out.println("ID :");
        int id = input.nextInt();
        System.out.println("IPK : ");
        double ipk = input.nextDouble();
        input.close();

        Siswa dimas = new Siswa(id, nama, ipk);
        dimas.print();
        //membuat Object
        //namaClass namaObject = new Constructor();
        Siswa amin = new Siswa();
        Siswa rehan = new Siswa();
        Siswa fadli = new Siswa();
        Siswa anggito = new Siswa();
        Siswa surya = new Siswa();

        amin.id = 21;
        amin.nama = "amin";
        amin.ipk = 99;

        rehan.id = 29;
        rehan.nama = "rehan";
        rehan.ipk = 99;

        fadli.id = 19;
        fadli.nama = "fadli";
        fadli.ipk = 89;

        anggito.id = 22;
        anggito.nama = "anggito";
        anggito.ipk = 90;

        surya.id = 23;
        surya.nama = "surya";
        surya.ipk = 88;
        
        amin.print();
        rehan.print();
        fadli.print();
        anggito.print();
        surya.print();

        

        
    }
}