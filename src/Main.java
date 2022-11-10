
public class Main {

    private static Employee[] employees = new Employee[10];

    public static void printListEmployees() {
        for (Employee employee : Main.employees) {
            System.out.println(employee);
        }
    }

    public static double findSumWage() {
        double sum = 0;
        for (Employee employee : Main.employees) {
            if (employee != null) {
                sum = sum + employee.getWage();
            }
        }
        return sum;
    }

    public static void findMinWage() {
        String salaryEmployee = null;
        double minWage = employees[0].getWage();
        for (Employee employee : Main.employees) {
            if (employee != null && employee.getWage() < minWage) {
                minWage = employee.getWage();
                salaryEmployee = employee.getFullName();
            }
        }
        System.out.println("Минимальная заработная плата у сотрудника " + salaryEmployee + " = " + minWage);
    }

    public static void findMaxWage() {
        String salaryEmployee = null;
        double maxWage = employees[0].getWage();
        for (Employee employee : Main.employees) {
            if (employee != null && employee.getWage() > maxWage) {
                maxWage = employee.getWage();
                salaryEmployee = employee.getFullName();
            }
        }
        System.out.println("Максимальная заработная плата у сотрудника " + salaryEmployee + " = " + maxWage);
    }

    public static void findAverageSalary() {
        double sum = findSumWage();
        double averageSalary;
        int amountEmployees = employees.length;
        for (Employee employee : Main.employees) {
            if (employee == null) {
                amountEmployees--;
            }
        }
        averageSalary = sum / amountEmployees;
        System.out.println("Среднее значение заработных плат = " + averageSalary);
    }

    public static void printListFullName() {
        for (Employee employee : Main.employees) {
            if (employee != null) {
                System.out.println(employee.getId() + ". " + employee.getFullName());
            }
        }
    }

    public static void indent() {
        System.out.println("***");
    }

    public static void indexWage(double x) {
        for (Employee employee : Main.employees) {
            if (employee != null) {
                employee.setWage(employee.getWage() + employee.getWage() * x);
                System.out.println("Новая заработная плата сотрудника " + employee.getFullName() + " = " + employee.getWage());
            }
        }
    }

    public static void findMinWageDepartment(int y) {
        double minWageDepartment = employees[0].getWage();
        for (Employee employee : Main.employees) {
            if (employee != null && employee.getNumberDepartament() == y && employee.getWage() < minWageDepartment) {
                minWageDepartment = employee.getWage();
                System.out.println("В отделе № " + y + " минимальная зарплата у сотрудника " + employee.getFullName() +
                        " = " + minWageDepartment);
            }
        }
    }

    public static void fimdMaxWageDepartment(int y) {
        double maxgeDepartment = employees[0].getWage();
        for (Employee employee : Main.employees) {
            if (employee != null && employee.getNumberDepartament() == y && employee.getWage() > maxgeDepartment) {
                maxgeDepartment = employee.getWage();
                System.out.println("В отделе № " + y + " максимальная зарплата у сотрудника " + employee.getFullName() +
                        " = " + maxgeDepartment);
            }
        }
    }

    public static void findSumWageDepartament(int y) {
        double sum = 0;
        for (Employee employee : Main.employees) {
            if (employee != null && employee.getNumberDepartament() == y) {
                sum = sum + employee.getWage();
            }
        }
        System.out.println("В отделе № " + y + " cумма затрат на выплату заработной платы сотрудникам = " + sum);
    }

    public static void findAverageSalaryDepartament(int y) {
        double sum = 0;
        double averageSalary = 0;
        int amountEmployees = 0;
        for (Employee employee : Main.employees) {
            if (employee != null && employee.getNumberDepartament() == y) {
                sum += employee.getWage();
                amountEmployees++;
            }
            averageSalary = sum / amountEmployees;
        }
        System.out.println("В отделе №" + y + " среднее значение заработных плат = " + averageSalary);
    }

    public static void indexWageDeparttament(double x, int y) {
        System.out.println("В отделе №" + y + " после индексации заработная плата у сотрудников составляет: ");
        for (Employee employee : Main.employees) {
            if (employee != null && employee.getNumberDepartament() == y) {
                employee.setWage(employee.getWage() + employee.getWage() * x);
                System.out.println(employee.getFullName() + " = " + employee.getWage());
            }
        }
    }

    public static void printListEmployeesDepartament(int y) {
        System.out.println("Список сотрудников отдела №" + y + ":");
        for (Employee employee : Main.employees) {
            if (employee != null && employee.getNumberDepartament() == y) {
                System.out.println(employee.getFullName() + ", " + employee.getWage());
            }
        }
    }

    public static void findWageLessData(double i) {
        for (Employee employee : Main.employees) {
            if (employee != null && employee.getWage() < i) {
                System.out.println("Заработная плата у сотрудника " + employee.getFullName() +
                        " (" + employee.getWage() + ") меньше " + i + " рублей");
            }
        }
    }

    public static void findWageMoreData(double i) {
        for (Employee employee : Main.employees) {
            if (employee != null && employee.getWage() > i) {
                System.out.println("Заработная плата у сотрудника " + employee.getFullName() +
                        " (" + employee.getWage() + ") больше " + i + " рублей");
            }
        }
    }

    public static void main(String[] args) {
        employees = new Employee[]{
                employees[0] = new Employee("Иванов Иван Иванович", 50000, 1),
                null,
                employees[2] = new Employee("Семенов Семен Семенович", 40000, 1),
                null,
                employees[4] = new Employee("Сергеев Сергей Сергеевич", 12250.20, 2),
                employees[5] = new Employee("Владимиров Владимир Владимирович", 60000, 3),
                employees[6] = new Employee("Петров Петр Петрович", 25000, 3),
                null,
                employees[8] = new Employee("Егоров Егор Егорович", 75000, 4),
                employees[9] = new Employee("Анатольев Анатолий Анатольевич", 45150.70, 4),
        };
        printListEmployees();
        indent();
        System.out.println("Сумма затрат на выплату заработной платы сотрудникам = " + findSumWage());
        indent();
        findMinWage();
        indent();
        findMaxWage();
        indent();
        findAverageSalary();
        indent();
        printListFullName();
        indent();
        double x = 0.5;
        indexWage(x);
        indent();
        int y = 3;
        findMinWageDepartment(y);
        indent();
        fimdMaxWageDepartment(y);
        indent();
        findSumWageDepartament(y);
        indent();
        findAverageSalaryDepartament(y);
        indent();
        indexWageDeparttament(x, y);
        indent();
        printListEmployeesDepartament(y);
        indent();
        double i = 50_000.0;
        findWageLessData(i);
        indent();
        findWageMoreData(i);
    }
}

