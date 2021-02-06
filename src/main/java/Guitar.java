public class Guitar extends Instrument {

    private int stringAmount;

    public Guitar(double cost, double sellingPrice, String colour, String type, int stringAmount) {
        super(cost, sellingPrice, colour, type);
        this.stringAmount = stringAmount;
    }

    public String play() {
        return null;
    }

    public int getStringAmount() {
        return stringAmount;
    }

    public void setStringAmount(int stringAmount) {
        this.stringAmount = stringAmount;
    }


}
