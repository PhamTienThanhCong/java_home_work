import java.util.Scanner;

class Point {
    private double x;
    private double y;
    
    // Câu a
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // câu b
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

    public static double Length2Poin(Point point1, Point point2){
        return Math.sqrt((((point1.getX()-point2.getX())*(point1.getX()-point2.getX())+(point1.getY()-point2.getY())*(point1.getY()-point2.getY()))));
    }

    public static boolean CheckAlignment(Point point1 ,Point point2, Point point3){
        double a = Length2Poin(point1,point2);
        double b = Length2Poin(point2,point3);
        double c = Length2Poin(point1,point3);
        if ((a + b == c) || (c + b == a) || (a + c == b)){
            return true;
        }
        return false;
    }

    public static double ChuViTamGia(Point point1, Point point2, Point point3){
        if  (!CheckAlignment(point1, point2, point3)){
            double a = Length2Poin(point1,point2);
            double b = Length2Poin(point2,point3);
            double c = Length2Poin(point1,point3);
            return a+b+c;
        }
        return 0;
    }

    public static double DienTicdTamGiac(Point point1, Point point2, Point point3){
        if  (!CheckAlignment(point1, point2, point3)){
            double chuvi = ChuViTamGia(point1, point2, point3);
            double d1 = Length2Poin(point1,point2);
            double d2 = Length2Poin(point2,point3);
            double d3 = Length2Poin(point1,point3);
            return Math.sqrt((chuvi*(chuvi-d1)*(chuvi-d2)*(chuvi-d3)));
        }
        return 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y;
        
        // Điem 1
        System.out.println("Nhap Diem 1: ");
        System.out.print("Nhap x: ");
        x = sc.nextDouble();
        System.out.print("Nhap y: ");
        y = sc.nextDouble();

        Point point1 = new Point(x,y);

        // Diem 2
        System.out.println("Nhap Diem 2: ");
        System.out.print("Nhap x: ");
        x = sc.nextDouble();
        System.out.print("Nhap y: ");
        y = sc.nextDouble();

        Point point2 = new Point(x,y);

        //  Diem 3
        System.out.println("Nhap Diem 3: ");
        System.out.print("Nhap x: ");
        x = sc.nextDouble();
        System.out.print("Nhap y: ");
        y = sc.nextDouble();

        Point point3 = new Point(x,y);
        
        System.out.println("------------OUT-------------");
        System.out.println("Thang hang: " + CheckAlignment(point1, point2, point3));
        System.out.println("Chu vi: " + ChuViTamGia(point1, point2, point3));
        System.out.println("Din Tich: " + DienTicdTamGiac(point1, point2, point3));
    }

}