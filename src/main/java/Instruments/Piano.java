package Instruments;

public class Piano extends Instrument {

    private int pedals;
    private int keys;

    public Piano(String material, String colour, String type, double cost, double sellingPrice, int pedals, int keys) {
        super(material, colour, type, cost, sellingPrice);
        this.pedals = pedals;
        this.keys = keys;
    }


}
