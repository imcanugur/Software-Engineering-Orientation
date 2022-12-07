import java.util.Scanner;

public class orn6 {
    public static void main(String[] args) throws Exception {
        //Vücut Kitle İndeksi
        //Kilo (kg) / Boy(m) * Boy(m)
        Scanner sc = new Scanner(System.in);
        System.out.print("Ağırlığınızı Girin(Kg): ");
        double kilo = sc.nextDouble();
        System.out.print("Boyunuzu Girin(Cm): ");
        double boy = sc.nextInt();
        boy = boy / 100;
        double sonuc = kilo / (boy * boy);
        System.out.println("Vücud Kitle İndeksiniz: " + sonuc);
    }
}