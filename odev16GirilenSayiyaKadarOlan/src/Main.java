import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        int number,counter=0;
        double average = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        number = scanner.nextInt();

        System.out.println("0'dan "+number+" kadar olan 3 ve 4 ile tam bölünen sayılar; ");
        for (int i = 1; i<=number;i++){
            if (i%3==0 && i%4==0)
            {
                //Eğer sayı 3 ve 4'e kalansız bölünüyorsa
                System.out.println(i);
                counter++;
                average +=i;

            }
        }
        average = average/counter;
        System.out.println("Ortalamaları : "+average);


    }
}
