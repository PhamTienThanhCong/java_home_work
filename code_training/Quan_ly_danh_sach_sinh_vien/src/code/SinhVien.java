package code;

public class SinhVien {
	private int maSinhVien;
	private String tenSinhVien;
	private int namSinh;
	private Double diemTrungBinh;
	
	public SinhVien(int maSinhVien, String tenSinhVien, int namSinh, Double diemTrungBinh) {
		super();
		this.maSinhVien = maSinhVien;
		this.tenSinhVien = tenSinhVien;
		this.namSinh = namSinh;
		this.diemTrungBinh = diemTrungBinh;
	}

	public int getMaSinhVien() {
		return this.maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getTenSinhVien() {
		return this.tenSinhVien;
	}

	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}

	public int getNamSinh() {
		return this.namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public Double getDiemTrungBinh() {
		return this.diemTrungBinh;
	}

	public void setDiemTrungBinh(Double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", tenSinhVien=" + tenSinhVien + ", namSinh=" + namSinh
				+ ", diemTrungBinh=" + diemTrungBinh + "]";
	}
	
	
	
	
}
