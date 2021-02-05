import actions.IExchange;

import java.util.ArrayList;

public abstract class MusicStore implements IExchange {

    private ArrayList<IExchange> stock;

    public MusicStore(ArrayList<IExchange> stock) {
        this.stock = stock;
    }

    public ArrayList<IExchange> getStock() {
        return stock;
    }

    public void setStock(ArrayList<IExchange> stock) {
        this.stock = stock;
    }
}
