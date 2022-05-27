import java.util.Scanner;

public class Sach {
    private String tensach;
    private String tentacgia;
    private String nhaxuatban;
    private int namxuatban;
    boolean tinhtrang;

    Sach(String tensach, String tentacgia, String nhaxuatban, int namxuatban, boolean tinhtrang) {
        this.tensach = tensach;
        this.tentacgia = tentacgia;
        this.nhaxuatban = nhaxuatban;
        this.namxuatban = namxuatban;
        this.tinhtrang = tinhtrang;
    }

    Sach() {
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao ten sach : ");
        tensach = sc.nextLine();
        System.out.println("Moi ban nhap vao nha xuat ban : ");
        nhaxuatban = sc.nextLine();
        System.out.println("Moi ban nhap vao ten tac gia : ");
        tentacgia = sc.nextLine();
        System.out.println("Moi ban nhap vao nam xuat ban : ");
        namxuatban = sc.nextInt();

    }

    public void check() {
        if (tinhtrang ) {
            System.out.println("Sach con trong thu vien");
        } else {
            System.out.println("Sach con trong thu vien");
        }

    }

    public void in() {
        System.out.println("Ten Sach :" + tensach);
        System.out.println("Ten tac gia :" + tentacgia);
        System.out.println("Ten nha xuat ban  :" + nhaxuatban);
        System.out.println("nam xuat ban :" + namxuatban);
    }
}


public class Ban_Doc {
    public String diachi;
    public String hoten;
    public String tensach1;

    Ban_Doc() {
    }

    Ban_Doc(String diachi, String hoten, String tensach1) {
        this.diachi = diachi;
        this.hoten = hoten;
        this.tensach1 = tensach1;
    }

    public void nhapbandoc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao ho ten : ");
        hoten = sc.nextLine();
        System.out.println("Moi ban nhap vao dia chi : ");
        diachi = sc.nextLine();

    }

    void muon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap cuon sach muon muon : ");
        tensach1 = sc.nextLine();
    }

    void tra() {
        System.out.println("Da tra sach");
    }

    void inbandoc() {
        System.out.println("Ten Sach  muon :" + tensach1);
        System.out.println("Ten ban doc :" + hoten);
        System.out.println("dia chi  :" + diachi);
    }
    public static void main(String[] args) {
        Ban_Doc bd = new Ban_Doc();
        bd.nhapbandoc();
        bd.muon();
        bd.tra();
        bd.inbandoc();
    }
}


