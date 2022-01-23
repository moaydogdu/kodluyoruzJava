import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Ödev : Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.


        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.print("Bir sayı giriniz : ");
        number = scanner.nextInt();

        int taban,toplam=0;

        for(int i=0;i<=number;i++){

            toplam=i;
            for (int j=1;j<4;j++){
                toplam *=i;
            }
            System.out.print(i+"^4="+toplam+" ");
            toplam=i;
            for (int j=1;j<5;j++){
                toplam *=i;
            }
            System.out.println(i+"^5="+toplam+" ");
        }
    }
}

