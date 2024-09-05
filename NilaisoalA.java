import java.util.Scanner;
public class NilaisoalA {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

    System.out.print("Masukkan nama siswa: ");
    String nama = input.next();
        System.out.print("Masukkan nilai siswa: ");
        int nilai = input.nextInt();
        String grade, keterangan;

        if(nilai >= 85 && nilai <= 100){
            grade = "A";
            keterangan = "Lulus";

        }else if(nilai >= 70 && nilai <= 84){
            grade = "B";
            keterangan = "Lulus";
            
        }else if(nilai >= 50 && nilai <= 69){
            grade = "C";
            keterangan = "Lulus";
            
        }else if(nilai >= 40 && nilai <= 49){
            grade = "D";
            keterangan = "Tidak Lulus";
            
        }else{
            grade = "E";
            keterangan = "Tidak Lulus";
            
        }

        System.out.println("Siswa: "+nama);
        System.out.println("Nilai: "+nilai);
        System.out.println("Grade: "+grade);
        System.out.println(keterangan);

        input.close();
    }
}