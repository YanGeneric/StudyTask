import java.util.Scanner;

public class JanTwelfDomNomerKvartir {
    public static void main(String[] args) {
        System.out.println(" Введите номер квартиры :");
        Scanner sc =new Scanner(System.in);
        double a =sc.nextDouble();
        int stage =(int)Math.ceil(a/4);
        System.out.println(stage +" этаж ");
a=a%4;
        if(a==1||a==0)
    System.out.println("Квартира слева");
        if(a==2||a==3)
            System.out.println("Квартира справа ");


    }
}
