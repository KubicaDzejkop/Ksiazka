package pl.gornik.ksiazka;

public class Ksiazka {
    String tytul;
    String kategoria;
    int iloscStron;
    double cena;
    int iloscSztuk;
    public Ksiazka(String tytul, String kategoria, int iloscStron, double cena, int iloscSztuk) {
        this.tytul = tytul;
        this.kategoria = kategoria;
        this.iloscStron = iloscStron;
        this.cena = cena;
        this.iloscSztuk = iloscSztuk;
    }
        public String wyswietlKsiazke(){
            String napis;
            napis = tytul + " należy do " + kategoria +" i ma " + iloscStron + " stron";
            return napis;
        }
        public String obliczKwoteZaDanyTytul(){
            String napis1;
            double cenaZaJednaSztuke = cena/iloscSztuk;
            napis1 = "Kwota za jedną sztukę ksiązki " + tytul + " wynosi: " + cenaZaJednaSztuke;
            return napis1;
        }
}
