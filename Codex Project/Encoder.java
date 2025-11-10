
public class Encoder {

    private String plainText;
    private String CypherText;
    
    public Encoder() {
        plainText = "";
        CypherText = "";
    }
    
    public Encoder(String plainText){
        this.plainText = plainText;
    }

    public void Cypher1(String plainText){
        StringBuilder sBuilder = new StringBuilder(plainText.length()*2);

        for(int i = 0; i < plainText.length()-2; i++){
            sBuilder.append(plainText.charAt(i) - 0);
            sBuilder.append(" ");
        }
        sBuilder.append(plainText.charAt(plainText.length()-1) - 0);
        CypherText = sBuilder.toString();
    }

    public void Cypher2(int textToCheck){
        String[] textsThatCanBeEnciphered = new String[]{"salad","london","football","twelve","quantia","micron","xavier","buster","fritz","philosophy"};
        System.out.println("plain Text: " + textsThatCanBeEnciphered[textToCheck]);
        System.out.println("Enciphered text: " + CeaserEnciphring(textsThatCanBeEnciphered[textToCheck]));
    }

    public String GetCypherText(){
        return CypherText;
    }

    private String CeaserEnciphring(String plainText){
        int[] ASCIIValues = new int[plainText.length()];
        StringBuilder ceaserStringBuilder = new StringBuilder(ASCIIValues.length);

        for(int i = 0; i < plainText.length(); i++){
            ASCIIValues[i] = ((((plainText.charAt(i) -97) + 4)%26)+97);
            ceaserStringBuilder.append((char)ASCIIValues[i]);
        }

        return ceaserStringBuilder.toString();
    }
}
