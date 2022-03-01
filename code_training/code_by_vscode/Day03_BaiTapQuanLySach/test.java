public class test {
    public static void main(String[] args) {
        Date date1 = new Date(22,12,2002);
        Date date2 = new Date(22,12,2002);
        Date date3 = new Date(22,12,2002);

        Author author1 = new Author("Be Cong",date1);
        Author author2 = new Author("Thanh Cong",date2);
        Author author3 = new Author("Be Hanh",date3);
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);

        Book book1 = new Book("Toi da thep the do", 75000, 2001, author1);
        Book book2 = new Book("Ha vuong mau nang", 45000, 2001, author2);
        Book book3 = new Book("mua he do mau", 125000, 200, author3);

        System.out.println("Book1 vs Book2 check publishing: "+book2.CheckPublish(book1));
        System.out.println("Book1 vs Book3 check publishing: "+book1.CheckPublish(book3));

        System.out.println("Book1 giam gia 10%: "+book1.disCount(10)+" VND");
        System.out.println("Book2 giam gia 15%: "+book2.disCount(15)+" VND");
        System.out.println("Book3 giam gia 20%: "+book3.disCount(20)+" VND");
    }
}
