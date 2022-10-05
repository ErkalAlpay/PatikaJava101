public class _38tamBolen {
    public static void main(String[] args) {

        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e 
        //tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        int toplamSayi = 0;
        int sayac=0;
        for (int i = 1; i < 101; i++) {

            if (i % 3 == 0 && i % 4 == 0) {

                sayac++;
                toplamSayi = toplamSayi + i;
            }

        }

        System.out.println("3'e ve 4'e bölen sayıların ortalaması : " + toplamSayi/sayac);

    }
}
