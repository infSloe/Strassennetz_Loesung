
public class Main
{
    public static void main()
    {
        Straßennetz s = new Straßennetz();
        
        // Gib alle Orte des Straßennetz aus
        s.orteAusgeben();
        System.out.println();
        
        // Gib alle Straßen aus
        s.straßenAusgeben();
        System.out.println();
        
        // Gib die Nachbarn aus
        s.nachbarnAusgeben("M");
        
        // Besuche alle Knoten
        s.reise("M");
    }
}
