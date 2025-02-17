package com.mycompany.studentproject.toko.TugasBuAul;
import java.util.Scanner;
public class tugasA {
        public static void main(String[] args) {
        int i=1,jumlahTiket=7,TotalTiket=0,tiketperhari=0,tiket;
        double RataJumlah;

        Scanner input = new Scanner(System.in);
        System.out.println("Tiket yang terjual selama 7 hari : ");
        while (i <= jumlahTiket) {
            System.out.println("Masukkan Jumlah tiket hari ke - " + i + " : ");
            tiket = input.nextInt();
            TotalTiket+=tiket;
            i++;
        }
        RataJumlah = TotalTiket / jumlahTiket;
        System.out.println("------------------------------------");
        System.out.println("Total Tiket Yang Terjual : " + TotalTiket);
        System.out.println("Rata - rata tiket yang terjual : " + RataJumlah);
        input.close();
    }
}