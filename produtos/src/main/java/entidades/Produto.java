package entidades;

public class Produto {
    private String name;
    private double price;
    private int quantity;

    //Construtor padrão
    public Produto(){}

    public Produto(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //sobrecarga
    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void updateQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    public void showProduct() {
        System.out.printf("\nProduct data: %s, $ %.2f, %d units, Total: $ %.2f\n", name, price, quantity, (quantity * price));
    }

    public void showUpdatedProduct() {
        System.out.printf("\nUpdate data: %s, $ %.2f, %d units, Total: $ %.2f\n", name, price, quantity, (quantity * price));
    }
}
