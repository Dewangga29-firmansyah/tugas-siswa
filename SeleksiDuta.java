import java.util.Scanner;
public class SeleksiDuta {

    public static void main(String[] args) {
        String nama, kelas, perilaku;
        int nilai;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.println("Masukkan Kelas : (X/XI)");
        kelas = input.next();

        if(kelas.equalsIgnoreCase("X") || kelas.equalsIgnoreCase("XI")) {
            System.out.println("Perilaku Siswa: (Baik/Cukup)");
            perilaku = input.next();
            if (perilaku.equalsIgnoreCase("Baik")) {
                System.out.println("Masukkan Rata rata Nilai siswa: ");
                nilai = input.nextInt();
                if (nilai >= 90) {
                    System.out.println("Anda dinyatakan lolos seleksi");
                } else {
                    System.out.println("Anda dinyatakan tidak lolos karena nilai");
                }
                }else{
                    System.out.println("Anda dinyatakan tidak lolos karena perilaku");
                } 
                
            }else{
                System.out.println("Anda dinyatakan tidak lolos karena kelas XII");
            }

        }
    }
    

