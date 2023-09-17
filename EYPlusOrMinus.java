import java.util.Scanner;

public class EYPlusOrMinus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0)
            System.out.println(" Число положительно :"+a);

        if(a<0)
            System.out.println("Число отрицательное:"+a);

        if(a==0)
            System.out.println("Вы ввели ноль :"+a);

    }
}
