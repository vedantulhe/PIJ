import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {
    // Simulating a database
    private List<Employee> employeeList;

    public EmployeeDatabase() {
        employeeList = new ArrayList<>();
    }

    public void registerEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
