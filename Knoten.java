
/**
 * Knoten.
 */

public class Knoten
{
    //Attribute
    private String inhalt;
    private boolean markierung;

    //Konstruktor
    public Knoten(String inhalt)
    {
        this.inhalt = inhalt;        
    }

    //Methoden
    public String inhaltGeben()
    {
        return inhalt;
    }

    public void markierungSetzen(boolean wert)
    {
        markierung = wert;
    }

    public boolean markierungGeben()
    {
        return markierung;
    }
}
