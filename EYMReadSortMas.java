import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class EYMReadSortMas {
    public static void main(String[] args) throws Exception {
        String separaptor = File.separator;  //взависимости от оперционной системы слэш в разные стороны
        String path = "D:" + separaptor + "Game of Brain" + separaptor + "name.txt";
        BufferedReader redaer = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder(",").append(redaer.readLine());
        sb.deleteCharAt(0); //удалили первую запятую см.debug
        String[] names = sb.toString().split(",");

        redaer.close();
       Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+",");
        }
      System.out.println();
//сортировка масива в обратном порядке
        int n = names.length;
        String temp; //Переменная, которая будет использоваться при обмене элементов

        for (int i = 0; i < n / 2; i++) {   //проходиться только пол массива больше не нужно
            temp = names[n - i - 1];
            names[n - i - 1] = names[i];// n-i-1 это просто формула для определения "противоположного" элемента массива
            names[i] = temp;}
            for (int i = 0;  i< names.length; i++) {
            System.out.print(names[i]+",");
        }

        }
    }


