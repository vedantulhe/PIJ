import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EmployeeManagement extends Application {

    private TextField employeeIDField, nameField, ageField, emailField, departmentField;
    private TextArea employeeListTextArea;
    private Button createTableButton, registerEmployeeButton, viewEmployeeListButton, updateEmployeeButton;
    private EmployeeDatabase database;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Employee Management System");

        // Creating input fields
        Label employeeIDLabel = new Label("Employee ID:");
        employeeIDField = new TextField();

        Label nameLabel = new Label("Name:");
        nameField = new TextField();

        Label ageLabel = new Label("Age:");
        ageField = new TextField();

        Label emailLabel = new Label("Email:");
        emailField = new TextField();

        Label departmentLabel = new Label("Department:");
        departmentField = new TextField();

        // Creating buttons
        createTableButton = new Button("Create Employee Table");
        registerEmployeeButton = new Button("Register Employee");
        viewEmployeeListButton = new Button("View Employee List");
        updateEmployeeButton = new Button("Update Employee");

        // Text area for displaying employee list
        employeeListTextArea = new TextArea();
        employeeListTextArea.setEditable(false);

        // Layout
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.addRow(0, employeeIDLabel, employeeIDField);
        gridPane.addRow(1, nameLabel, nameField);
        gridPane.addRow(2, ageLabel, ageField);
        gridPane.addRow(3, emailLabel, emailField);
        gridPane.addRow(4, departmentLabel, departmentField);
        gridPane.addRow(5, createTableButton);
        gridPane.addRow(6, registerEmployeeButton, viewEmployeeListButton, updateEmployeeButton);
        gridPane.addRow(7, employeeListTextArea);

        // Event handlers
        createTableButton.setOnAction(e -> createEmployeeTable());
        registerEmployeeButton.setOnAction(e -> registerEmployee());
        viewEmployeeListButton.setOnAction(e -> viewEmployeeList());
        updateEmployeeButton.setOnAction(e -> updateEmployee());

        Scene scene = new Scene(gridPane, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Initialize the database
        database = new EmployeeDatabase();
    }

    // Method to create employee table
    private void createEmployeeTable() {
        // Implementation of creating employee table in database
        // You can add database operations here
        employeeListTextArea.appendText("Employee table created\n");
    }

    // Method to register employee
    private void registerEmployee() {
        // Get employee details from input fields
        String employeeID = employeeIDField.getText();
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        String email = emailField.getText();
        String department = departmentField.getText();

        // Register employee in the database
        Employee employee = new Employee(employeeID, name, age, email, department);
        database.registerEmployee(employee);
        employeeListTextArea.appendText("Employee registered: " + employee.toString() + "\n");
    }

    // Method to view list of registered employees
    private void viewEmployeeList() {
        employeeListTextArea.clear();
        employeeListTextArea.appendText("List of Registered Employees:\n");
        for (Employee employee : database.getEmployeeList()) {
            employeeListTextArea.appendText(employee.toString() + "\n");
        }
    }

    // Method to update employee information
    private void updateEmployee() {
        // Get employee ID from input field
        String employeeID = employeeIDField.getText();
        // You can implement updating employee information based on ID
        employeeListTextArea.appendText("Employee information updated for ID: " + employeeID + "\n");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
