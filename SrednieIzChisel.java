import java.util.Arrays;                //06.09.2023
import java.util.Scanner;

public class SrednieIzChisel {      //задание 15.50 среднее арифметическое  9 оценок
    public static void main(String[] args) {
        int count=0,summ=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите количество оценок");
        int size=sc.nextInt();
        int []grades=new int[size];
        System.out.println("Введите оценки и нажимайте кнопку ENTER");

        for(int i=0;i<size;i++){
             grades  [i] = sc.nextInt();
             while(grades[i]<1||grades[i]>5){
                 count++;
                 System.out.println("Извините оценивается по пятибалной шкале, введите оценку заново ");
                 grades  [i] = sc.nextInt();
             }
           summ+=grades[i];
        }
          System.out.println(Arrays.toString(grades));
        System.out.println("Средний бал - " + 1.0*(summ/size));
         System.out.println("Количество ошибочно введенных оценок - "+count);

    }
}
