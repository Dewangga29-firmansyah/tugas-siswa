package toko;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("berapa jumlah object");
        int jumlah = in.nextInt();
        // condition dilengkapi >10 tdk dijalankan
        for (int i = 1; i <= jumlah; i++) {
            try {
            } catch (Exception e) {
                System.out.println("Masukkan pilihan 1 untuk membuat CD atau 2 untuk membuat DVD: ");
                int pilihan = in.nextInt();
                if (pilihan == 1) {
                    CD c = new CD();
                    c.print();
                } else if (pilihan == 2) {
                    DVD d = new DVD();
                    d.print();
                } else if (jumlah > 10 || jumlah <= 1) {
                    System.out.println("jumlah harus diantara 1-10");
                    return;
                } else {
                    System.out.println("pilihan salah");
                }
                System.out.println("tipe data salah, hanya muncul angaka");
            }
        }

        in.close();
        // mencegah error krn tipe data tidak sesuai
    }

}
