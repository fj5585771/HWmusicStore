public abstract class Instrument extends ItemsForSale implements IPlay {

    private String colour;
    private String type;

    public Instrument(double cost, double sellingPrice, String colour, String type) {
        super(cost, sellingPrice);
        this.colour = colour;
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
