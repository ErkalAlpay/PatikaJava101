import java.util.Scanner;

public class _32ucakBileti {
    public static void main(String[] args) {
        int mesafe;
        int yas;
        int girilenSayi;
        double indirimOrani = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gitmek istediğiniz mesafeyi yazınız");
        mesafe = scanner.nextInt();
        double ucret = mesafe* 0.10;
        System.out.println("Yaşınızı giriniz");
        yas = scanner.nextInt();
        
        if(yas<12){indirimOrani = 0.50;}
        else if(12<yas && yas<24){indirimOrani=0.10;}
        else if(yas>65){indirimOrani=0.35;}
        
        System.out.println("1)Gidiş-Dönüş" + "        2)Tek Yön");
        girilenSayi = scanner.nextInt();

        if(girilenSayi==1){indirimOrani= indirimOrani+0.20;}
        else indirimOrani = indirimOrani;

        if(mesafe<0){System.out.println("Yanlış Değer Girdiniz");}
        else{
        System.out.println("İndirimli bilet fiyatınız : " + (ucret - (ucret*indirimOrani)));
    }
}
}