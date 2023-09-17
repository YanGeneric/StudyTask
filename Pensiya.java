import java.text.DecimalFormat;
import java.util.Scanner;

public class Pensiya {
    public static void main(String[] args) {

            System.out.println(" Введите сколько лет выслуги год за год: ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.println(" Введите сколько лет выслуги год за полтора: ");
            Scanner scan = new Scanner(System.in);
            int b = scan.nextInt();
            int let = a;
            int polt = b;
            double years = let + (polt * 1.5);
            double god=20-years;
            double ost=god/1.5;
        System.out.println("Выслуга состовляет : "+years+" лет");
        System.out.println("До пенсии :"+god+" года (год за год)");
        System.out.println("До пенсии :"+ new DecimalFormat("#0.0").format(ost)+" года(год за полтора)");
               }
        }
