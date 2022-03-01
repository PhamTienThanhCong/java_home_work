public class Book {
    private String name;
    private float price;
    private int publishing;
    private Author author;

    public Book(String name, float price, int publishing ,Author author) {
        this.name = name;
        this.price = price;
        this.publishing = publishing;
        this.author = author;
    }

    // get 

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public int getPublishing() {
        return this.publishing;
    }

    public void setPublishing(int publishing) {
        if (publishing > 0) {
            this.publishing = publishing;
        }
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", price='" + getPrice() + "'" +
            ", publishing='" + getPublishing() + "'" +
            ", author='" + getAuthor() + "'" +
            "}";
    }
    
    // function

    // In ra màn hình tên của một quyển sách.
    public void PrintName(){
        System.out.println("name=" + getName());
    }

    // Cho biết quyển sách bất kỳ có được xuất bản cùng năm với một quyển sách nào đó hay không.
    public boolean CheckPublish(Book other){
        if (getPublishing() == other.getPublishing()){
            return true;
        }
        return false;
    }

    // Cho biết giá sách sau khi giảm giá x%, x được truyền vào như là một tham số.
    public float disCount(float x) {
        if (x < 0 || x > 100){
            x = 0;
        }
        return getPrice()*(100-x)/100;    
    }

}
