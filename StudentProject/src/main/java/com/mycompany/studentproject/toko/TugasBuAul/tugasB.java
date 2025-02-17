package com.mycompany.studentproject.toko.TugasBuAul;
import java.util.Scanner;

public class tugasB {
    public class TesB {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int hari = 5, stok, stokAkhir = 0, i = 1;

            while (i <= hari) {
                System.out.println("Masukkan Jumlah Barang Pada Hari ke-" + i);
                stok = input.nextInt();
                stokAkhir += stok;
                i++;
            }
            System.out.println();
            System.out.println("Jumlah Stok Dalam 5 Hari Terakhir adalah: " + stokAkhir);
        }
    }
}