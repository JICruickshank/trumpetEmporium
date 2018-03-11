public class Piano extends Instrument {
    private final int weight;

    public Piano(String description, double purchasePrice, double salePrice, InstrumentType type, String colour, String material, int weight, int number) {
        super(description, purchasePrice, salePrice, type, colour, material, number);
        this.weight = weight;
    }

    @Override
    public String play() {
        return "This is what a piano sounds like";
    }


    public int getWeight() {
        return weight;
    }
}
