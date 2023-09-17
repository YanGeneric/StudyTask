import java.util.Scanner;  //Необходимо написать метод, который бы возводил число в степень.
// И далее два числа, возведенные в степень, должны быть просуммированы, а результат выведен в консоль.
//13.08.2023
public class ChisloStepen {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println(" ведите первое число");
        int a = sc1.nextInt();
        System.out.println(" ведите степень  первого числа");
        int b = sc1.nextInt();
        System.out.println(" ведите второе число");
        int c = sc1.nextInt();
        System.out.println(" ведите степень  второго числа");
        int d = sc1.nextInt();

        System.out.println( pervoe(a,b,c,d));
    }
        static int   pervoe(int a, int b,int c,int d){
            int result = 1;
            int result1 = 1;
            for (int i=1; i<=b; i++){
                result = result*a;
            }
            for (int i=1; i<=d; i++) {
                result1 = result1 * c;
            }
            return result+result1;
     }
}

