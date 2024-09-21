import java.util.Scanner;

public class faktorial {

    public static void main(String[] args) {
        int angka, temp = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        angka = s.nextInt();
        for (int i = angka; i >= 1; i--) {
            System.out.print(i + "x");
            temp *= i;
        }
        System.out.println();
        System.out.println("Total Faktorial : " + temp);

    }
}