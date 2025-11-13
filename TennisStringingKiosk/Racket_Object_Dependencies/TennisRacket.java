package TennisStringingKiosk.Racket_Object_Dependencies;

import java.time.LocalDate;

import TennisStringingKiosk.Racket_Object_Dependencies.Stringing_Kiosk_Enums.TennisRacketBrand;
import TennisStringingKiosk.Racket_Object_Dependencies.Stringing_Kiosk_Enums.TennisStringBrand;

/**
 * The tennis racket class is used to represent a tennis racket object and to 
 * hold all relevant information that would be required by a stringer or user 
 * regarding the tennis racket. A Tennis racket has atributes of the following 
 * denotion.
 * 
 * Racket brand
 * Main string tension
 * Cross string tension
 * Type of tennis string for the Mains
 * Type of tennis string for the Crosses
 * Last date strung
 * 
 * @author Jake Gertz
 * @date 11/11/2025
 * @version 1.0
 */
public class TennisRacket {
    private TennisRacketBrand racketBrand;
    private int mainTension;
    private int crossTension;
    private TennisString mainString;
    private TennisString crossString;
    private LocalDate lastStrung;

    /**
        Finals included in class:

            DEFAULT_TENSION, DEFAULT_STRING, DEFAULT_BRAND

            Default tension represents the default tension you want to assign to a
                racket if there is no provided tension value.

            Default string represents the default string you want to assign to a 
                racket if a prefered string is not specified.

            Default brand represents the default tennis racket brand you want to
                assign to a racket if no brand is specified.
     */
    private static final int DEFAULT_TENSION = 54;
    private static final TennisString DEFAULT_STRING = new TennisString(TennisStringBrand.DEFAULT, "DEFAULT");
    private static final TennisRacketBrand DEFAULT_BRAND = TennisRacketBrand.DEFAULT;

    /**
     * This constructor allows the creation of a tennis racket object.
     * 
     * @param racketBrand brand of racket to assign to this object
     * @param mainString brand of string wanted for this rackets main strings
     * @param crossString brand of string wanted for this rackets cross strings
     * @param mainTension tension prefered for this rackets main strings
     * @param crossTension tension prefered for this rackets cross strings
     */
    public TennisRacket(TennisRacketBrand racketBrand, TennisString mainString, TennisString crossString, int mainTension, int crossTension) {
        this.racketBrand = racketBrand;
        this.mainString = mainString;
        this.crossString = crossString;
        this.mainTension = mainTension;
        this.crossTension = crossTension;
    }

    /**
     * This overloaded consructor allows the creation of a racket object without a
     * specified brand.
     * 
     * @param mainString brand of string wanted for this rackets main strings
     * @param crossString brand of string wanted for this rackets cross strings
     * @param mainTension tension prefered for this rackets main strings
     * @param crossTension tension prefered for this rackets cross strings
     */
    public TennisRacket(TennisString mainString, TennisString crossString, int mainTension, int crossTension) {
        this(DEFAULT_BRAND, mainString, crossString, mainTension, crossTension);
    }

    /**
     * This overloaded constructor allows the creation of a racket object with just 
     * a single provided tension and string argument.
     * 
     * @param tension Tension for mains crosses 
     * @param string Tennis strings for mains and crosses 
     */
    public TennisRacket(int tension, TennisString string) {
        this(string, string, tension, tension);
    }

    /**
     * Allows for the creation of a tennis racket object with all default options.
     */
    public TennisRacket() {
        this(DEFAULT_BRAND, DEFAULT_STRING, DEFAULT_STRING, DEFAULT_TENSION, DEFAULT_TENSION);
    }

    /**
     * A getter that returns the TennisRacketBrand object the racket holds
     * 
     * @return this rackets TennisRacketBrand
     */
    public TennisRacketBrand getRacketBrand() {
        return racketBrand;
    }

    public String racketBrandToString() {
        return racketBrand.toString();
    }

    public TennisString getMainString() {
        return mainString;
    }

    public TennisString getCrossString() {
        return crossString;
    }

    public String tennisStringsToString() {
        return ("Main String:    " + mainString.toString() + "\n\nCross String:    " + crossString.toString());
    }

     public int getMainTension() {
        return mainTension;
    }

    public int getCrossTension() {
        return crossTension;
    }

    public String tensionsToString() {
        return ("Main Tension:    " + mainTension + "\nCross Tension:    " + crossTension);
    }

    public String stringsToString() {
        StringBuilder retString = new StringBuilder();
        retString.append("Main String:    " + mainString.toString());
        retString.append("    Tension:    " + mainTension + " \n");
        retString.append("Cross String:    " + crossString.toString());
        retString.append("    Tension:    " + crossTension);

        return retString.toString();
    }

    public LocalDate getLastStrung() {
        return lastStrung;
    }

    public String lastStrungToString() {
        return lastStrung.toString();
    }

    public void setRacketBrand(TennisRacketBrand racketBrand){
        this.racketBrand = racketBrand;
    }

    public void setMainString(TennisString mainString) {
        this.mainString = mainString;
    }

    public void setCrossString(TennisString crossString) {
        this.crossString = crossString;
    }

    public void setRacketStrings(TennisString strings) {
        setMainString(strings);
        setCrossString(strings);
    }

    public void setMainTension(int mainTension) {
        this.mainTension = mainTension;
    }

    public void setCrossTension(int crossTension) {
        this.crossTension = crossTension;
    }

    public void setRacketTension(int tensions) {
        setMainTension(tensions);
        setCrossTension(tensions);
    }

    public void setLastStrungDate(LocalDate date) {
        lastStrung = date;
    }

    public void setLastStrung() {
        lastStrung = LocalDate.now();
    }

    @Override
    public String toString() {
        StringBuilder retString = new StringBuilder();
        retString.append("Racket Brand:    " + racketBrandToString() + "\n\n");
        retString.append(stringsToString() + " \n\n");
        if(lastStrung != null) {
            retString.append("Last Strung:    " + lastStrung.toString());
        } else {
            retString.append("Last Strung:    NO PRIOR DATA");
        }

        return retString.toString();
    }

}
