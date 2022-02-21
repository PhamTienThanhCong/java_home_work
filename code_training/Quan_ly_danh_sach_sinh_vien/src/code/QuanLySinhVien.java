package code;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
	Scanner sc = new Scanner(System.in);
//	Khai báo mảng động giống vector trong c++
	private ArrayList<SinhVien> danhSachSinhVien;

//	tạo 1 constructor rỗng
	public QuanLySinhVien() {
		this.danhSachSinhVien = new ArrayList<SinhVien>();
	}
	
//	Thêm sinh viên
	public SinhVien ThemMotSinhVien() {
		int maSinhVien;
		String tenSinhVien;
		int namSinh;
		Double diemTrungBinh;
		
		System.out.print("Nhập mssv: ");
		maSinhVien = sc.nextInt();
		
		System.out.print("Nhập họ và tên sinh viên: ");
		tenSinhVien = sc.nextLine();
		tenSinhVien = sc.nextLine();
		
		System.out.print("Nhập năm sinh: ");
		namSinh = sc.nextInt();
		
		System.out.print("Nhập Diểm trung bình: ");
		diemTrungBinh = sc.nextDouble();
		
		SinhVien sv = new SinhVien(maSinhVien, tenSinhVien, namSinh, diemTrungBinh);
		
		return sv;
		
	}
	
	public void ThemSinhVien() {
		this.danhSachSinhVien.add(ThemMotSinhVien());
	}
	
//	in danh sách sinh viên
	public void InDanhSachSinhVien() {
		System.out.println("IN DANH SÁCH SINH VIÊN: ");
		int i = 1;
		for (SinhVien danhSach : this.danhSachSinhVien) {
			System.out.println("- Sinh viên thứ: " + (i));
			System.out.println("\t- Mã sinh viên: " + danhSach.getMaSinhVien());
			System.out.println("\t- Tên sinh viên: " + danhSach.getTenSinhVien());
			System.out.println("\t- Năm Sinh: " + danhSach.getNamSinh());
			System.out.println("\t- Diểm Trung Bình: " + danhSach.getDiemTrungBinh() + " Điểm");
			i++;
		}
	}

//	Kiểm tra danh sách sinh viên có rỗng hay không
	public boolean KiemTraDanhSach() {
		if (SoLuongSinhVien() == 0) {
			return true;
		}else {
			return false;
		}
	}
	
//	in ra số luongj sinh viên hiện có
	public int SoLuongSinhVien() {
		return this.danhSachSinhVien.size();
	}
	
//	làm rỗng danh sách sinh viên
	public void LamRongDanhSach() {
		this.danhSachSinhVien = new ArrayList<SinhVien>();
	}
	
//	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
	public boolean TimKiemSinhVien() {
		System.out.print("Nhập mã số sinh viên: ");
		int mssv = sc.nextInt();
		for (SinhVien danhSach : this.danhSachSinhVien) {
			if (danhSach.getMaSinhVien() == mssv) {
				return true;
			}
		}
		return false;
	}
	
//	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
	public void XoaSinhVien() {
		
		System.out.print("Nhập mã số sinh viên: ");
		int mssv = sc.nextInt();
		
		boolean check = true;
		int i=0;
		
		for (SinhVien danhSach : this.danhSachSinhVien) {
			if (danhSach.getMaSinhVien() == mssv) {
				this.danhSachSinhVien.remove(i);
				System.out.println("Xóa thành công sinh viên "+mssv);
				check = false;
				break;
			}
			i++;
		}
		
		if (check) {
			System.out.println("Xóa thất bại, không tìm thấy mã sinh viên");
		}
		
	}
	
	public void TimSinhVien() {
		System.out.print("Nhập tên sinh viên: ");
		String name = sc.nextLine();
		
		name = sc.nextLine();
		boolean check = true;
		for (SinhVien danhSach : this.danhSachSinhVien) {
			if (danhSach.getTenSinhVien().contains(name)) {
				System.out.println(danhSach.getTenSinhVien() + ", mssv: " + danhSach.getMaSinhVien());
				check = false;
			}
		}
		if (check) {
			System.out.println("Khum có sinh viên nào có tên như zị");
		}
	}
	
	public void InSinhVienTheoDiem() {
		ArrayList<SinhVien> danhSachSinhVienCopy;
		danhSachSinhVienCopy = new ArrayList<>(this.danhSachSinhVien);
		
		for (int i = 0 ; i < danhSachSinhVienCopy.size() ; i++) {
			for (int j = i ; j < danhSachSinhVienCopy.size() ; j++) {
				if ( danhSachSinhVienCopy.get(i).getDiemTrungBinh() < danhSachSinhVienCopy.get(j).getDiemTrungBinh() ) {
					
					SinhVien tmp = danhSachSinhVienCopy.get(i);
					danhSachSinhVienCopy.set(i, danhSachSinhVienCopy.get(j));
					danhSachSinhVienCopy.set(j, tmp);
				
				}
			}
		}
		
		System.out.println("IN DANH SÁCH SINH VIÊN: ");
		int i = 1;
		for (SinhVien danhSach : danhSachSinhVienCopy) {
			System.out.println("- Sinh viên thứ: " + (i));
			System.out.println("\t- Mã sinh viên: " + danhSach.getMaSinhVien());
			System.out.println("\t- Tên sinh viên: " + danhSach.getTenSinhVien());
			System.out.println("\t- Năm Sinh: " + danhSach.getNamSinh());
			System.out.println("\t- Diểm Trung Bình: " + danhSach.getDiemTrungBinh() + " Điểm");
			i++;
		}
	
	}
	
}
