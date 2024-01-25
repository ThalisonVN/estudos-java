package entities;

public class Funcionario {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double n) {
        grossSalary += (grossSalary/100 * n);
    }
}
