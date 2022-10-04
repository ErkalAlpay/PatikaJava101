import java.util.Scanner;

public class _16notOrtalamasiHesaplama{
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik Notunuz : ");

        mat = scanner.nextInt();

        System.out.println("Fizik Notunuz : ");

        fizik = scanner.nextInt();

        System.out.println("Kimya Notunuz : ");

        kimya = scanner.nextInt();


        System.out.println("Türkçe Notunuz : ");

        turkce = scanner.nextInt();


        System.out.println("Tarih Notunuz : ");

        tarih = scanner.nextInt();


        System.out.println("Müzik Notunuz : ");

        
        muzik = scanner.nextInt();


        int toplam = (mat + fizik + kimya + tarih + muzik+ turkce);


        double sonuc = toplam / 6;


        System.out.println("Ortalamanız : " + sonuc);


        /* Ödev : Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının 
        ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
        Not : If ve Else kullanılmayacak... */

        String durum = sonuc>=60? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(durum);


    }
    
}
