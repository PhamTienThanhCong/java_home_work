import java.sql.*;

public class updateExam {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement ps = conn.createStatement();
        ) {

            // Increase the price by 9% and qty by 1 for id=1002
            String strUpdate = "UPDATE books SET price = price*1.09, qty = qty+2 where id = 1002";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = ps.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");

            String strSelect = "SELECT * FROM books WHERE id = 1002";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = ps.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getInt("id") + ", "
                        + rset.getString("author") + ", "
                        + rset.getString("title") + ", "
                        + rset.getDouble("price") + ", "
                        + rset.getInt("qty"));
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}