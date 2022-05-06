public class Student {
    protected int studentCode,n;
    protected String name; 
    protected Subject[] subject; 

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

    public void setSubject(Subject[] subject) {
        this.subject = subject;
    }

}
