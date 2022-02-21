package test;

import java.util.Scanner;

import code.QuanLySinhVien;

public class Test {
	public static void main(String[] args) {

		QuanLySinhVien dssv = new QuanLySinhVien();
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			MenuQuanLy();
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("\t1. Thêm sinh viên vào danh sách.");
				dssv.ThemSinhVien();
			}else if (choice == 2) {
				System.out.println("\t2. In danh sách sinh viên ra màn hình.");
				dssv.InDanhSachSinhVien();
			}else if (choice == 3) {
				System.out.println("\t3. Kiểm tra danh sách có rỗng hay không.");
				System.out.println("\t Trống: "+dssv.KiemTraDanhSach());
			}else if (choice == 4) {
				System.out.println("\t4. Lấy ra số lượng sinh viên trong danh sách.");
				System.out.println("\t- Số lượng: "+dssv.SoLuongSinhVien()+" Sinh viên");
			}else if (choice == 5) {
				System.out.println("\t5. Làm rỗng danh sách sinh viên.");
				dssv.LamRongDanhSach();
			}else if (choice == 6) {
				System.out.println("\t6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.");
				System.out.println("Tồn tại: "+ dssv.TimKiemSinhVien());
			}else if (choice == 7) {
				System.out.println("\t7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.");
				dssv.XoaSinhVien();
			}else if (choice == 8) {
				System.out.println("\t8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.");
				dssv.TimSinhVien();
			}else if (choice == 9) {
				System.out.println("\t9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.");
				dssv.InSinhVienTheoDiem();
			}else{
				break;
			}
			System.out.println("Ấn 1 để tiếp tục: ");
			choice = sc.nextInt();
			if (choice != 1) {
				break;
			}
		}
		
	}
	
	public static void MenuQuanLy() {
		clearConsole();
		System.out.println("\n\n\t\tMENU CHƯƠNG TRÌNH");
		System.out.println("\t1. Thêm sinh viên vào danh sách.");
		System.out.println("\t2. In danh sách sinh viên ra màn hình.");
		System.out.println("\t3. Kiểm tra danh sách có rỗng hay không.");
		System.out.println("\t4. Lấy ra số lượng sinh viên trong danh sách.");
		System.out.println("\t5. Làm rỗng danh sách sinh viên.");
		System.out.println("\t6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.");
		System.out.println("\t7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.");
		System.out.println("\t8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.");
		System.out.println("\t9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.");
		System.out.println("\tKhác. Thoát.");
		System.out.print("Nhập lựa chọn: ");
	}
	
	public final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	} 
	
}
