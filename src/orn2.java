import java.util.Scanner;

public class orn2 {
    public static void main(String[] args) throws Exception {
        //Negatif Pozitif Sayı Bulma 
        //Girilen Sayı 0'dan Küçük ise Negatif, Büyükse Pozitif
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayıyı Girin: ");
        int sayi = sc.nextInt();
        if(sayi > 0){
            System.out.println("Girdiğiniz Sayı Pozitiftir.");
        }
        else if(sayi < 0){
            System.out.println("Girdiğiniz Sayı Negatiftir.");
        }
        else{
            System.out.println("Girdiğiniz Sayı Sıfıra Eşittir.");
        }
    }
}