public class Drumkit extends Instrument {

    private int drums;
    private int pedals;

    public Drumkit(double cost, double sellingPrice, String colour, String type, int drums, int pedals) {
        super(cost, sellingPrice, colour, type);
        this.drums = drums;
        this.pedals = pedals;
    }

    public String play() {
        return "SMACK, BANG, CRASH!!";
    }

    public int getDrums(){
        return this.drums;
    }

    public int getPedals(){
        return this.pedals;
    }


}
