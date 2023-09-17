import java.util.Scanner;

public class SumChilesDoChisla {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner=new Scanner(System.in);
        int sc=scanner.nextInt();

        int k=0;
        for(int i=0;i<=sc;i++){    //1 2 3
                         k=k+i;
                   }
        System.out.println("Сумма чисел  от 0 до "+sc+" равна "+k);
   scanner.close();
    }
}
