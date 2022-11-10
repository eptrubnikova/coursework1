import java.util.Arrays;

public class Employee {
    private final String fullName;
    private double wage;
    private int numberDepartament;
    private static int idCount;
    public int id;


    public Employee(String fullName, double wage, int numberDepartament) {
        idCount++;
        id = idCount;
        this.fullName = fullName;
        this.wage = wage;
        this.numberDepartament = numberDepartament;
    }


    public String getFullName() {
        return this.fullName;
    }

    public double getWage() {
        return this.wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getNumberDepartament() {
        return numberDepartament;
    }

    public void setNumberDepartament(int numberDepartament) {
        this.numberDepartament = numberDepartament;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + ". " + "ФИО сотрудника: " + fullName + " Заработная плата сотрудника = "  + wage +
                " Отдел №" + numberDepartament;
    }


}
