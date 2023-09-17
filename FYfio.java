import java.util.Scanner;
class FYfio {                  //вывести фамилию и инициаллы
      public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
          System.out.println("Введите  ваше имя:");
    String a =sc.next();
          System.out.println("Введите вашу фамилию:  ");
         String  b=sc.next();
          System.out.println("Введите ваше отчество:  ");
          String  c=sc.next();
          System.out.print("Привет "+b+" "+(a.charAt(0))+"."+c.charAt(0)+".");

    }
}

