public class Guitar extends Instrument implements IPlay {
    private int strings;

    public Guitar(String description, double purchasePrice, double salePrice, InstrumentType type, String colour, String material, int strings) {
        super(description, purchasePrice, salePrice, type, colour, material);
        this.strings = strings;
    }


    public int getNoOfStrings() {
        return strings;
    }

    @Override
    public String play() {
        return "Generic guitar noise";
    }
}

