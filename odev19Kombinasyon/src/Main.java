import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Ödev : N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
        // n'in r'li kombinasyonu olarak adlandırılır. C(n,r) şeklinde gösterilir.

        //Kombinasyon hesaplayan programı yazınız.
        //Formül : C(n,r) = n! / (r!*(n-r)!)

        // Dikkat! 0!=1 ve 1!=1

        Scanner scanner = new Scanner(System.in);

        System.out.print("N değerini giriniz : ");
        int n = scanner.nextInt();

        System.out.print("R değerini giriniz : ");
        int r = scanner.nextInt();

        //N faktöriyel hesaplanması.

        int nFaktoriyel=1;
        for (int i = 1;i<=n;i++)
        {
            nFaktoriyel=nFaktoriyel*i;
        }
        System.out.println(n+"! = "+nFaktoriyel);

        //R faktöriyel hesaplanması.

        int rFaktoriyel=1;
        for (int i = 1;i<=r;i++)
        {
            rFaktoriyel=rFaktoriyel*i;
        }
        System.out.println(r+"! = "+rFaktoriyel);

        //N-R faktöriyel hesaplanması.

        int xFaktoriyel = 1;
        for (int i = 1;i<=n-r;i++)
        {
            xFaktoriyel=xFaktoriyel*i;
        }



        System.out.println("\nFormül : C(n,r) = n! / (r! * (n-r)!)");
        System.out.println("C("+n+","+r+") = "+nFaktoriyel+" / ("+rFaktoriyel+" * ("+n+"-"+rFaktoriyel+")" +
                "!)");
        System.out.println("C("+n+","+r+") = "+nFaktoriyel+" / ("+rFaktoriyel+" * "+(n-r)+"!)");
        System.out.println("C("+n+","+r+") = "+nFaktoriyel+" / "+(rFaktoriyel*xFaktoriyel));
        int kombinasyon = nFaktoriyel / (rFaktoriyel*xFaktoriyel);

        System.out.println("Kombinasyon = "+kombinasyon);

    }
}
