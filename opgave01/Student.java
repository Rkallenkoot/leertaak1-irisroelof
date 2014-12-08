
/**
 * class Student here
 *
 * @author Roelof Kallenkoot
 * @author Iris Meijer
 * @version 08/12/2014
 */
public class Student extends Persoon
{
    // instance variables - replace the example below with your own
    private String studentnummer;
    private String studierichting;

    /**
     * Constructor for objects of class Student
     * @param studentnummer Studentnummer
     * @param studierichting Studierichting
     * @param bsn Burgerservicenummer
     * @param voornaam Voornaam
     * @param achternaam Achternaam
     * @param geslacht Geslacht van de studenet
     * @param dag Dag van geboorte van de student
     * @param maand Maand van geboorte van de student
     * @param jaar Geboortejaar van de student
     */
    public Student(String studentnummer, String studierichting, String bsn, String voornaam,
    String achternaam, char geslacht, int dag, int maand, int jaar)
    {
        super(bsn,voornaam,achternaam,geslacht,dag,maand,jaar);
        this.studentnummer = studentnummer;
        this.studierichting = studierichting;
    }

    /**
     * Retourneerd het studentnummer
     * @return Studentnummer van de student
     */
    public String getStudentnummer()
    {
        return studentnummer;
    }

    /**
     * Retourneerd de studierichting van de student
     * @return Studierichting van de student
     */
    public String getStudierichting()
    {
        return studierichting;
    }

    /**
     * Setter voor studentnummer
     * @param Studentnummer
     */
    public void setStudentnummer(String studentnummer)
    {
        this.studentnummer = studentnummer;
    }

    /**
     * Setter voor studierichting
     * @param Studierichting
     */
    public void setStudierichting(String studierichting)
    {
        this.studierichting = studierichting;
    }

    /**
     * Deze methode drukt de instantie- en overgeerfde variabelen af.
     */
    public void drukAf()
    {
        System.out.println("#####");
        System.out.println("# BSN:\t\t\t" + getBsn());
        System.out.println("# Voornaam:\t\t" + getVoornaam());
        System.out.println("# Achternaam:\t\t" + getAchternaam());
        System.out.println("# Geslacht:\t\t" + getGeslacht());
        System.out.println("# Geboortedatum:\t" + getGeboortedatum());
        System.out.println("# Studentnummer:\t" + getStudentnummer());
        System.out.println("# Studierichting:\t" + getStudierichting());
        System.out.println("#####");
    }
}
