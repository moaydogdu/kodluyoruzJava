import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Mantık;
        // Bir yılın artık yıl olması şartı;
        // 4'e tam bölünüp, 100'e tam bölünmemeli.
        // 100'e tam bölünmüyorken, 400'e tam bölünmeli.

        Scanner scanner = new Scanner(System.in);

        int yil;

        System.out.print("Lütfen yıl giriniz : ");
        yil = scanner.nextInt();

        if(yil%4==0 && (yil%100!=0||yil%400==0)){
            //4'e tam bölünüyor.
            //100'e tam bölünmüyor veya bölünüyorsa da 400'e de
            //tam bölünüyor.
            //Dolayısıyla artık yıldır.
            System.out.println(yil+" bir artık yıldır!");
        }
        else
            System.out.println(yil+" bir artık yıl değildir!");



    }
}
