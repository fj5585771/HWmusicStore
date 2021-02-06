public abstract class ItemsForSale implements IExchange {

  private double cost;
  private double sellingPrice;

    public ItemsForSale(double cost, double sellingPrice) {
        this.cost = cost;
        this.sellingPrice = sellingPrice;
    }

//    interface did not force me to implement method...
    public double calculateMarkUp() {
        return 0;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
