import java.util.ArrayList;

public class MusicStore {

    private ArrayList<IExchange> stock;

    public MusicStore() {
        this.stock = new ArrayList<IExchange>();
    }

    public ArrayList<IExchange> getStock() {
        return stock;
    }

    public void addToStock(IExchange item) {
        this.stock.add(item);
    }

    public void removeFromStock(IExchange item){
        this.stock.remove(item);
    }

    public double calculateTotalMarkUpValue() {
        double totalProfit = 0;
        for (IExchange item : stock){
            stock.toArray(totalProfit[stock.size()]);
        } return totalProfit;
    }
}
