public class HangSanXuat {
    private String tenHanSanXuat;
    private String tenQuocGia;

    public HangSanXuat(String tenHanSanXuat, String tenQuocGia) {
        this.tenHanSanXuat = tenHanSanXuat;
        this.tenQuocGia = tenQuocGia;
    }

    public String getTenHanSanXuat() {
        return this.tenHanSanXuat;
    }

    public void setTenHanSanXuat(String tenHanSanXuat) {
        this.tenHanSanXuat = tenHanSanXuat;
    }

    public String getTenQuocGia() {
        return this.tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    public HangSanXuat tenHanSanXuat(String tenHanSanXuat) {
        setTenHanSanXuat(tenHanSanXuat);
        return this;
    }

    public HangSanXuat tenQuocGia(String tenQuocGia) {
        setTenQuocGia(tenQuocGia);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " tenHanSanXuat='" + getTenHanSanXuat() + "'" +
            ", tenQuocGia='" + getTenQuocGia() + "'" +
            "}";
    }

}
