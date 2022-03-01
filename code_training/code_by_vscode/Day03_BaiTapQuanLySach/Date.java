public class Date {
    
    private int Day;
    private int Month;
    private int Year;

    public Date(int day, int month, int year){
        if (day < 1 || day > 31){
            day = 1;
        }
        if (month < 1 || month > 12){
            month = 1;
        }
        if (year < 1){
            year = 2000;
        }
        this.Day = day;
        this.Month = month;
        this.Year = year;
    }

    // set
    public void setDay(int day) {
        if (day > 0 && day < 32){
            this.Day = day;
        }
    }
    public void setMonth(int month) {
        if (month > 0 && month < 13){
            this.Month = month;
        }
    }
    public void setYear(int year) {
        if (year > 0){
            this.Year = year;
        }
    }

    // get
    public int getDay() {
        return this.Day;
    }
    public int getMonth() {
        return this.Month;
    }
    public int getYear() {
        return this.Year;
    }
    // toString
    @Override
    public String toString() {
        return this.Day + "/" + this.Month + "/" + this.Year;
    }

}
