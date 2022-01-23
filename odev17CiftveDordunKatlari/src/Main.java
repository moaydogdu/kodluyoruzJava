import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Ödev : Tek sayı girilene kadar kullanıcıdan girişleri kabul eden
        // Girilen değerlerden çift ve 4'ün katı olan sayıları toplayıp ekrana basan program

        Scanner scanner = new Scanner(System.in);
        int input,sum=0;

        do {
            System.out.print("Lütfen bir sayı giriniz : ");
            input = scanner.nextInt();
            if(input%2==0){
                //Sayı çift ise.
                if (input%4==0){
                    //Aynı zamanda 4'ün katı ise.
                    sum += input;
                }
                else continue;
            }
            else {
                //Sayı tek demektir. Döngüyü kır.
                break;
            }
        }while(true);

        
        System.out.println(sum);


    }
}
