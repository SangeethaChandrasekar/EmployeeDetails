import java.util.*;
class Employee {
    String employeeName;
    int employeeId;
    int employeeAge;
    String employeeGender;
    String employeeDepartment;
    int employeeYearOfJoining;
    double employeeSalary;
    public Employee(int employeeId, String employeeName, int employeeAge,
                    String employeeGender,
                    String employeeDepartment,
                    int employeeYearOfJoining,
                    double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeGender = employeeGender;
        this.employeeDepartment = employeeDepartment;
        this.employeeYearOfJoining = employeeYearOfJoining;
        this.employeeSalary = employeeSalary;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public int getEmployeeYearOfJoining() {
        return employeeYearOfJoining;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        Employee emp1 = new Employee(59, "Sidharth", 21, "Male", "HR", 2015, 24000.0);
        Employee emp2 = new Employee(101, "Rohit", 21, "Male", "Sales", 2018, 25000.0);
        Employee emp3 = new Employee(85, "Gowthami", 21, "Female", "Marketing", 2020, 28700.0);
        Employee emp4 = new Employee(75, "Sangeetha", 21, "Female", "Finance", 2019, 25540.0);
        Employee emp5 = new Employee(105, "Arbaaz", 21, "Male", "Delivery", 2021, 22500.0);
        Employee emp6 = new Employee(95, "Roger", 21, "Male", "HR", 2021, 27300.0);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        System.out.println("Employee Details:");
        for (Employee emp : employeeList){
            emp.display();
            System.out.println();
        }
        System.out.println("Sorted Employee List");
        employeeList.stream().map(Employee::getEmployeeName)
                .sorted()
                .forEach(System.out::println);
        for(Employee emp : employeeList){
            emp.searchEmployeeName("Arbaaz");}
    }
    private void searchEmployeeName(String getName){
        if(getName.matches(employeeName)){
            System.out.println("Searched Employee : "+getName+" is  found");
            display();
        }
    }
    private void display(){
        System.out.println("ID:"+employeeId);
        System.out.println("Name:"+employeeName);
        System.out.println("Age:"+employeeAge);
        System.out.println("Gender:"+employeeGender);
        System.out.println("Department:"+employeeDepartment);
        System.out.println("Salary:"+employeeSalary);
    }
}
