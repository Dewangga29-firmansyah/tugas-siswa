import java.util.Scanner;
public class guruKelas {
    
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // System.out.println("Guru : ");
        // String nama = input.nextLine();
        // System.out.println("Mapel : ");
        // String mapel = input.nextLine();
        // System.out.println("Status : ");
        // String status = input.nextLine();
        // System.out.println("NIP : ");
        // int nip = input.nextInt();
        // input.close();


        // Guru pakThoriq = new Guru("Thoriq", "Matematika", "Aktif", 123456);
        // Guru pakHafiz = new Guru("Hafiz", "SENI", "Aktif", 11111);
        // Guru pakIqbal = new Guru("Iqbal", "INDONESIA", "Aktif", 22222);
        // Guru pakRizal = new Guru("Rizal", "PJOK", "Aktif", 33333);
        // Guru pakFadli = new Guru("Fadli", "IPAS ", "Aktif", 44444);
        // Guru.print();

        Guru pakThoriq = new Guru(null, null, null, 0);

        pakThoriq.setNama("pakThoriq");
        pakThoriq.set("matematika");
        pakThoriq.setStatus("aktif");
        pakThoriq.setNip(2021);

        pakThoriq.print();



        // pakThoriq.print();
        // System.out.println("-----------------");
        // pakHafiz.print();
        // System.out.println("-----------------");
        // pakIqbal.print();
        // System.out.println("-----------------");
        // pakRizal.print();
        // System.out.println("-----------------");
        // pakFadli.print();
        // System.out.println("-----------------");

    }   
}
