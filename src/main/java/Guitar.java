public class Guitar extends Instrument {
    private int strings;

    public Guitar(InstrumentType type, String colour, String material, int strings) {
        super(type, colour, material);
        this.strings = strings;
    }

    public int getNoOfStrings() {
        return strings;
    }
}

