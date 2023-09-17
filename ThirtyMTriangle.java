public class ThirtyMTriangle {
    public static void main(String[] args) {

        Triangle one = new Triangle(1, 3, 5, 4, 8, 9);   // не до конца понимаю задачу
        System.out.println("Координаты точки A " + "(" + one.a.x + ";" + one.a.y + ")" +
                ", координаты точки B " + "(" + one.b.x + ";" + one.b.y + ")" +
                ", координаты точки C " + "(" + one.c.x + ";" + one.c.y + ")");
    }

    static class Triangle {
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();

        Triangle() {
        }

        Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
            a.x = x1;
            a.y = y1;
            b.x = x2;
            b.y = y2;
            c.x = x3;
            c.y = y3;
        }
    }

    static class Point {
        int x, y;

        Point() {
            x = 0;         // не понятно тут ->Если  представить координаты в виде ссылок на объекты без их объявления, то вылезет NPE
            y = 0;
        }

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

