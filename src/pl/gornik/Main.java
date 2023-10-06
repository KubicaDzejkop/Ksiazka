package pl.gornik;
import pl.gornik.ksiazka.Ksiazka;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Ksiazka> ksiazkaList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tytuł książki");
        String tytul = scanner.nextLine();

        System.out.println("Podaj kategorię");
        String kategoria = scanner.nextLine();

        System.out.println("Podaj ilość stron");
        int iloscStron = scanner.nextInt();

        System.out.println("Podaj cenę");
        double cena = scanner.nextDouble();

        System.out.println("Podaj liczbę sztuk");
        int iloscSztuk = scanner.nextInt();

        Ksiazka ksiazka = new Ksiazka(tytul, kategoria, iloscStron, cena, iloscSztuk);

        System.out.println(ksiazka.wyswietlKsiazke());
        System.out.println(ksiazka.obliczKwoteZaDanyTytul());

        Ksiazka ksiaz;
        Scanner scanner1 = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Podaj nazwę produktu");
            tytul = scanner1.nextLine();

            System.out.println("Podaj kategorię produktu");
            kategoria = scanner1.nextLine();

            System.out.println("Podaj ilość stron produktu");
            iloscStron = scanner1.nextInt();
            scanner1.nextLine();

            System.out.println("Podaj cenę produktu");
            cena = scanner1.nextDouble();
            scanner1.nextLine();

            System.out.println("Podaj ilość sztuk produktu");
            iloscSztuk = scanner1.nextInt();

            ksiaz = new Ksiazka(tytul, kategoria, iloscStron, cena, iloscSztuk);
            ksiazkaList.add(ksiaz);
        }
        System.out.println(ksiazkaList);

    }
}