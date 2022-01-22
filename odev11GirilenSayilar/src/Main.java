import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Ödev : Girilen 3 sayıyı, küçükten büyüğe sıralayan program.

        int a,b,c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        a = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        b = scanner.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        c = scanner.nextInt();

        int min,average,max;

        if(a<b&&a<c){
            min=a;
            if (b<c){
                max=c;
                average=b;
            }
            else{
                max=b;
                average=c;
            }
        }
        else if(b<a&&b<c){
            min=b;
            if (a<c){
                max=c;
                average=a;
            }
            else
            {
                max=a;
                average=c;
            }
        }
        else
        {
            min=c;
            if (a<b){
                max=b;
                average=a;
            }
            else
            {
                max=a;
                average=b;
            }
        }

        System.out.println(min+"<"+average+"<"+max);






    }
}
