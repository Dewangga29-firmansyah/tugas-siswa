import java.util.Scanner;

public class deretAritmatikaFor {
    public static void main(String[] args) {
        int batasAwal, batasAkhir, beda;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan batas awal: ");
        batasAwal = input.nextInt();
        System.out.println("Masukkan batas akhir: ");
        batasAkhir = input.nextInt();
        System.out.println("Masukkan beda: ");
        beda = input.nextInt();
        System.out.println("Deret Aritmatika: ");
        for (int i = batasAwal; i<= batasAkhir; i= beda) {
            System.out.println(i + " ");
            i += beda;
        }
        input.close();
    }
}