public class Functii {
    // functie = logica delimitata care poate fi refolosita
    // nu putem folosi spatii in nume
    // nu putem defini o functie in alta functie (nu pot instala firefox in chrome)

    // o functie simpla care ne printeaza ceva pe ecran
    // nu ne da nici un raspuns (nu are return)
    // nu are parametri

    public static void printGreeting() {
        System.out.println("Buna ziua! Bine ati venit!");
    }

    // o functie care saluta clientul in functie de numele lui
    // nu ne da nici un raspuns (nu are return)
    // are nevoie de parametri
    public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Buna ziua " + nume + " " + prenume);
    }

    // o functie care calculeaza media a 3 numere
    // ne da un raspuns - suma numerelor (va avea return)
    // ce tip de date va avea raspunsul? 3 + 5 = 8
    // are nevoie de parametri

    public static double mediaNr(double a, double b, double c) {
        double media = (a + b + c) / 3;
        return media;
    }

    // o functie care ne da valoarea lui pi
    // ne da un raspuns - da
    // raspunsul va fi double
    // are nevoie de parametri? nu

    public static double piValue() {
        // constanta - variabila care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;
    }

    public static void main(String[] args) {
        // intra clientul 1
        printGreeting(); // se apeleaza functia

        // intra clientul 2
        printGreeting(); // ctrl + click pe functie => ne duce la corpul functiei

        // apelam o functie cu parametri, oferind argumente
        printGreetingByName("Sinpetrean", "Andy");
        printGreetingByName("Sinpetrean", "Crina");
        printGreetingByName("Sinpetrean", "Ares");

        System.out.println(mediaNr(3, 3, 4));
        double media1 = (mediaNr(31213, 312313, 423));
        double media2 = (mediaNr(35, 324, 41));
        double media3 = (mediaNr(33, 11, 11));
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);
        System.out.println(piValue());
        System.out.println(piValue());

        // aria unui dreptunghi
        // aria cercului
        // suma a 2 numere
        // o functie care returneaza cate caractere are numele + prenumele
        // identificati voi probleme
    }
}
