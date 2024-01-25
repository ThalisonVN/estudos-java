package entities;

public class Empregado {
    private String nome;
    private Integer id;
    private Double salario;

    public Empregado(String nome, Integer id, Double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void increaseSalary(Double x) {
        this.salario += salario * x / 100;
    }

    public void showEmpregado() {
        System.out.printf("%d, %s, %.2f\n", getId(), getNome(), getSalario());
    }
}
