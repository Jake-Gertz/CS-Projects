package TennisStringingKiosk.Racket_Object_Dependencies;

import TennisStringingKiosk.Racket_Object_Dependencies.Stringing_Kiosk_Enums.TennisStringBrand;

public class TennisString {
    private TennisStringBrand stringBrand;
    private String stringName;
    private Boolean inStock;
    private int lengthInStock;

    public TennisString(TennisStringBrand stringBrand, String stringName, Boolean inStock, int lengthInStock) {
        this.stringBrand = stringBrand;
        this.stringName = stringName;
        this.inStock = inStock;
        this.lengthInStock = lengthInStock;
    }

    public TennisString(TennisStringBrand stringBrand, String stringName) {
        this.stringBrand = stringBrand;
        this.stringName = stringName;
        this.inStock = false;
        this.lengthInStock = 0;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public int subtractLengthInStock(int lengthToSubtract) {
        return (lengthInStock -= lengthToSubtract);
    }

    public int addLengthInStock(int lengthToAdd) {
        lengthInStock += lengthToAdd;

        if(lengthInStock > 0) {
            inStock = true;
        }

        return (lengthInStock);
    }

    public boolean getInStock() {
        return inStock;
    }

    public int getLengthInStock() {
        return lengthInStock;
    }

    @Override
    public String toString() {
        return ("String Brand:    " + stringBrand.toString() + "\nString Name:    " + stringName);
    }

}
