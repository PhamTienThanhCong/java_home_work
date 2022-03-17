class Point {
    private Double x;
    private Double y;
    
    // Câu a
    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    
    // câu b
    public Double getX() {
        return this.x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return this.y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    boolean CheckAlignment(Point point2, Point point3){
        return true;
    }

}