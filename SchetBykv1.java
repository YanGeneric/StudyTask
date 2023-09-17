import java.util.Scanner; //01.09.2023  счет букв в строке

public class SchetBykv1 {
           public static void main(String[] args) {
               //все, кроме пробелов, тогда выполните проверку в if виде temp != ' '
            Scanner sc1 = new Scanner(System.in);

            String a = sc1.nextLine();

                       System.out.println(a);

            int charCount = 0;
            char temp;

            for( int i = 0; i < a.length( ); i++ )
            {
                temp = a.charAt( i );
                if( Character.isLetter(temp))         //isDigit( ) цифры
                    charCount++;
            }
            System.out.println(charCount);
        }
    }
