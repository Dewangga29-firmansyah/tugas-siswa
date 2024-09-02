import java.util.Scanner;
public class percabangan {
    public static void main(String[] args) {
        double total, diskon;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan total belanja : ");
        total = s.nextDouble();

        if(total >= 100000){
            diskon = 0.1 * total;
            total -= diskon;

        }else{
            System.out.println("Anda akan mendapatkan gift");
        }
        System.out.println("Total:"+total);
        System.out.println("Terimakasih");
        
    }
    
}
