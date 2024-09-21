import java.util.Scanner;

public class DeretAritmatikaWhile {
    public static void main(String[] args) {
        int batasAwal, batasAkhir, beda;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan batas bawah: ");
        batasAwal = input.nextInt();
        System.out.println("Masukkan batas atas: ");
        batasAkhir = input.nextInt();
        System.out.println("Masukkan beda: ");
        beda = input.nextInt();
        System.out.println("Deret Aritmatika: ");
        int i = batasAwal;
        while (i <= batasAkhir) {
            System.out.println(i + " ");
            i += beda;
        }
        input.close();
    }
}