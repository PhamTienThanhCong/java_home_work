public abstract class Hinh {
    protected Point point;

    public Hinh(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return this.point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "{" +
            " point='" + getPoint() + "'" +
            "}";
    }

    public abstract double DienTich();

}
