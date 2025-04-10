public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc;
    private int dostepneMiejsca;
    private double cena;

    // Konstruktor 1: nazwa, cena
    public Wydarzenie(String nazwa, double cena) {
        this(nazwa, cena, "brak", "brak");
    }

    // Konstruktor 2: nazwa, cena, data
    public Wydarzenie(String nazwa, double cena, String data) {
        this(nazwa, cena, data, "brak");
    }

    // Konstruktor 3: nazwa, cena, data, miejsce
    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;
        this.maxLiczbaMiejsc = 100;
        this.dostepneMiejsca = 100;
    }

    // Gettery i settery
    public String getNazwa() { return nazwa; }
    public void setNazwa(String nazwa) { this.nazwa = nazwa; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getMiejsce() { return miejsce; }
    public void setMiejsce(String miejsce) { this.miejsce = miejsce; }

    public int getMaxLiczbaMiejsc() { return maxLiczbaMiejsc; }
    public int getDostepneMiejsca() { return dostepneMiejsca; }

    public double getCena() { return cena; }
    public void setCena(double cena) { this.cena = cena; }

    // toString
    public String toString() {
        return "Wydarzenie: " + nazwa + ", Data: " + data + ", Miejsce: " + miejsce +
                ", Cena: " + cena + "zł, Dostępne miejsca: " + dostepneMiejsca;
    }

    // Rezerwacja miejsca
    public boolean zarezerwujMiejsce() {
        if (dostepneMiejsca > 0) {
            dostepneMiejsca--;
            return true;
        }
        return false;
    }
}
