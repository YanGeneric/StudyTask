import java.util.Scanner;     //считаем пробелы и буквы
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Schetbykv {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        //   char c = sc.next ().charAt (0);   charAt -возвращает букву по заданному номеру
        // char c = (char) System.in.read ()- прочесть один символ
        String a = sc1.nextLine();
        String b = sc1.nextLine();
        String c = sc1.nextLine();
        String z = a + " " + b + " " + c;

        System.out.println(z);

        System.out.println("Количество букв в строке : " + countLetters(z));
        System.out.println("Количество пробелов в строке : " + countSpaces(z));


    }

    public static int countLetters(String z) {       //считает кол-во букв в строке
        int count = 0;
        String zPattern = "[A-Za-zА-Яа-яЁё]";   //[A-Za-zА-Яа-яЁё]
        Pattern pattern = Pattern.compile(zPattern);
        Matcher matcher = pattern.matcher(z);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static int countSpaces(String z) { //считает кол-во пробелов
        int count = 0;
        String zPattern = "[\\s]";
        Pattern pattern = Pattern.compile(zPattern);
        Matcher matcher = pattern.matcher(z);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
   }


//    Напишите программу - прообраз текстового редактора с подсчетом статистики. Пусть пользователь может вводить
//        несколько строчек текста, к примеру пять штук. Программа должна вывести, сколько в тексте было всего
//        символов во всех 5 строчках. Если пользователь на каком-либо этапе ввёл "quit"