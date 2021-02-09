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

    public double calculateProfitFromAllItemsSold(){
        double totalProfit = 0;
        for (IExchange stock : stock){
            totalProfit += stock.profitFromItemSold();
        } return totalProfit;
    }

    public double calculateTotalMarkUpValue() {
        double totalMarkUp = 0;
        for (IExchange stock : stock){
            totalMarkUp += stock.calculateMarkUp();
        } return totalMarkUp;
    }

}
