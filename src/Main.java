import java.util.Scanner;

public class Main {

    // Methode zum Erraten einer Zufallszahl
    static void rateZahl() {
        int zufallsZahl = (int) (Math.random() * 101.0); // generiert Zahl zwischen 0 und 100
        // System.out.println(randomNumber); zum testen

        Scanner sc = new Scanner(System.in); // neues Scanner-Objekt

        System.out.println("Erraten Sie die Zahl zwischen 0 und 100:");
        int eingabeZahl = sc.nextInt(); // Abfrage der Eingabe

        int versuche = 1; // counter für Anzahl der Versuche

        while (zufallsZahl != eingabeZahl) { // Ausführung so lange Zahl nicht erraten wurde

            if (eingabeZahl < 0 || eingabeZahl > 100) { // prüft ob Eingabezahl gültig ist
                System.out.println("Bitte geben Sie eine Zahl zwischen 0 und 100 ein!");
            }
            else if (eingabeZahl > zufallsZahl) { // prüft ob Eingabezahl größer als Zufallszahl ist
                System.out.println(eingabeZahl + " ist größer als die Zufallszahl.");
            }
            else { // prüft ob Eingabezahl kleiner als Zufallszahl ist
                System.out.println(eingabeZahl + " ist kleiner als die Zufallszahl.");
            }

            eingabeZahl = sc.nextInt(); // führt die erneute Scanner-Eingabe aus
            versuche++; // erhöht die Anzahl der Versuche um +1

        }

        System.out.println("Richtig geraten! Die Zufallszahl war " + zufallsZahl + "."); // gibt Erfolgsmeldung und randomNumber aus
        System.out.println("Anzahl der Versuche: " + versuche); // gibt Anzahl der Versuche aus
    }

    public static void main(String[] args) {
        rateZahl(); // ruft die Methode rateZahl auf
    }

}