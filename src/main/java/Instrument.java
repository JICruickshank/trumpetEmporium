public abstract class Instrument {

    private InstrumentType type;
    private String colour;
    private String material;

    public Instrument(InstrumentType type, String colour, String material) {
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
