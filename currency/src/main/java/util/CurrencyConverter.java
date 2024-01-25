package util;

public class CurrencyConverter {
    public double IOF = 0.06;
    public double dollarPrice;
    public double quantity;
    public double total() {
        return dollarPrice * quantity + (dollarPrice * quantity * IOF);
    }

}
