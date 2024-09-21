import java.util.Scanner;
public class kalkulatorsederhana {
    public static void main(String[] args) {

        int pilihan;
        int num1, num2, hasil;

        Scanner input = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan : ");
        pilihan = input.nextInt();

        System.out.print("Masukkan angka pertama : ");
        num1 = input.nextInt();
        System.out.print("Masukkan angka kedua : ");
        num2 = input.nextInt();

        switch (pilihan) {
            case 1:
                hasil = num1 + num2;
                break;
            case 2:
                hasil = num1 - num2;
                break;
            case 3:
                hasil = num1 * num2;
                break;
            case 4:
                hasil = num1 / num2;
                break;
            default:
                hasil = 0;
                System.out.println("Menu tidak tersedia");
                break;
        }
        System.out.println("Hasilnya adalah : " + hasil);
    }
}