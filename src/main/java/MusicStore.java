import java.util.ArrayList;

public abstract class MusicStore implements IExchange {

    private ArrayList<IExchange> stock;
    private double markUp;

    public MusicStore(ArrayList<IExchange> stock) {
        this.stock = stock;
    }

    public double calculateMarkUp(){
        return this.markUp;
    }

    public ArrayList<IExchange> getStock() {
        return stock;
    }

    public void addToStock(ArrayList<IExchange> stock) {
//        this.stock.add();
    }

    public void removeFromStock(ArrayList<IExchange> stock){
        this.stock.clear();
    }

}
