package createProduct;

/**
 * Created by muhammadraza on 05/09/2015.
 */
public enum SelectColourOption {

    PLAIN_STOCK(0),
    COLOUR_1(1),
    COLOUR_2(2),
    COLOUR_3(3),
    COLOUR_4(4),
    FULL_COLOUR(5),;
    private final int index;

    SelectColourOption(int index) {

        this.index = index;
    }

    public int getIndex() {
        return index;
    }


}
