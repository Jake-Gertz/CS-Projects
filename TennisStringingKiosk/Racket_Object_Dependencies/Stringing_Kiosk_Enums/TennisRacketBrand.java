package TennisStringingKiosk.Racket_Object_Dependencies.Stringing_Kiosk_Enums;

public enum TennisRacketBrand {
    BABOLAT("Babolat"),
    WILSON("Wilson"),
    HEAD("Head"),
    YONEX("Yonex"),
    TECNIFIBRE("Tecnifibre"),
    PRINCE("Prince"),
    DUNLOP("Dunlop"),
    SOLINCO("Solinco"),
    DEFAULT("Default");

    private final String description;

    TennisRacketBrand(String description){
        this.description = description;
    }

    @Override
    public String toString(){
        return this.description;
    }
}
