public class MayBay extends PhuongTienDiChuyen{

    private String loaiNhienLieu;

    public MayBay(HangSanXuat hangSX, String loaiPhuongTien, String loaiNhienLieu ) {
        super(hangSX, loaiPhuongTien);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return this.loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh(){
        System.out.println("Bay nào");
    }

    public void haCanh(){
        System.out.println("Hạ cánh");
    }

    @Override
    public double VanToc() {
        return 2000;
    }

}
