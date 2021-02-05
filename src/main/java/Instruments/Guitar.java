package Instruments;

public class Guitar extends Instrument {

    private int strings;

    public Guitar(String material, String colour, String type, double cost, double sellingPrice, int strings) {
        super(material, colour, type, cost, sellingPrice);
        this.strings = strings;
    }
}
