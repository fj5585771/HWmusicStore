public abstract class Instrument implements IExchange, IPlay {

    private String material;
    private String colour;
    private String type;
    private double cost;
    private double sellingPrice;

    public Instrument(String material, String colour, String type, double cost, double sellingPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.cost = cost;
        this.sellingPrice = sellingPrice;
    }



    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
