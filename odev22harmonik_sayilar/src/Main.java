import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı gir.");
        int number = scanner.nextInt();

        double total=0;
        for (int i=1;i<=number;i++){
            total+= (1.0/i);
            //yukarıda 1.0 olarak belirtiyorum ki işlem sonucu double dönsün.
        }
        System.out.println(total);

    }
}

