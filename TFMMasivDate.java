public class TFMMasivDate {
    public static void main(String[] args) {
int []a={3,5, 6, 7, 3, 9, 1, 6};


        System.out.println(make(a, 5));
    }
       public static int make(int []a, int k) {

               int i, s = 0;

           for (i=0;i<k;i=i+2)          //скачем по элементам масива на +2 и выводим сумму
               s=s+a[i];
           return s;


//        Date current = new Date();
//        System.out.println(current);

   }
}




