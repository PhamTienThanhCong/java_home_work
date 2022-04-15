public class Point3d extends Point {
    private double z;
    public Point3d() {
    }
    public Point3d(double z) {
        this.z = z;
    }
    public Point3d(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    public Point3d(Point3d p) {
        super(p.x, p.y);
        this.z = p.z;
    }
    public Point3d(Point p, double z) {
        super(p);
        this.z = z;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    

}
