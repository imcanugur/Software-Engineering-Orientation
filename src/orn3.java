import java.util.Scanner;

public class orn3 {
    public static void main(String[] args) throws Exception {
        //Çift Tek Sayıyı Bulma
        //2 ile Mod Alınıp Mod Sonucu 0 ise Çift, 1 İse Tek
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayıyı Girin: ");
        int sayi = sc.nextInt();
        if(sayi % 2 == 0){
            System.out.println("Girdiğiniz Sayı Çifttir.");
        }
        else{
            System.out.println("Girdiğiniz Sayı Tektir.");
        }
    }
}