import java.util.Scanner;

public class _27kullaniciGirisi {
    public static void main(String[] args) {
        
        String username, password;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı Adı: ");

        username = scanner.nextLine();

        System.out.println("Şifre: ");

        password = scanner.nextLine();

        if(username.equals("patika")&& password.equals("java101")){
            System.out.println("Giriş Yapıldı");
        }
        else {System.out.println("Bilgileriniz yanlış" +"\n" + "Şifrenizi Sıfırlamak İster misiniz ?" + "\n" +"1-Evet"
        +"\n" + "2-Hayır" );
        int karar = scanner.nextInt();
        if (karar == 1){ System.out.println("Yeni şifreniz eski şifrenizden farklı olmalıdır." + "\n"
         + "Yeni şifrenizi giriniz");
        
        String newPassword;
        newPassword = scanner.nextLine();
        newPassword = scanner.nextLine();
        if (newPassword.equals("java101")){
            System.out.println("Eski şifrenizden farklı bir şifre giriniz");
        }
        else password = newPassword; }}


        }




    }

