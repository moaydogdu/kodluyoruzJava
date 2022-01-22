import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mesafe,yas,tip;

        Scanner scanner = new Scanner(System.in);
        System.out.println("X Firmasına hoşgeldiniz.");
        System.out.print("Lütfen Mesafeyi km türünden giriniz : ");
        mesafe = scanner.nextInt();
        if(mesafe<=0){
            System.out.println("Hatalı giriş yaptınız. Mesafe değeri" +
                    "0'dan büyük olmalıdır.");
            System.exit(1);
        }
        System.out.print("Lütfen yaşınızı giriniz : ");
        yas = scanner.nextInt();
        if(yas<=0){
            System.out.println("Hatalı giriş yaptınız. Yaş değeri" +
                    " 0'dan büyük olmalıdır.");
            System.exit(1);
        }
        System.out.print("Yolculuk tipini giriniz." +
                " (1: Tek gidiş, 2: Gidiş Dönüş) : ");
        tip=scanner.nextInt();
        if (tip<1||tip>2){
            System.out.println("Hatalı giriş yaptınız. " +
                    "Yolculuk tipi 1 veya 2 olabilir.");
            System.exit(1);
        }

        // Bu noktaya kadar gelindiğinde, bilgiler belirtilen aralıkta
        // ve doğru olarak girilmiş demektir. Hesaplamaya geçelim.

        //Öncelikle indirimsiz normal fiyatı mesafeye göre hesapla.

        double fiyat = (mesafe*0.10);

        // Ardından yaş indirimi.
        // 12 yaşından küçük ise %50
        // 12-24 aralığı %10
        // 65 üstü %30

        if (yas<12)
        {
            //Kullanıcı 12 yaş altı, %50 indirim.
            fiyat= fiyat*0.50;
        }
        else if(yas>=12&&yas<=24){
            //12-24 aralığındaysa %10 indirim
            fiyat = fiyat*0.90;
        }
        else if(yas>65){
            //65 üzerindeyse %30 indirim
            fiyat = fiyat*0.70;

        }

        //Sırada gidiş dönüş indirimi var.
        //Gidiş dönüş (yani 2) seçilmişse %20 indirim.

        if (tip==2)
        {
            //Bu noktada fiyata indirim yap, sonra 2 ile çarp
            //Dönüş için de bir bilet alması gerekiyor :)
            fiyat=fiyat*0.80;
            fiyat=fiyat*2;
        }
        System.out.println("\n\nToplam Tutar = "+fiyat+" TL");


    }
}
