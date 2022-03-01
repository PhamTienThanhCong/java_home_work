public class HinhTron extends Hinh {

    private double r;

    public double getR() {
        return this.r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public HinhTron(Point point, double r) {
        super(point);
        this.r = r;
    }

    @Override
    public double DienTich() {
        return getR()*Math.PI;
    }
    
}
