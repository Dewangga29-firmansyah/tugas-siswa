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

        amin.setNama("amin");

        amin.print();
        rehan.print();
        fadli.print();
        anggito.print();
        surya.print();

        

        
    }
}