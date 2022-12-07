import java.util.Scanner;

public class orn1 {
    public static void main(String[] args) throws Exception {
        //Girilen İki Sayının Toplamı
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Sayıyı Girin: ");
        int sayiBir = sc.nextInt();
        System.out.print("2. Sayıyı Girin: ");
        int sayiIki = sc.nextInt();
        System.out.println("Girilen Sayının Toplamı: " + (sayiBir + sayiIki));
    }
}