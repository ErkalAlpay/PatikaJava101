import java.util.Scanner;

public class _22manavKasa {

    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplam;
        double kg1, kg2, kg3, kg4, kg5;
        Scanner input = new Scanner(System.in);
        System.out.println("MANAV KASA PROGRAMI ");
        System.out.print("Armut Kaç Kilo : ");
        kg1 = input.nextDouble();
        System.out.print("Elma Kaç Kilo : ");
        kg2 = input.nextDouble();
        System.out.print("Domates Kaç Kilo : ");
        kg3 = input.nextDouble();
        System.out.print("Muz Kaç Kilo : ");
        kg4 = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo : ");
        kg5 = input.nextDouble();
        toplam = (kg1 * armut) + (kg2 * elma) + (kg3 * domates) + (kg4 * muz) + (kg5 * patlican);
        System.out.print("Toplam Tutar : " + toplam + " TL");
    }
}
