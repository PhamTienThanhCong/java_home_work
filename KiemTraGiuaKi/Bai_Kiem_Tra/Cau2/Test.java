import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> Employees = new ArrayList<Employee>();
        Employees.add(new Employee("huyen", 12, 2.99, 100000.0));
        Employees.add(new Employee("mien", 13, 3.0, 100000.0));
        Employees.add(new Employee("cong", 14, 3.99, 100000.0));
        Employees.add(new Employee("thuc", 15, 3.1, 100000.0));
        Employees.add(new Employee("dinh", 16, 3.2, 100000.0));
        
        for (int i = 0; i < Employees.size(); i++) {
            System.out.println("\n- Nhan Vien Ma: "+ Employees.get(i).getEmployeeID());
            System.out.print("Ten: "+ Employees.get(i).getName());
            System.out.print(" - Luong: "+ Employees.get(i).Salary());
        }

    }
}
