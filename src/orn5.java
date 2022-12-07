import java.util.Scanner;

public class orn5 {
    public static void main(String[] args) throws Exception {
        //Dik Üçgen Alan Hesabı
        //Üçgen Yüksekliği * Taban Alanı / 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban Uzunluğu Girin: ");
        double tabanUzunluk = sc.nextDouble();
        System.out.print("Yüksekliği Girin: ");
        double yukseklik = sc.nextDouble();
        double sonuc = yukseklik * tabanUzunluk / 2;
        System.out.print("Dik Üçgenin Alanı: " + sonuc);
    }
}