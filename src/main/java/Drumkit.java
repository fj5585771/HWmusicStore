public class Drumkit extends Instrument {

    private int drum;
    private int pedal;

    public Drumkit(String material, String colour, String type, double cost, double sellingPrice, int drums, int pedals) {
        super(material, colour, type, cost, sellingPrice);
        this.drum = drum;
        this.pedal = pedal;
    }

    public String play() {
        return "SMACK, BANG, CRASH!!";
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