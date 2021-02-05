public class ModularSynth extends Instrument implements IPlay {

    private int knob;
    private int switche;

    public ModularSynth(String material, String colour, String type, double cost, double sellingPrice, int knobs, int switches) {
        super(material, colour, type, cost, sellingPrice);
        this.knob = knob;
        this.switche = switche;
    }

    public String play() {
        return "keys from a piano, like a flute, an oboe - so ECLECTIC!!";
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
