import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Meyveler ve KG Fiyatları;
        /*
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
         */

        Scanner scanner = new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
        double toplam=0;

        System.out.println("Armut Kaç Kilo ? :");
        toplam += armut * scanner.nextDouble();
        System.out.println("Elma Kaç Kilo ? :");
        toplam += elma * scanner.nextDouble();
        System.out.println("Domates Kaç Kilo ? :");
        toplam += domates * scanner.nextDouble();
        System.out.println("Muz Kaç Kilo ? :");
        toplam += muz * scanner.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ? :");
        toplam += patlican * scanner.nextDouble();
        System.out.println("Toplam Tutar : "+toplam+" TL");


    }
}
