package TennisStringingKiosk.Racket_Object_Dependencies.Stringing_Kiosk_Enums;

public enum TennisStringBrand {
    BABOLAT("Babolat"),
    WILSON("Wilson"),
    HEAD("Head"),
    YONEX("Yonex"),
    TECNIFIBRE("Tecnifibre"),
    LUXILON("Luxilon"),
    SOLINCO("Solinco"),
    PRINCE("Prince"),
    GAMMMA("Gamma"),
    TOURNA("Tourna"),
    TOROLINE("Toroline"),
    DEFAULT("Default");

    private final String description;

    TennisStringBrand(String description){
        this.description = description;
    }

    @Override
    public String toString(){
        return this.description;
    }
}
