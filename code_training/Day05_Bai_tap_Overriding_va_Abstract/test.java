public class test {
    public static void main(String[] args) {
        HangSanXuat hangSX1 = new HangSanXuat("Công thi Hạnh Phú","Việt Nam");
        PhuongTienDiChuyen phuongTien1 = new XeDap(hangSX1,"Xe đạp");

        HangSanXuat hangSX2 = new HangSanXuat("bam bô e way","Hoa Kì");
        MayBay phuongTien2 = new MayBay(hangSX2,"Máy bay","diozen");

        HangSanXuat hangSX3 = new HangSanXuat("nam bô ghi ni","Ytalia");
        PhuongTienDiChuyen phuongTien3 = new XeOto(hangSX3,"Xe Hơi","Dầu hỏa");

        System.out.println(phuongTien1.getLoaiPhuongTien());
        System.out.println(phuongTien1.nameHangSanXuat());
        System.out.println(phuongTien1.VanToc()+" km/h");

        System.out.println("------------------------------");

        System.out.println(phuongTien3.getLoaiPhuongTien());
        System.out.println(phuongTien3.nameHangSanXuat());
        System.out.println(phuongTien3.VanToc()+" km/h");

        System.out.println("------------------------------");

        System.out.println(phuongTien2.getLoaiPhuongTien());
        System.out.println(phuongTien2.nameHangSanXuat());
        phuongTien2.catCanh();
        System.out.println(phuongTien2.VanToc()+" km/h");
        phuongTien2.haCanh();
    }
}
