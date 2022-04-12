import java.lang.reflect.Constructor;

public class Point {
    public double x,y;

    public Point() {
    }

    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double KhoangCach(Point p1, Point p2) {
        double a = p2.x - p1.x;
        double b = p2.y - p1.y;
        return Math.sqrt(a*a + b*b);
    }

    public Boolean checkThangHang(Point a, Point b, Point c) {
        double ab = KhoangCach(a,b);
        double ac = KhoangCach(c,a);
        double bc = KhoangCach(b,c);

        if (ab > ac + bc || ac > ab + bc || bc > ac + ab){
            return false;
        }
        return true;
    }

}
