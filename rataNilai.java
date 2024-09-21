import java.util.Scanner;
public class rataNilai {

    public static void main(String[] args) {
        int i=0, jumlahsiswa, nilai, totalnilai=0;
        double rataNilai;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah siswa : ");
        jumlahsiswa = input.nextInt();

        while (i<=jumlahsiswa){
            System.out.print("Masukkan Nilai : ");
            nilai = input.nextInt();
            totalnilai += nilai;
            i++;
        }
        totalnilai = totalnilai/jumlahsiswa;
        System.out.println("Total Nilai dari " + jumlahsiswa + " Siswa : " + totalnilai);
        System.out.print("Rata-rata Nilai" + totalnilai);


}

}