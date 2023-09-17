import java.util.Scanner;

public class FYRazborchisla {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

      System.out.println("Введите трехзначное число: ");

        int a= sc.nextInt();
int a1=a/100;
int a2=(a%100)/10;// остаток от деления-выводит две последнии цифры+делим на 10 выводит предпоследнюю
int a3=a%10;    // смещает запятую и выводит остаток(последнее цифру в числе)

     System.out.print(a1+" ");
        System.out.print(a2+" ");
        System.out.print(a3);


    }
}
