public class ModularSynth extends Instrument {

    private int knob;
    private int switche;

    public ModularSynth(double cost, double sellingPrice, String colour, String type, int knob, int switche) {
        super(cost, sellingPrice, colour, type);
        this.knob = knob;
        this.switche = switche;
    }

    public String play() {
        return null;
    }

    public int getKnob() {
        return knob;
    }

    public void setKnob(int knob) {
        this.knob = knob;
    }

    public int getSwitche() {
        return switche;
    }

    public void setSwitche(int switche) {
        this.switche = switche;
    }

}
