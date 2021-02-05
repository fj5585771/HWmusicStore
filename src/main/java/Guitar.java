public class Guitar extends Instrument {

    private int stringAmount;

    public Guitar(String material, String colour, String type, double cost, double sellingPrice, int stringAmount) {
        super(material, colour, type, cost, sellingPrice);
        this.stringAmount = stringAmount;
    }

    public String play() {
        return "SOLO!!";
    }


    public double calculateMarkUp() {
        return 0;
    }
}
