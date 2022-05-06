import java.util.Scanner;

public class Student {
    protected int studentCode,n;
    protected String name; 
    protected Subject[] subject; 

    Scanner sc = new Scanner(System.in);

    public Student(){}

    public Student(int studentCode, String name, int n){
        this.studentCode = studentCode;
        this.name = name;
        this.n = n;
        subject = new Subject[n];
    }

    public int getStudentCode() {
        return this.studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public int getN() {
        return this.n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject[] getSubject() {
        return this.subject;
    }

    public void setSubject() {
        for (int i = 0; i < this.n; i++){
            System.out.print("Ma Mon Hoc: ");
            int ma = sc.nextInt();
            System.out.print("Ten Mon Hoc: ");
            String tenMonHoc = sc.nextLine();
            tenMonHoc = sc.nextLine();
            System.out.print("Diem Giua Ki: ");
            double diemGiuaKi = sc.nextDouble();
            System.out.print("Diem Cuoi Ki: ");
            double diemCuoiKi = sc.nextDouble();
            this.subject[i] = new Subject(ma, tenMonHoc, diemGiuaKi, diemCuoiKi);
        }
    }

    public static void main(String[] args) {
        Student[] st1 = new Student[10];
        
    }

}
