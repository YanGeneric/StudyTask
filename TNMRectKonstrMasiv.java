public class TNMRectKonstrMasiv {
    public static void main(String[] args) {   //masiv str 148
        System.out.println(what(2734));
        System.out.println(what(688));
        System.out.println();
    }

    public static int what(int n) {
        while (n % 2 != 1 && n > 0)
            n = n / 10;
        return n % 10;
    }

    class Rect {       //#13 Конструкторы, ключевое слово this, инициализаторы in end(selfedu)
        int x, y, x1, y1, width, height;

        Rect(int x, int y, int x1, int y1) {
            this.x = x;
            this.y = y;
            this.x1 = x1;
            this.y1 = y1;
        }

        Rect() {

        }

        Rect(int x, int y, double width, int height) {
            this.x = x;
            this.y = y;
            this.width = (int) width;
            this.height = height;
        }
    }
}

