package TennisStringingKiosk.Racket_Object_Dependencies;

import java.time.LocalDate;

import TennisStringingKiosk.Racket_Object_Dependencies.Stringing_Kiosk_Enums.TennisRacketBrand;
import TennisStringingKiosk.Racket_Object_Dependencies.Stringing_Kiosk_Enums.TennisStringBrand;

public class TennisRacket {
    private TennisRacketBrand racketBrand;
    private int mainTension;
    private int crossTension;
    private TennisString mainString;
    private TennisString crossString;
    private LocalDate lastStrung;

    private static final int DEFAULT_TENSION = 54;
    private static final TennisString DEFAULT_STRING = new TennisString(TennisStringBrand.DEFAULT, "DEFAULT");
    private static final TennisRacketBrand DEFAULT_BRAND = TennisRacketBrand.DEFAULT;

    public TennisRacket(TennisRacketBrand racketBrand, TennisString mainString, TennisString crossString, int mainTension, int crossTension) {
        this.racketBrand = racketBrand;
        this.mainString = mainString;
        this.crossString = crossString;
        this.mainTension = mainTension;
        this.crossTension = crossTension;
    }

    public TennisRacket(TennisString mainString, TennisString crossString, int mainTension, int crossTension) {
        this(DEFAULT_BRAND, mainString, crossString, mainTension, crossTension);
    }

    public TennisRacket(int tension, TennisString string) {
        this(string, string, tension, tension);
    }

    public TennisRacket() {
        this(DEFAULT_BRAND, DEFAULT_STRING, DEFAULT_STRING, DEFAULT_TENSION, DEFAULT_TENSION);
    }

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
