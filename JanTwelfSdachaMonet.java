import java.util.Scanner;

public class JanTwelfSdachaMonet {
    public static void main(String[] args) {
        int  a10, a50, a100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму: ");
        int a = sc.nextInt();
        a100 = a / 100;
        a50=(a-a100*100)/50;           //незнаю по какое формуле
        a10=(a-a100*100-a50*50)/10;


        if ((a100 * 100 + a50 * 50 + a10 * 10) == a)
            System.out.println(a100 + " по 100р | " + a50 + " по 50р| " + a10 + " по 10р");
        else
        System.out.println("Нельзя");
    }
}
