import java.util.Scanner;

public class DeretAritmatikaWhile {
    public static void main(String[] args) {
        int batasAwal, batasAkhir, beda;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas bawah: ");
        batasAwal = input.nextInt();
        System.out.print("Masukkan batas atas: ");
        batasAkhir = input.nextInt();
        System.out.print("Masukkan beda: ");
        beda = input.nextInt();
        System.out.print("Deret Aritmatika: ");
        int i = batasAwal;
        while (i <= batasAkhir) {
            System.out.print(i + " ");
            i += beda;
        }
        input.close();
    }
}