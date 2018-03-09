public abstract class Instrument extends Product implements IPlay {

    private InstrumentType type;
    private String colour;
    private String material;

    public Instrument(String description, double purchasePrice, double salePrice, InstrumentType type, String colour, String material) {
        super(description, purchasePrice, salePrice);
        this.type = type;
        this.colour = colour;
        this.material = material;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }
}
