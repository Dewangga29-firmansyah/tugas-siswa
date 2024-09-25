import java.util.Scanner;
public class pembelianATK {
    
    public static void main(String[] args) {

        int pilihan, jumlah, harga=0,total, tempTotal=0;
        boolean statusBeli = true;
    do{
        Scanner s = new Scanner(System.in);
        System.out.println("Pilih barang yang mau di beli;");
        System.out.println("1. penghapus=2000\n2.Buku=5000\n3.Penggaris=1000");
        System.out.println("masukkan pilihan barang 1,2,3 : ");
        pilihan = s.nextInt();
        System.out.println("masukkan jumlah beli : ");
        jumlah = s.nextInt();

        switch(pilihan){
            case 1:
                tempTotal += 2000;
                break;
            case 2:
                tempTotal += 5000;
                break;
            case 3:
                tempTotal += 1000;
                break;
            default:
                break;

        }
        total = harga*jumlah;
        tempTotal +=total;
        System.out.println("Total : "+total);
        System.out.println("Apakah ingin membeli lagi(ya/tidak)?");
        String status = s.next();
        if(status.equals("tidak")){
            statusBeli = false;
        }

        }while(statusBeli);
        System.out.println("Total yang harus dibayarkan : "+tempTotal);
    }
}