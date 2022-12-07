import java.util.Scanner;

public class orn9 {
    public static void main(String[] args) throws Exception {
        //Faktoriyel Hesabı
        int faktoriyel = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = sc.nextInt();
        for(int i = 1; i <= sayi; i++){
            faktoriyel = faktoriyel * i;
        }
        System.out.println(sayi + " Sayısının Faktoriyeli: " + faktoriyel);
    }
}