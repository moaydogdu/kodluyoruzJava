import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssünü almak istediğiniz sayıyı girin : ");
        int taban = scanner.nextInt();

        System.out.print("Kuvveti girin : ");
        int kuvvet = scanner.nextInt();

        int toplam=taban;

        for (int i = 1;i<kuvvet;i++){

            toplam*=taban;
        }


        if (kuvvet==0) {
            toplam=1;
        }

        
        System.out.println(taban+" sayısının "+kuvvet+". kuvveti = "+toplam);
    }
}
