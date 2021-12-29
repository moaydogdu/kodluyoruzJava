import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Boy ve kilo değerleri alınacak.

        double boy,kilo;

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = scanner.nextDouble();

        //Vücut kitle endeksi hesaplaması
        //Formül = kilo/boy*boy

        double indeks = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz : "+indeks);


    }
}
