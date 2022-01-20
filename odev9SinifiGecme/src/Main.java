import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;
        int counter=0;


        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz : ");
        mat = input.nextInt();
        if(mat>=0&&mat<101){
            counter++;
        }else
            mat=0;

        System.out.println("Fizik Notunuz : ");
        fizik = input.nextInt();
        if(fizik>=0&&fizik<101){
            counter++;
        }else
            fizik=0;

        System.out.println("Türkçe Notunuz : ");
        turkce = input.nextInt();
        if(turkce>=0&&turkce<101){
            counter++;
        }else
            turkce=0;

        System.out.println("Kimya Notunuz : ");
        kimya = input.nextInt();
        if(kimya>=0&&kimya<101){
            counter++;
        }else
            kimya=0;

        System.out.println("Müzik Notunuz : ");
        muzik = input.nextInt();
        if(muzik>=0&&muzik<101){
            counter++;
        }else
            muzik=0;

        double average=((mat+fizik+turkce+kimya+muzik)/counter);
        if (average>=55){
            System.out.println("Pass : "+average);
        }
        else System.out.println("Fail : "+average);

    }


}
