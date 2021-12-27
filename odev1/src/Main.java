import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Değişkenleri oluşturuyoruz.
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfımızı tanımlıyoruz.
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan değerleri alıyoruz.

        System.out.println("Matematik Notunuzu Girin: ");
        mat=scanner.nextInt();

        System.out.println("Fizik Notunuzu Girin: ");
        fizik=scanner.nextInt();

        System.out.println("Kimya Notunuzu Girin: ");
        kimya=scanner.nextInt();

        System.out.println("Türkçe Notunuzu Girin: ");
        turkce=scanner.nextInt();

        System.out.println("Tarih Notunuzu Girin: ");
        tarih=scanner.nextInt();

        System.out.println("Müzik Notunuzu Girin: ");
        muzik=scanner.nextInt();

        //Hesaplamayı yapalım ve ekrana yazdıralım.

        double ortalama;
        ortalama = (mat+fizik+kimya+turkce+tarih+muzik) / 6;

        System.out.println("Not ortalamanız : "+ortalama);
        System.out.println(ortalama>=60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");




    }
}
