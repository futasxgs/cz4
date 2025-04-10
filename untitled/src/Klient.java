import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji;

    // Konstruktor 1: pełne dane
    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.listaRezerwacji = new ArrayList<>();
    }

    // Konstruktor 2: tylko imię i nazwisko
    public Klient(String imie, String nazwisko) {
        this(imie, nazwisko, "brak@email.com");
    }

    // Gettery i settery
    public String getImie() { return imie; }
    public void setImie(String imie) { this.imie = imie; }

    public String getNazwisko() { return nazwisko; }
    public void setNazwisko(String nazwisko) { this.nazwisko = nazwisko; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public ArrayList<Wydarzenie> getListaRezerwacji() {
        return listaRezerwacji;
    }

    // Dodaj rezerwację
    public void dodajRezerwacje(Wydarzenie wydarzenie) {
        listaRezerwacji.add(wydarzenie);
    }

    // Anuluj rezerwację
    public void anulujRezerwacje(Wydarzenie wydarzenie) {
        listaRezerwacji.remove(wydarzenie);
    }

    // Wyświetl wszystkie rezerwacje
    public void wyswietlRezerwacje() {
        if (listaRezerwacji.isEmpty()) {
            System.out.println("Brak rezerwacji.");
        } else {
            for (Wydarzenie w : listaRezerwacji) {
                System.out.println(w);
            }
        }
    }
}
