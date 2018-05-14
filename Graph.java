
/**
 * Graph.
 */

public class Graph
{
    //Attribute
    private Knoten[] knotenliste;
    private int[][] adjazenzmatrix;
    private int maxAnzahl;
    private int anzahl;

    //Konstruktor
    public Graph(int maxAnzahl)
    {
        this.maxAnzahl = maxAnzahl;
        anzahl = 0;
        knotenliste = new Knoten[maxAnzahl];
        adjazenzmatrix = new int[maxAnzahl][maxAnzahl];

        for (int i = 0; i < maxAnzahl; i++)
        {
            for (int j = 0; j < maxAnzahl; j++)
            {
                adjazenzmatrix[i][j] = -1;
            }
        }

    }

    //Methoden
    
    // Aufgabe 1: Schreibe Kommentare. Was wird hier gemacht?
    public void tiefensuche(String bez)
    {
        // Dein Kommentar
        int startNr = knotennummerGeben(bez); 
        // Dein Kommentar
        for (int i = 0; i < anzahl; i++)
        {
            knotenliste[i].markierungSetzen(false);
        }
        // Dein Kommentar
        tiefensucheKnoten(startNr);
    }
    
    // Aufgabe 2: Vervollständige die Methode tiefensucheKnoten!

    private void tiefensucheKnoten(int nummer)
    {
        // Knoten als besucht markieren
       
        // Information über Knote ausgeben

        // Bearbeitung der noch nicht besuchten Nachbarknoten
        for (int i = 0; i < anzahl; i++)
        {
            //
        }
        System.out.println("zurück");
    }

    
    /*
     * Erzeugt einen neuen Knoten mit dem übergebenen Inhalt und fügt ihn in die Knotenliste ein.
     */
    public void knotenEinfuegen(String inhalt)
    {
        if (anzahl < maxAnzahl)
        {
            knotenliste[anzahl] = new Knoten(inhalt);
            anzahl++;
        }
    }

    /*
     * Prüft ob der übergebene Inhalt in einem Knoten gespeichert ist und gibt dessen Nummer zurück.
     */
    public int knotennummerGeben(String inhalt)
    {
        for (int i = 0; i < anzahl; i++)
        {
            if (knotenliste[i].inhaltGeben().equals(inhalt))
            {
                return i;
            }
        }
        return -1;
    }         

    /*
     * Gibt den Hinhalt aller Knoten aus.
     */
    public void knotenlisteAusgeben()
    {
        for (int i = 0; i < anzahl; i++)
        {
            System.out.println(knotenliste[i].inhaltGeben());
        }
    }

    /*
     * Fügt eine Kante zwischen den Knoten mit den Inhalten bez1 und bez2 ein.
     */
    public void kanteEinfuegen(String bez1, String bez2, int wert)
    {
        int i = knotennummerGeben(bez1);
        int j = knotennummerGeben(bez2);
        if (j != -1 && i != -1) // Es gibt beide Knoten!
        {
            adjazenzmatrix[i][j] = wert;
        }
        else
        {
            System.out.println("Fehler! Einen Knoten gibt es nicht!");
        }
    }

    /*
     * Fügt eine ungerichtete Kante ein
     */
    public void ungerichteteKanteEinfuegen(String bez1, String bez2,int wert)
    {
        kanteEinfuegen(bez1,bez2,wert);
        kanteEinfuegen(bez2,bez1,wert);
    }

    /* 
     * Entfernt eine Kante zwischen zwei Knoten
     */
    public void kanteEntfernen(String bez1, String bez2)
    {
        int i = knotennummerGeben(bez1);
        int j = knotennummerGeben(bez2);
        if (j != -1 && i != -1) // Es gibt beide Knoten!
        {
            adjazenzmatrix[i][j] = -1;
        }
        else
        {
            System.out.println("Fehler! Einen Knoten gibt es nicht!");
        }
    }

    /*
     * Gibt die Adjazenzmatrix aus
     */
    public void adjazenzmatrixAusgeben()
    {
        for (int j = 0; j < anzahl; j++)
        {
            for (int i = 0; i < anzahl; i++)
            {         
                System.out.print(adjazenzmatrix[i][j]);
            }
        }
        System.out.println();
    }

    public void kantenAusgeben()
    {

        for (int i = 0; i < anzahl; i++)
        {
            for (int j = 0; j < anzahl; j++)
            {
                if (adjazenzmatrix[i][j]!= -1)
                {
                    System.out.println(knotenliste[i].inhaltGeben()+ " -> "+ knotenliste[j].inhaltGeben() + 
                    " (" + adjazenzmatrix[i][j] + " km)");
                }
            }
        }
    }

    public void nachbarnAusgeben(String bez)
    {
        int i = knotennummerGeben(bez);
        if (i == -1)
        {
            System.out.println("Fehler! Diesen Knoten gibt es nicht!");
        }
        else
        {
            for (int j = 0; j < anzahl; j++)
            {
                if (adjazenzmatrix[i][j]!= -1)
                {
                    System.out.println(knotenliste[j].inhaltGeben());                  
                }
            }
        }
    }

}
