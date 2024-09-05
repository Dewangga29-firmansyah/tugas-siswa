import java.util.Scanner;
public class Kalkulator {

    public static void main(String[] args) {
        int hasil = 0;
        int angka1, angka2, menu;
        
        
        Scanner input = new Scanner(System.in);

        System.out.println("Kalkulator");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("1. penjumlahhan\n2. pengurangan\n3. perkalian\n4. pembagian\n ");
        System.out.println("pilih operasi : ");
        menu = input.nextInt();

        System.out.print("Masukkan angka pertama : ");
        angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua : ");
        angka2 = input.nextInt();

        switch (menu) {
            case 1:
                hasil = angka1 + angka2;
                break;

            case 2:
                hasil = angka1 - angka2;
                break;

            case 3:
                hasil = angka1 * angka2;
                break;

            case 4:
                hasil = angka1 / angka2;
                break;

            default:
                System.out.println("Menu tidak tersedia");
                break;
        }{
            
        }
        input.close();
        System.out.println("hasil : " + hasil);
    } 
}
