public abstract class Miscellaneous extends ItemsForSale {

    private String description;

    public Miscellaneous(double cost, double sellingPrice, String description) {
        super(cost, sellingPrice);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
