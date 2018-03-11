public class Guitar extends Instrument {
    private int strings;

    public Guitar(String description, double purchasePrice, double salePrice, InstrumentType type, String colour, String material, int strings, int number) {
        super(description, purchasePrice, salePrice, type, colour, material, number);
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

