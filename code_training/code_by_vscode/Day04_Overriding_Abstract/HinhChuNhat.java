public class HinhChuNhat extends Hinh {

    private double a,b;

    public HinhChuNhat(Point point, double a, double b) {
        super(point);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double DienTich() {
        return getA()*getB();
    }
    
}
