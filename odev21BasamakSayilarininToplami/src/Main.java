import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Bir sayının basamak sayılarının toplamını hesaplayan program


        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int total=0;
        while (number!=0){

            if(number/10>0||number/10<0)
            {
                System.out.print("("+number%10+")+");
            }
            else System.out.print("("+number%10+")");
            total+=number%10;
            number/=10;
        }
        System.out.print(" = "+total);

    }
}
