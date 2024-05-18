package Database;

public class order extends ImplementId {
    private int id;
    private String customer;
    private Dealer dealer;
    private double price;
    public order(String customer, Dealer dealer, double price){
        id = super.newId();
        this.customer = customer;
        this.dealer = dealer;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public String getCustomer() {
        return customer;
    }

    public Dealer getSandwich() {
        return dealer;
    }

    public double getPrice() {
        return price;
    }

    private class Dealer {
    }
}
