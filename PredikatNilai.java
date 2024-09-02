import java.util.Scanner;
public class PredikatNilai {
    public static void main(String[] args) {
        int nilai;
        String Predikat;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai : ");
        nilai = input.nextInt();

        if (nilai >= 0 && nilai <= 70) {
            Predikat = "D";
        } else if (nilai >= 70 && nilai <= 80) {
            Predikat = "C";
        } else if (nilai >= 80 && nilai <= 90) {
            Predikat = "B";
        } else if (nilai >= 90 && nilai <= 100) {
            Predikat = "A";
        }else{
            Predikat = "Tidak ada";
            System.out.println( "Prediksi tidak ada");
        }

        System.out.println("Nilai : " + nilai);
        System.out.println("Predikat : " + Predikat);
    }
}
