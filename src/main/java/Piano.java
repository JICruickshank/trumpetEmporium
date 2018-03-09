public class Piano extends Instrument {
    private final int weight;

    public Piano(String description, double purchasePrice, double salePrice, InstrumentType type, String colour, String material, int weight) {
        super(description, purchasePrice, salePrice, type, colour, material);
        this.weight = weight;
    }

    @Override
    public String play() {
        return null;
    }


    public int getWeight() {
        return weight;
    }
}