class Employee {
    Double CalculatePay(double salary) {
        return (double) salary * 30;
    }

    Double CalculatePay(Double hourlyRate,Double hourlyWorked) {
        return (double) hourlyRate*hourlyWorked;
    }
}

public class PayRoll {
    public static void main(String[] args) {
        Employee employee = new Employee();
        double monthlySalary = employee.CalculatePay(1500.00);
        double hourlySalary = employee.CalculatePay(250.00, 8.5);

        System.out.println(monthlySalary);
        System.out.println(hourlySalary );
    }
}
