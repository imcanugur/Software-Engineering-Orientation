import java.util.Scanner;

public class orn10 {
    public static void main(String[] args) throws Exception {
        //Yıdızlarla Daire Çizimi
        Scanner sc = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        int yaricap = sc.nextInt();
        double kok;
        for (int i = 0; i <= 2 * yaricap; i++) {
            for (int j = 0; j <= 2 * yaricap; j++) {
                kok = Math.sqrt((i - yaricap) * (i - yaricap) + (j - yaricap) * (j - yaricap));
                if (kok > yaricap - 0.5 && kok < yaricap + 0.5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.print("\n");
        }
    }
}
