import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String username, password;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız : ");
        username = inp.nextLine();

        System.out.println("Şifreniz : ");
        password = inp.nextLine();

        if ((username.equals("patika"))){
            //Kullanıcı adı doğru,
            if ((password.equals("java123")))
            {
                //Şifre de doğru ise
                System.out.println("Giriş Başarılı");
            }
            else
            {
                //Kullanıcı adı doğru fakat şifre yanlışsa
                System.out.println("Şifreniz hatalı, şifrenizi sıfırlamak ister misiniz? E/H");
                String cevap;
                cevap = inp.nextLine();
                if(cevap.equals("E")){
                    //Cevap evet ise, şifre sıfırlanmak isteniyorsa;
                    System.out.println("Yeni şifre giriniz : ");
                    String newPassword = inp.nextLine();
                    if ((newPassword.equals(password))||(newPassword.equals("java123")))
                    {
                        //Girilen şifre: eski girilen ya da unutulan şifre ile aynıysa
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    else{
                        System.out.println("Şifre oluşturma başarılı.");
                    }
                }
                else if(cevap.equals("H"))
                    System.out.println("Şifre oluşturmayı reddettiniz, giriş iptal edildi, ana sayfaya yönlendiriliyorsunuz.");
                else
                    System.out.println("Bilinmeyen giriş, ana sayfaya yönlendiriliyorsunuz.");
            }

        }
        else
            System.out.println("Hata");


    }
}
