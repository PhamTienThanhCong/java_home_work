import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Point {
    Scanner sc = new Scanner(System.in);
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

    public void getNewValue(){
        System.out.print("x: ");
        double x = sc.nextDouble();
        System.out.print("y: ");
        double y = sc.nextDouble();
        this.setX(x);
        this.setY(y);
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

    public static double KhoangCach(Point p1, Point p2) {
        double a = p2.x - p1.x;
        double b = p2.y - p1.y;
        return Math.sqrt(a*a + b*b);
    }

    public static Boolean checkThangHang(Point a, Point b, Point c) {
        double ab = KhoangCach(a,b);
        double ac = KhoangCach(c,a);
        double bc = KhoangCach(b,c);

        if (ab > ac + bc || ac > ab + bc || bc > ac + ab){
            return false;
        }
        return true;
    }

    public static double DienTich(Point a, Point b, Point c){
        double ab = KhoangCach(a,b);
        double ac = KhoangCach(c,a);
        double bc = KhoangCach(b,c);
        double ChuVi = ab + ac + bc;
        return Math.sqrt(ChuVi*(ChuVi - ab)*(ChuVi - bc)*(ChuVi - ac));
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        System.out.println("Diem 1: ");
        p1.getNewValue();

        System.out.println("Diem 2: ");
        p2.getNewValue();

        System.out.println("Diem 3: ");
        p3.getNewValue();

        if (checkThangHang(p1, p2, p3)) {
            System.out.println("Dien Tich La: " + DienTich(p1, p2, p3));
        }else{
            System.out.println("3 Diem Thang Hang");
        }

    }

}
