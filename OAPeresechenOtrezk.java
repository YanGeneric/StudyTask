import java.awt.geom.Line2D;
public class OAPeresechenOtrezk {         // задача на пересечение двух отрезков, со скалярным произведением
    // не решил, воспользовался спец. классом Line2D
    static class Line {
         double x, y, x1, y1;

        Line() {
        }

        Line(double x, double y, double x1, double y1) {
            this.x = x;
            this.x1 = x1;
            this.y = y;
            this.y1 = y1;
        }
        Line(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
Line ln1=new Line(0,0,7,0);
Line ln2=new Line(1,1,6,-5);
        Line2D l1=new Line2D.Double(0.0,0.0,7.0,0.0);
        Line2D l2=new Line2D.Double(1.0,1.0,6.0,-5.0);

    System.out.println((l1.intersectsLine(l2)));
  }
}