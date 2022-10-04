import java.util.Scanner;

public class _20daireAlanHesabi {
    public static void main(String[] args) {
        int r,a;
        double pi=3.14, formul;
        Scanner inp = new Scanner(System.in);

        System.out.println("Yarıçapı Giriniz: ");
        r = inp.nextInt();

        System.out.println("Merkez Açı Ölçüsünü Giriniz: ");
        a = inp.nextInt();


        formul = (pi*(Math.pow(r,2))*a)/360;

        System.out.println("Merkez Açı Ölçülü Daire Diliminin Alanı: " +formul);







    }
}