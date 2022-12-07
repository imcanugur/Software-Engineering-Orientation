import java.util.Scanner;

public class orn8 {
    public static void main(String[] args) throws Exception {
        /*Burç Bulma
        Koç Burcu : 21 Mart(3) - 20 Nisan(4)
        Boğa Burcu : 21 Nisan(4) - 21 Mayıs(5)
        İkizler Burcu : 22 Mayıs(5) - 22 Haziran(6)
        Yengeç Burcu : 23 Haziran(6) - 22 Temmuz(7)
        Aslan Burcu : 23 Temmuz(7) - 22 Ağustos(8)
        Başak Burcu : 23 Ağustos(8) - 22 Eylül(9)
        Terazi Burcu : 23 Eylül(9) - 22 Ekim(10)
        Akrep Burcu : 23 Ekim(10) - 21 Kasım(11)
        Yay Burcu : 22 Kasım(11) - 21 Aralık(12)
        Oğlak Burcu : 22 Aralık(12) - 21 Ocak(1)
        Kova Burcu : 22 Ocak(1) - 19 Şubat(2)
        Balık Burcu : 20 Şubat(2) - 20 Mart(3)*/
        Scanner sc = new Scanner(System.in);
        String burc = null;
        System.out.print("1.Ocak\n2.Şubat\n3.Mart\n4.Nisan\n5.Mayıs\n6.Haziran\n7.Temmuz\n8.Ağustos\n9.Eylül\n10.Ekim\n11.Kasım\n12.Aralık\nDoğum Ayınızı Girin: ");
        int dogumAy = sc.nextInt();
        if(dogumAy > 0 && dogumAy < 13){
            System.out.print("Doğum Gününüzü Girin(1-31): ");
            int dogumGun = sc.nextInt();
            if(dogumGun > 0 && dogumGun < 32){
                if(dogumAy == 1){
                    if(dogumGun < 22){burc="Oğlak";}
                    if(dogumGun > 21){burc="Kova";}
                }
                else if(dogumAy == 2){
                    if(dogumGun < 20){burc="Kova";}
                    if(dogumGun > 19){burc="Balık";}
                }
                else if(dogumAy == 3){
                    if(dogumGun < 21){burc="Balık";}
                    if(dogumGun > 20){burc="Koç";}
                }
                else if(dogumAy == 4){
                    if(dogumGun < 19){burc="Koç";}
                    if(dogumGun > 20){burc="Boğa";}
                }
                else if(dogumAy == 5){
                    if(dogumGun < 22){burc="Boğa";}
                    if(dogumGun > 21){burc="İkizler";}
                }
                else if(dogumAy == 6){
                    if(dogumGun < 23){burc="İkizler";}
                    if(dogumGun > 22){burc="Yengeç";}
                }
                else if(dogumAy == 7){
                    if(dogumGun < 23){burc="Yengeç";}
                    if(dogumGun > 22){burc="Aslan";}
                }
                else if(dogumAy == 8){
                    if(dogumGun < 23){burc="Aslan";}
                    if(dogumGun > 22){burc="Başak";}
                }
                else if(dogumAy == 9){
                    if(dogumGun < 23){burc="Başak";}
                    if(dogumGun > 22){burc="Terazi";}
                }
                else if(dogumAy == 10){
                    if(dogumGun < 23){burc="Terazi";}
                    if(dogumGun > 22){burc="Akrep";}
                }
                else if(dogumAy == 11){
                    if(dogumGun < 22){burc="Akrep";}
                    if(dogumGun > 21){burc="Yay";}
                }
                else if(dogumAy == 12){
                    if(dogumGun < 22){burc="Yay";}
                    if(dogumGun > 21){burc="Oğlak";}
                }
                System.out.println("Burcunuz: " + burc);
            }
            else{
                System.out.println("Yanlış Gün Girişi");
            }
        }
        else{
            System.out.println("Yanlış Ay Girişi");
        }
    }
}