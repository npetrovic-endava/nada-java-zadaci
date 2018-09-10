/*
 * Korisnik preko standardnog ulaza unosi jedan ceo broj u opsegu 1-50. Broj koji treba pogoditi je  
 * generisan pomocu Random klase. Pogadjanje broja se nastavlja sve dok se ne pogodi broj ili bude barem blizu 
 * (razlika dva broja manja od 5)
 */
package zadatak5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nadezda Petrovic
 */
public class ModifikacijaPogadjanja {

    public static Scanner ulaz = new Scanner(System.in);
    static Random random = new Random();
    static int unetiBroj;
    static int rezultat;
    static int slucajanBroj;
    static StringBuilder stringBuild;

    public static void main(String[] args) {
        rezultat = 2;
        slucajanBroj = random.nextInt(50) + 1;
        stringBuild = new StringBuilder("Slucajno generisan broj je: ");
        boolean pomocna=true;
        while (pomocna) {

            System.out.println("Unesite neki broju intervalu 1-50:");
            unetiBroj = proveraInt();

            if (0 < unetiBroj && 50 >= unetiBroj) {

                rezultat = proveraPogotka(unetiBroj);

                if (2 == rezultat) {
                    continue;
                }
                System.out.println(stringBuild);
                System.out.println(slucajanBroj);
            } else {
                System.out.println("Pogresan interval ");
                pomocna=true;
            }
            System.out.println("Da li zelite novu igru (da ili ne)?");
            String nastavak = ulaz.next();
            if (nastavak.equalsIgnoreCase("da")) {
                slucajanBroj = random.nextInt(50) + 1;
                pomocna=true;
            } else {
                System.out.println("Kraj!");
                pomocna=false;
            }
        }
        ulaz.close();
    }

    public static int proveraInt() {

        while (!ulaz.hasNextInt()) {
            System.out.println("Pogresan parametar, unesite ceo broj:");
            ulaz.next();
        }
        return ulaz.nextInt();
    }

    public static int proveraPogotka(int broj) {

        if (slucajanBroj == broj) {
            System.out.println("Neverovatno! Pogodili ste tacan broj!");
            return 0;
        } else if (5 >= Math.abs(broj - slucajanBroj)) {
            System.out.println("Dobar pokusaj, bili ste jako blizu!");
            return 1;
        } else {
            System.out.println("Pokusajte ponovo, niste blizu pogotka.");
            return 2;

        }

    }
}
