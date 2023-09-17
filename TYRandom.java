public class TYRandom {
    public static void main(String[] args) {
        int i = 0, j = 0, n = 0, l = 0;
       while (i < 50) {
            double a = Math.random() * 100;  //random[a,b)=(Math.random*(b-a))+a
            int k = (int) a;
            System.out.print(k + " ");
            i++;
        }
        System.out.println();
        while (j < 50) {
            int b = (int) (Math.random() * 3);// random=[0,1)=[0*3=0,1*3=3)=[0,3)    (Math.random()*(3-0))+0
            System.out.print(b + " ");
            j++;
        }
        System.out.println();
        while (n < 50) {
            int c = (int) (20 + Math.random() * 40); // random=[20,60)=[0*40,1*40)=[0,40)   20+[0,40)=[20,60)
            System.out.print(c + " ");
            n++;
        }
        System.out.println();
        while (l<500000) {
            int d = (int) ( Math.random() *(600+1))-300; //[-300,300]
            System.out.print(d + " ");
            if(d==-300){
                System.out.println("");
                System.out.println(d);
                break;}   //почему break прерывает цикл while
            l++;
        }
    }
}