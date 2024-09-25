package toko;

import java.util.Scanner;

public class TesterInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("CD/DVD");
        String pilihan = in.nextLine();

        System.out.println("Nama : ");
        String Nama = in.nextLine();

        System.out.println("Number : ");
        int number = in.nextInt();

        System.out.println("Quantiti : ");
        int quantity = in.nextInt();

        System.out.println("Price : ");
        double price = in.nextDouble();

        in.nextLine();//reset Scanner

        if (pilihan.equalsIgnoreCase("CD")) {
            System.out.println("Artist : ");
            String artist = in.nextLine();

            System.out.println("Total Song : ");
            int numSong = in.nextInt();

            System.out.println("Label : ");
            String label = in.nextLine();

            CD c1 = new CD(number, Nama, quantity, price, artist, numSong, label);
            c1.print();

        } else if (pilihan.equalsIgnoreCase("DVD")) {
        }
        in.close();
    }
}