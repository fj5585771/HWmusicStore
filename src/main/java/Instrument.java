public abstract class Instrument extends ItemsForSale implements IPlay {

    private String colour;
    private String type;

    public Instrument(double cost, double sellingPrice, String colour, String type) {
        super(cost, sellingPrice);
        this.colour = colour;
        this.type = type;
    }

    public String play(){
        return "Instrument making noise";
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

}
