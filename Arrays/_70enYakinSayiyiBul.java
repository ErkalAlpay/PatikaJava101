import java.util.Arrays;
import java.util.Scanner;

public class _70enYakinSayiyiBul {
    public static void main(String[] args) {
        
        //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı 
        //ve en büyük en yakın sayıyı bulan programı yazınız.

        int dizi[] = {15, 560, 2367,45,278,18,20,5};

        enYakinSayilar(dizi, 4);

    }

    static public void enYakinSayilar(int asd[], int b){
        int kopyaDizi [] = Arrays.copyOf(asd, asd.length+1);
        kopyaDizi [kopyaDizi.length-1] = b;
        System.out.println(Arrays.toString(kopyaDizi));
        Arrays.sort(kopyaDizi);
        System.out.println(Arrays.toString(kopyaDizi));

        for (int i = 0; i<kopyaDizi.length; i++) {
            if(kopyaDizi[i] == b && (i !=0 && i!=kopyaDizi.length-1)){
                System.out.println("Girilen Sayıdan En Yakın Küçük Sayı : " + kopyaDizi[i-1]);
                System.out.println("Girilen Sayıdan En Yakın Büyük Sayı : " + kopyaDizi[i+1]);
            }

           
            
        } 
        if(kopyaDizi[0] == b){
            System.out.println("Girilen Sayı Dizinin En Küçük Elemanıdır");
            System.out.println("Girilen Sayıdan En Yakın Büyük Sayı : " + kopyaDizi[1]);

        } 
        if(kopyaDizi[kopyaDizi.length-1] == b){
            System.out.println("Girilen Sayıdan En Yakın Küçük Sayı : " + kopyaDizi[kopyaDizi.length-2]);
            System.out.println("Girilen Sayı Dizinin En büyük Elemanıdır");
        }


    }
}
