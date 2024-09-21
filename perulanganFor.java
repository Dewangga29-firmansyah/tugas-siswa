import java.util.Scanner;
public class perulanganFor {

    public static void main(String[] args) {
        int nilaiAtas, nilaiBawah;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Atas : ");
        nilaiAtas = input.nextInt();
        System.out.print("Masukkan Nilai Bawah : ");
        nilaiBawah = input.nextInt();
        System.out.println();
        for (int i = nilaiAtas; i < nilaiBawah; i++) {
            if (i % 2 == 0){
                System.out.println(i+", ");
            }
            
}
}
}