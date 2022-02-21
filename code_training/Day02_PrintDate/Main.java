
public class Main {
    public static void main(String[] args) {
        myDate md = new myDate(32,-2,-2002);

        // Get
        System.out.println("check Error");
        System.out.println(md.getDay());
        System.out.println(md.getMonth());
        System.out.println(md.getYear());

        // Set
        System.out.println("new value: ");
        md.setDay(14);
        md.setMonth(4);
        md.setYear(2004);

        // toString
        System.out.println(md);

        // Equals
        System.out.println("check equals");
        myDate md2 = new myDate(14,04,2004);
        myDate md3 = new myDate(22,2,2002);

        System.out.println("md1 equals md2: "+md.equals(md2));
        System.out.println("md1 equals md3: "+md.equals(md3));
    }
}
