import java.sql.*;

public class deleteExam {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement ps = conn.createStatement();
        )
        {
            // DELETE records with id>=3000 and id<4000
            String sqlDelete = "DELETE FROM books WHERE id >= 3000 AND id < 4000";
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = ps.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");

            // INSERT a record
            String sqlInsert = "INSERT INTO books VALUES (3001, 'Gone Fishing', 'Kumar', 11.11, 11)";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = ps.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

            // INSERT multiple records
            sqlInsert = "INSERT INTO books VALUES "
                    + "(3002, 'Gone Fishing 2', 'Kumar', 22.22, 22),"
                    + "(3003, 'Gone Fishing 3', 'Kumar', 33.33, 33)";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            countInserted = ps.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

            // INSERT a partial record
            sqlInsert = "INSERT INTO books (id, title, author) VALUES (3004, 'Fishing 101', 'Kumar')";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            countInserted = ps.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");


            String strSelect = "SELECT * FROM books";
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