import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double a,b,c,cevre;

        //Üçgenin çevresi, kenar uzunluklarının toplamıdır.
        // cevre = a+b+c;

        //Üçgenin alanını bulmak, aslında üçgenin iki katı olan bir
        //Dikdörtgenin alanının yarısını bulmaktır.
        //Dolayısıyla
        //Alan(ABC) = (a.h)/2


        //Fakat burada bize 3 kenar veriliyor, yükseklik verilmiyor.
        //Üç kenarı verilen bir üçgenin alanı;
        //Çevre(ABC) = A+B+C
        //Çevre = 2u kabul edilir formül gereği.
        //Yani u = çevrenin yarısı
        //u=çevre/2
        //Alan(ABC) = u*(u-a)*(u-b)*(u-c) ifadesinin köküne eşittir.
        //Bir başka deyişle bu ifade alanın karesine eşittir.

        //Kullanıcıdan kenarları alalım.
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Kenarı Girin : ");
        a = scanner.nextDouble();
        System.out.println("2. Kenarı Girin : ");
        b = scanner.nextDouble();
        System.out.println("3. Kenarı Girin : ");
        c = scanner.nextDouble();

        //Kenarları aldık, hesaplamaya geçelim.

        cevre = a+b+c;

        //Çevreyi 2u kabul edersek, u tanımlayalım.

        double u = cevre/2;

        //Alanın bulan formülü yazalım.

        double alan;
        alan = Math.sqrt((u*(u-a)*(u-b)*(u-c)));

        //Alanı kullanıcıya bildirelim.
        System.out.println("Kenar uzunluklarını girmiş olduğunuz üçgenin alanı : "+alan+"\u00B2");


    }
}
