import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        int r,a;
        double pi=3.14;

        System.out.println("Yarıçapı Girin : ");
        r = scanner.nextInt();
        System.out.println("Açıyı Girin : ");
        a = scanner.nextInt();

        double alan = pi*r*r;
        double cevre = 2*pi*r;


        System.out.println("Dairenin alanı : "+alan);
        System.out.println("Dairenin çevresi : "+cevre);

        //Formül (pi*(r*r)*a) / 360

        double acininAlani = (pi*(r*r)*a) / 360;

        System.out.println(a+" Derecelik Açının Alanı : "+acininAlani);

    }
}
