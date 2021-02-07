public class ItemsForSale implements IExchange {

  private double cost;
  private double sellingPrice;

    public ItemsForSale(double cost, double sellingPrice) {
        this.cost = cost;
        this.sellingPrice = sellingPrice;
    }

    public double getCost() {
        return this.cost;
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

    //    interface did not force me to implement method...
    public double calculateMarkUp() {
        double markUp = (sellingPrice - cost) / cost * 100;
        return Math.round(markUp);
    }

    public double profitFromItemSold(){
        double totalProfit = sellingPrice - cost;
        return Math.round(totalProfit);
    }

}
