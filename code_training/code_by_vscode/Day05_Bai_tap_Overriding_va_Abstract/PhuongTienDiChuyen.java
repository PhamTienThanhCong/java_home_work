public abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSX;

    public PhuongTienDiChuyen(HangSanXuat hangSX, String loaiPhuongTien) {
        this.hangSX = hangSX;
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public String getLoaiPhuongTien() {
        return this.loaiPhuongTien;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public String nameHangSanXuat(){
        return this.hangSX.getTenHanSanXuat();
    }

    public void batDau(){
        System.out.println("Chạy nào");
    }

    public void tangToc(){
        System.out.println("Nhanh nào tăng tốc");
    }

    public void dungLai(){
        System.out.println("Stop dừng lại");
    }

    public abstract double VanToc();

    @Override
    public String toString() {
        return "{" +
            " loaiPhuongTien='" + getLoaiPhuongTien() + "'" +
            "}";
    }

}
