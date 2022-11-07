
public class Main {

    private static Employee[] employees = new Employee[10];

    public static void listEmployees() {
        for (Employee employee : Main.employees) {
            System.out.println(employee);
        }
    }

    public static double sumWage() {
        double sum = 0;
        for (Employee employee : Main.employees) {
            sum = sum + employee.getWage();
        }
        System.out.println("Сумма затрат на выплату заработной платы сотрудникам = " + sum);
        return sum;
    }

    public static void findMinWage() {
        String salaryEmployee = employees[0].getFullName();
        double minWage = employees[0].getWage();
        for (Employee employee : Main.employees) {
            if (employee.getWage() < minWage) {
                minWage = employee.getWage();
                salaryEmployee = employee.getFullName();
            }
        }
        System.out.println("Минимальная заработная плата у сотрудника " + salaryEmployee + " = " + minWage);
    }

    public static void findMaxWage() {
        String salaryEmployee = employees[0].getFullName();
        double maxWage = employees[0].getWage();
        for (Employee employee : Main.employees) {
            if (employee.getWage() > maxWage) {
                maxWage = employee.getWage();
                salaryEmployee = employee.getFullName();
            }
        }
        System.out.println("Максимальная заработная плата у сотрудника " + salaryEmployee + " = " + maxWage);
    }

    public static double averageSalary() {
        double sum = 0;
        double averageSalary = 0;
        for (Employee employee : Main.employees) {
            sum = sum + employee.getWage();
        }
        averageSalary = sum/employees.length;
        System.out.println("Среднее значение заработных плат = " + averageSalary);
        return averageSalary;
    }

    public static void listFullName() {
        for (Employee employee : Main.employees) {
            System.out.println(employee.getId() + ". " + employee.getFullName());
        }
    }
    public static void indent() {
        System.out.println("***");
    }

    public static void main(String[] args) {
        employees = new Employee[]{
                employees[0] = new Employee("Иванов Иван Иванович", 50000, 1),
                employees[1] = new Employee("Сидоров Сидор Сидорович", 30000, 1),
                employees[2] = new Employee("Семенов Семен Семенович", 40000, 1),
                employees[3] = new Employee("Федоров Федор Федорович", 50000.50, 2),
                employees[4] = new Employee("Сергеев Сергей Сергеевич", 12250.20, 2),
                employees[5] = new Employee("Владимиров Владимир Владимирович", 60000, 3),
                employees[6] = new Employee("Петров Петр Петрович", 25000, 3),
                employees[7] = new Employee("Васильев Василий Васильевич", 35000, 3),
                employees[8] = new Employee("Егоров Егор Егорович", 75000, 4),
                employees[9] = new Employee("Анатольев Анатолий Анатольевич", 45150.70, 4),
        };
        listEmployees();
        indent();
        sumWage();
        indent();
        findMinWage();
        indent();
        findMaxWage();
        indent();
        averageSalary();
        indent();
        listFullName();
    }
}

