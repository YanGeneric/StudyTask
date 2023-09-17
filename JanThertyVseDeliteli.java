import java.util.Scanner;
public class JanThertyVseDeliteli {
    public static void main(String[] args) {
        System.out.println("Введите чило :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
              if (a % i == 0){
              int  count= a/i;
            System.out.print(count+" ");
           }
    }
}
}
