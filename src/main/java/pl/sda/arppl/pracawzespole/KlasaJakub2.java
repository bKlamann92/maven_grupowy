package pl.sda.arppl.pracawzespole;

import java.util.Scanner;

public class KlasaJakub2 {
    public static void main(String[] args) {
        System.out.println("Jak masz na imie: ");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.next();

        System.out.println("Jak masz na drugie imie: ");
        String imie2 = scanner.next();

        System.out.println("Podaj liczbę zmiennoprzecinkową: ");
        double liczbe = scanner.nextDouble();

        System.out.println("Podaj drugą liczbę zmiennoprzecinkową");
        double drugaLiczba = scanner.nextDouble();

        double różnica = liczbe - drugaLiczba;
        double suma = liczbe + drugaLiczba;

        System.out.println("Hej " + imie + " " + imie2 + "!" + " Suma tych liczb wynosi: " + suma + "," + " a różnica" + różnica );









    }
}

