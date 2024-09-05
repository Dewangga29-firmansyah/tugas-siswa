import java.util.Scanner;
public class seleksiKelas {

    public static void main(String[] args) {
        int pilihan;
        String kelas;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Kelas:");
        System.out.println("X RPL 1\nX RPL 2\nX RPL 3\nX RPL 4\nX RPL 5\nX RPL 6");
        pilihan = s.nextInt();

        switch(pilihan){
            case 1:
            kelas = "XRPL1";
            break;
            case 2:
            kelas = "XRPL2";
            break;
            case 3:
            kelas = "XRPL3";
            break;
            case 4:
            kelas = "XRPL4";
            break;
            case 5:
            kelas = "XRPL5";
            break;
            case 6:
            kelas = "XRPL6";
            break;
            default:
            kelas = " Kelas Tidak terdaftar";

            System.out.println("Kelas : "+ kelas);



        }
    }
}
