public class Accessory extends Product {
    private final InstrumentType type;

    public Accessory(String description, double purchasePrice, double salePrice, InstrumentType type) {
        super(description, purchasePrice, salePrice);
        this.type = type;
    }

    public InstrumentType getType() {
        return type;
    }
}
