import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int year;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        year = scanner.nextInt();

        year=year%12;
        String message="Çin Zodyağı Burcunuz : ";

        switch (year){
            case 0:
                message+="Maymun";
                break;
            case 1:
                message+="Horoz";
                break;
            case 2:
                message+="Köpek";
                break;
            case 3:
                message+="Domuz";
                break;
            case 4:
                message+="Fare";
                break;
            case 5:
                message+="Öküz";
                break;
            case 6:
                message+="Kaplan";
                break;
            case 7:
                message+="Tavşan";
                break;
            case 8:
                message+="Ejderha";
                break;
            case 9:
                message+="Yılan";
                break;
            case 10:
                message+="At";
                break;
            case 11:
                message+="Koyun";
                break;


        }

        System.out.println(message);




    }
}
