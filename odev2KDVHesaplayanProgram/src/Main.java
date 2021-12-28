import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Değişkenlerin tanımlanması

        double tutar,kdvOran, kdvTutar, kdvliTutar;

        //Kullanıcıdan ücret bilgisinin alınması

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz: ");
        tutar = scanner.nextDouble();

        //KDV Tutarı 0-1000 arasında %18, 1000 üzerinde ise %8 olacak [ÖDEV]

        kdvOran = tutar>1000?0.08:0.18;

        //Hesaplamaların yapılması

        kdvTutar = tutar * kdvOran; //KDV Tutarının Hesaplanması
        kdvliTutar = tutar + kdvTutar; //KDV li tutarın hesaplanması. KDV+Girilen tutar.

        //Bilgilerin ekrana yazdırılması.

        System.out.println("KDV'siz Tutar : "+tutar);
        System.out.println("KDV Oranı : "+kdvOran);
        System.out.println("KDV Tutarı : "+kdvTutar);
        System.out.println("KDV'li Tutarı : "+kdvliTutar);



    }
}
