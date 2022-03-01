public class Author{
    private String name;
    private Date Birthday;
    public Author(String name, Date birthday){
        this.name = name;
        this.Birthday = birthday;
    }

    // get
    public String getName() {
        return this.name;
    }
    public Date getBirthday() {
        return this.Birthday;
    }

    // set
    public void setName(String name) {
        this.name = name;
    }
    
    public void setBirthday(Date birthday) {
        this.Birthday = birthday;
    }

    // toString
    @Override
    public String toString() {
        return "Name: " + this.name + ", Birthday: " + this.Birthday;
    }

}