public class Point {

    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point x(int x) {
        setX(x);
        return this;
    }

    public Point y(int y) {
        setY(y);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Point)) {
            return false;
        }
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public String toString() {
        return "{" +
            " x='" + getX() + "'" +
            ", y='" + getY() + "'" +
            "}";
    }

}
