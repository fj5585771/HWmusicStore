package Instruments;

public class Guitar extends Instrument {

    private int string;

    public Guitar(String material, String colour, String type, double cost, double sellingPrice, int strings) {
        super(material, colour, type, cost, sellingPrice);
        this.string = string;
    }

    public String play() {
        return "SOLO!!";
    }
}
