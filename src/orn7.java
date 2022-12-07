import java.util.Scanner;

public class orn7 {
    public static void main(String[] args) throws Exception {
        /*Çin Zodyağı
        Doğum Yılı %12 = 0 -> Maymun
        Doğum Yılı %12 = 1 -> Horoz
        Doğum Yılı %12 = 2 -> Köpek
        Doğum Yılı %12 = 3 -> Domuz
        Doğum Yılı %12 = 4 -> Fare
        Doğum Yılı %12 = 5 -> Öküz
        Doğum Yılı %12 = 6 -> Kaplan
        Doğum Yılı %12 = 7 -> Tavşan
        Doğum Yılı %12 = 8 -> Ejderha
        Doğum Yılı %12 = 9 -> Yılan
        Doğum Yılı %12 = 10 -> At
        Doğum Yılı %12 = 11 -> Koyun*/
        String sonuc = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Girin: ");
        int dogumYil = sc.nextInt();
        int mod = dogumYil % 12;
        if(mod == 0){
            sonuc = "Maymun";
        }
        else if(mod == 1){
            sonuc = "Horoz";
        }
        else if(mod == 2){
            sonuc = "Köpek";
        }
        else if(mod == 3){
            sonuc = "Domuz";
        }
        else if(mod == 4){
            sonuc = "Fare";
        }
        else if(mod == 5){
            sonuc = "Öküz";
        }
        else if(mod == 6){
            sonuc = "Kaplan";
        }
        else if(mod == 7){
            sonuc = "Tavşan";
        }
        else if(mod == 8){
            sonuc = "Ejderha";
        }
        else if(mod == 9){
            sonuc = "Yılan";
        }
        else if(mod == 10){
            sonuc = "At";
        }
        else if(mod == 11){
            sonuc = "Koyun";
        }  
        System.out.println("Çin Zodyağı'ndaki Burcunuz: " + sonuc);      
    }
}