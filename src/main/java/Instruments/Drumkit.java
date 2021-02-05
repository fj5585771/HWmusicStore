package Instruments;

public class Drumkit extends Instrument {

    private int drums;
    private int pedals;

    public Drumkit(String material, String colour, String type, double cost, double sellingPrice, int drums, int pedals) {
        super(material, colour, type, cost, sellingPrice);
        this.drums = drums;
        this.pedals = pedals;
    }



}
