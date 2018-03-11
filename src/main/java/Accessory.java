public class Accessory extends Product {
    private final InstrumentType type;

    public Accessory(String description, double purchasePrice, double salePrice, InstrumentType type, int number) {
        super(description, purchasePrice, salePrice, number);
        this.type = type;
    }

    public InstrumentType getType() {
        return type;
    }
}
