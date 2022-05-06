public class Subject {
    protected int subjectCode;
    protected String subjectName;
    protected double x,y;

    public Subject(){}
    
    public Subject(int subjectCode, String subjectName, double x,double y){
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.x = x;
        this.y = y;
    }


    public void setSubject(int subjectCode, String subjectName, double x,double y){
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.x = x;
        this.y = y;
    }

    public double TrungBinh(){
        return 0.5*this.x + 0.5*this.y;
    }

}
