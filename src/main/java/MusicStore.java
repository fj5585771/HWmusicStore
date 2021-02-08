import java.util.ArrayList;

public class MusicStore implements IExchange {

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

    public double canCalculateTotalMarkUpValue() {
        double totalProfit = 0;
        for (IExchange stock : stock){
            totalProfit += stock.calculateMarkUp();
        } return totalProfit;
    }

}
