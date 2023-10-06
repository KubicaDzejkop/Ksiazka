package pl.gornik;

import pl.gornik.ksiazka.Ksiazka;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

    }
}