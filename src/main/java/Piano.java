public class Piano extends Instrument {

    private int pedals;
    private int keys;

    public Piano(double cost, double sellingPrice, String colour, String type, int pedals, int keys) {
        super(cost, sellingPrice, colour, type);
        this.pedals = pedals;
        this.keys = keys;
    }

    public String play() {
        return "Ding!!";
    }

    public int getPedals() {
        return pedals;
    }

    public void setPedals(int pedals) {
        this.pedals = pedals;
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }
}
