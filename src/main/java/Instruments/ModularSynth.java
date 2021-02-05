package Instruments;

public class ModularSynth extends Instrument{

    private int knobs;
    private int switches;

    public ModularSynth(String material, String colour, String type, double cost, double sellingPrice, int knobs, int switches) {
        super(material, colour, type, cost, sellingPrice);
        this.knobs = knobs;
        this.switches = switches;
    }




}
