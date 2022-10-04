import java.util.Scanner;

public class _21vucutKutleIndeksi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vücut Kitle İndeksi Hesaplama \nBoyunuz (Örn:1.75m): ");
        double kg, boy;
        boy = scanner.nextDouble();

        System.out.print("Kilonuz: ");
        kg = scanner.nextDouble();

        double bme = kg / (boy * boy);
        System.out.printf("Vücut kitle indeksiniz : " + bme);
    }
}
