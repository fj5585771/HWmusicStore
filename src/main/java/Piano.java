public class Piano extends Instrument implements IPlay {

    private int pedals;
    private int keys;

    public Piano(String material, String colour, String type, double cost, double sellingPrice, int pedals, int keys) {
        super(material, colour, type, cost, sellingPrice);
        this.pedals = pedals;
        this.keys = keys;
    }


    public String play() {
        return "Ding!!";
    }

    public double buyItem() {
        return 0;
    }

    public double sellItem() {
        return 0;
    }

    public double calculateMarkUp() {
        return 0;
    }
}
