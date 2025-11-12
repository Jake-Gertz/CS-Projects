package TennisStringingKiosk;

import TennisStringingKiosk.Racket_Object_Dependencies.TennisRacket;
import java.util.LinkedList;

public class TennisPlayer {
    private String firstName;
    private String lastName;
    private int totalStrungRackets;
    private int userID;

    private LinkedList<TennisRacket> racketsToPickUp;
    private LinkedList<TennisRacket> racketsToString;

    private final static int DEFAULT_USER_ID = 0000;
    private final static int DEFAULT_STRUNG_RACKETS = 0;

    public TennisPlayer(String firstName, String lastName, int totalStrungRackets, int userID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalStrungRackets = totalStrungRackets;
        this.userID = userID;

        racketsToPickUp = new LinkedList<TennisRacket>();
        racketsToString = new LinkedList<TennisRacket>();
    }

    public TennisPlayer(String firstName, String lastName) {
        this(firstName, lastName, DEFAULT_USER_ID, DEFAULT_STRUNG_RACKETS);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPlayerName() {
        return (firstName + " " + lastName);
    }

    public int getTotalStrungRackets() {
        return totalStrungRackets;
    }

    public int getUserID() {
        return userID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPlayerName(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void setTotalStrungRackets(int totalStrungRackets) {
        this.totalStrungRackets = totalStrungRackets;
    }

    public void incementTotalStrungRackets() {
        totalStrungRackets++;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public LinkedList<TennisRacket> getRacketsToString() {
        LinkedList<TennisRacket> copyArray = new LinkedList<TennisRacket>();

        for (TennisRacket tr: racketsToString) {
            copyArray.addLast(tr);
        }

        return copyArray;
    }
    
    public String racketsToStringToString() {
        StringBuilder retString = new StringBuilder("Rackets to String:\n");

        for (TennisRacket tr: racketsToString) {
            retString.append(tr.toString() + "\n");
        }

        return retString.toString();
    }

    public LinkedList<TennisRacket> getRacketsToPickUp() {
        LinkedList<TennisRacket> copyArray = new LinkedList<TennisRacket>();

        for (TennisRacket tr: racketsToPickUp) {
            copyArray.addLast(tr);
        }

        return copyArray;
    }

    public String racketsToPickUpToString() {
        StringBuilder retString = new StringBuilder("Rackets to Pick Up:\n");

        for (TennisRacket tr: racketsToPickUp) {
            retString.append(tr.toString() + "\n");
        }

        return retString.toString();
    }

    /**
     * This method calls the to string on both racketsToPickUp and racketsToString
     * 
     * @return A string showing both rackets to string and rackets to pick up.
     */
    public String racketsToString() {
        StringBuilder retString = new StringBuilder(racketsToStringToString());
        retString.append("\n" + racketsToPickUpToString());

        return retString.toString();
    }

    public void addRacketToString(TennisRacket racket) {
        racketsToString.addLast(racket);
    }

    public void addRacketToPickUp(TennisRacket racket) {
        racketsToPickUp.addLast(racket);
    }

    public Boolean strungRacket(TennisRacket racket) {
        Boolean retBool = racketsToString.remove(racket);
        if (retBool) {
            addRacketToPickUp(racket);
        }

        return retBool;
    }

}