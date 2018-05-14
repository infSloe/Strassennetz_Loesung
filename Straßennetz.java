
/**
 *   Test des Graphen!
 */
public class Straßennetz
{

    private Graph g;
    public Straßennetz()
    {
        // Graph erzeugen
        g = new Graph(9);
        // Knoten in den Graphen einfuegen
        orteEinfuegen();
        // kanten in den Graphen einfuegen
        straßenEinfuegen();

    }

    private void orteEinfuegen()
    {
        // in den Graphen einfuegen
        g.knotenEinfuegen("R");
        g.knotenEinfuegen("IN");
        g.knotenEinfuegen("FS");
        g.knotenEinfuegen("M");
        g.knotenEinfuegen("LA");
        g.knotenEinfuegen("DGF");
        g.knotenEinfuegen("DEG");
        g.knotenEinfuegen("PA");
        g.knotenEinfuegen("AÖ");
    }

    private void straßenEinfuegen()
    {
        g.ungerichteteKanteEinfuegen("IN","FS",60);
        g.ungerichteteKanteEinfuegen("FS","M",40);
        g.ungerichteteKanteEinfuegen("FS","R",100);
        g.ungerichteteKanteEinfuegen("FS","LA",40);
        g.ungerichteteKanteEinfuegen("LA","DGF",30);
        g.ungerichteteKanteEinfuegen("DGF","DEG",45);
        g.ungerichteteKanteEinfuegen("R","DEG",75);
        g.ungerichteteKanteEinfuegen("DEG","PA",55);
        g.ungerichteteKanteEinfuegen("AÖ","PA",80);
        g.ungerichteteKanteEinfuegen("M","AÖ",95);
        g.ungerichteteKanteEinfuegen("LA", "AÖ",65);

    }

    public void orteAusgeben()
    {
        System.out.println("--------------");
        System.out.println("Alle Orte");
          System.out.println("--------------");
        g.knotenlisteAusgeben();
        
    }

    public void straßenAusgeben()
    {
        System.out.println("--------------");
        System.out.println("Alle Straßen");
        System.out.println("--------------");
        g.kantenAusgeben();
        
    }

    public void nachbarnAusgeben(String ort)
    {
        System.out.println("--------------");
        System.out.println("Alle Nachbarn von " + ort);
        System.out.println("--------------");
        g.nachbarnAusgeben(ort);

    }

    public void reise(String ort)
    {
        System.out.println("--------------");
        System.out.println("Reise zu allen Orten");
        System.out.println("--------------");
        g.tiefensuche(ort);
    }

}
