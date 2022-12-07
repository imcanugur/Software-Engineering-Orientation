import java.util.Scanner;

public class orn4 {
    public static void main(String[] args) throws Exception {
        //Maaş Zam Oranı 
        //Maaş * Girilen Oran / 100
        Scanner sc = new Scanner(System.in);
        System.out.print("Maaşınızı Girin: ");
        double maas = sc.nextDouble();
        System.out.print("Zam Oranını Girin: ");
        double oran = sc.nextDouble();
        double sonuc = maas + (maas * oran / 100);
        System.out.print("Yeni Maaşınız: " + sonuc);
    }
}