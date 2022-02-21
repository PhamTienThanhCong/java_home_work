public class myDate {
    private int day;
    private int month;
    private int year;

    // constructor
    public myDate(int day, int month, int year){
        if (day < 1 || day > 31){
            day = 1;
        }
        if (month < 1 || month > 12){
            month = 1;
        }
        if (year < 1){
            year = 1;
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Get
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    
    // Set
    public void setDay(int day){
        if (day > 0 && day < 32){
            this.day = day;
        }
    }

    public void setMonth(int month){
        if (month > 0 && month < 13){
            this.month = month;
        }
    }

    public void setYear(int year){
        if (year > 0){
            this.year = year;
        }
    }
    
    // print date 

    public void printDate(){
        System.out.println("Date: " + this.day + "-" + this.month + "-" + this.year);
    }

    // toString
    
    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }

    // equals hàm để so sánh 2 đối tượng với nhau
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }
        myDate other = (myDate) obj;
        if (this.getDay() != other.getDay()){
            return false;
        }
        if (this.getMonth() != other.getMonth()){
            return false;
        }
        if (this.getYear() != other.getYear()){
            return false;
        }

        return true;
    }

}
