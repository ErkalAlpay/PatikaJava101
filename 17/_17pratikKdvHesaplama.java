import java.util.Scanner;
public class _17pratikKdvHesaplama{
    public static void main(String[] args) {
        
        double tutar,kdvOran, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Para değerini giriniz:");
        tutar = input.nextDouble();
        
        kdvOran=(tutar<=1000)?0.18:0.08;  //Ödev kısmı 
        kdvTutar =tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar ;

        System.out.println("KDV'siz Fiyat : " + tutar );
        System.out.println("KDV Oranı : "+ kdvOran );
        System.out.println("KDV'li Fiyat : " + kdvliTutar);
        System.out.println("KDV Tutarı : " + kdvTutar);

    }
}



    
