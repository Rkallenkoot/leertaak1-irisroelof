
/**
 *  class KantineMedewerker
 *
 * @author Roelof Kallenkoot
 * @author Iris Meijer
 * @version 08/12/2014
 */
public class KantineMedewerker extends Persoon implements KortingskaartHouder
{
    // Instantievariabelen
    private String medewerkersnummer;
    private boolean magAchterKassa;

    public KantineMedewerker()
    {
        super();
        setMedewerkersnummer("Onbekend");
        setMagAchterKassa(false);
    }

    /**
     * Constructor for objects of class KantineMedewerker
     * @param medewerkersnummer
     * @param magAchterKassa
     */
    public KantineMedewerker(String medewerkersnummer, boolean magAchterKassa,String bsn, String voornaam, String achternaam, char geslacht,
    int dag, int maand, int jaar)
    {
        super(bsn,voornaam,achternaam,geslacht,dag,maand,jaar);
        setMedewerkersnummer(medewerkersnummer);
        setMagAchterKassa(magAchterKassa);
    }

    /**
     * Retourneerd het medewerkersnummer
     * @return medewerkersnummer
     */
    public String getMedewerkersnummer()
    {
        return medewerkersnummer;
    }

    /**
     * Retourneerd of de Kantinemedewerker achter de kassa mag of niet
     * @return magAchterKassa
     */
    public boolean getMagAchterKassa()
    {
        return magAchterKassa;
    }

    /**
     * Setter voor het medewerkernummer
     * @param String Medewerkersnummer
     */
    public void setMedewerkersnummer(String medewerkersnummer)
    {
        this.medewerkersnummer = medewerkersnummer;
    }

    /**
     * Setter voor magAchterKassa
     * @param boolean MagAchterKassa
     */
    public void setMagAchterKassa(boolean magAchterKassa)
    {
        this.magAchterKassa = magAchterKassa;
    }

    /**
     * Drukt alle informatie van de kantinemedewerker af
     */
    public void drukAf()
    {
        System.out.println("#####");
        System.out.println("# Medewerkersnummer: " + getMedewerkersnummer());
        System.out.println("# Deze persoon mag achter kassa? : " + getMagAchterKassa());
        System.out.println("#####");
    }

    /**
     * Implementeerd de geefMaximum methode uit de Interface KortingskaartHouder
     * @return double Maximum korting 0
     */
    public double geefMaximum(){
        return 0;
    }
    
    /**
     * Implementeerd de heeftMaximum methode uit de Interface KortingskaartHouder
     * @return boolean false
     */
    public boolean heeftMaximum()
    {
        return false;
    }
    
    /**
     * Implementeerd de geefKortingsPercentage methode uit de Interface KortingskaartHouder
     * @return double kortingspercentage 0.35
     */
    public double geefKortingsPercentage(){
        return 0.35;
    }
    
    /**
     * toString voor KantineMedewerker
     * @return String KantineMedewerker als string
     */
    public String toString()
    {
        StringBuilder zin = new StringBuilder();
        zin.append(super.toString());
        zin.append("Medewekersnummer: ").append(getMedewerkersnummer()).append("\n");
        zin.append("Deze persoon mag achter de kassa: ").append(getMagAchterKassa()).append("\n");
               
        return zin.toString();
    }
}
