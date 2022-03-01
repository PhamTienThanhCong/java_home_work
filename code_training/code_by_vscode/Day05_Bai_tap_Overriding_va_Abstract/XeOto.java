public class XeOto extends PhuongTienDiChuyen{

    private String loaiNhienLieu;

    public XeOto(HangSanXuat hangSX, String loaiPhuongTien, String loaiNhienLieu) {
        super(hangSX, loaiPhuongTien);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return this.loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double VanToc() {
        // TODO Auto-generated method stub
        return 80;
    }
    
}
