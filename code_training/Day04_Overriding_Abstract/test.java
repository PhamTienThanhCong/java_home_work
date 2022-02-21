public class test {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        Hinh h1 = new HinhTron(point, 10);
        Hinh h2 = new HinhChuNhat(point, 10, 20);
        System.out.println(h1.DienTich());
        System.out.println(h2.DienTich());
    }
}
