
/**
 *  class KantineMedewerker
 * 
 * @author Roelof Kallenkoot
 * @author Iris Meijer
 * @version 08/12/2014
 */
public class KantineMedewerker extends Persoon
{
    // Instantievariabelen
    private String medewerkersnummer;
    private boolean magAchterKassa;

    /**
     * Constructor for objects of class KantineMedewerker
     * @param medewerkersnummer
     * @param magAchterKassa
     */
    public KantineMedewerker(String medewerkersnummer, boolean magAchterKassa,String bsn, String voornaam, String achternaam, char geslacht,
    int dag, int maand, int jaar)
    {
        super(bsn,voornaam,achternaam,geslacht,dag,maand,jaar);
        this.medewerkersnummer = medewerkersnummer;
        this.magAchterKassa = magAchterKassa;
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
     * @param Medewerkersnummer
     */
    public void setMedewerkersnummer(String medewerkersnummer)
    {
        this.medewerkersnummer = medewerkersnummer;
    }
    
    /**
     * Setter voor magAchterKassa
     * @param MagAchterKassa
     */
    public void setMagAchterKassa(boolean magAchterKassa)
    {
        this.magAchterKassa = magAchterKassa;
    }
}
