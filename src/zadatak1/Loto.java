/*
 * Korisnik preko standardnog ulaza unosi jedan ceo broj u opsegu 1-50. Broj koji treba pogoditi je  
 * generisan pomocu Random klase. U zavisnosti od rezultata pogadjanja (razlika dva broja veca, manja ili jednaka 5)
 * ispisuje se odgovarajuca poruka
 */
package zadatak1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nadezda Petrovic
 */
public class Loto {

    static Scanner ulaz = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        int slucajanBroj = random.nextInt(50) + 1;
        StringBuilder stringBuild = new StringBuilder("Trazeni broj je: ");
        boolean pomocna=true;
        while (pomocna) {
            
            System.out.println("Unesite ceo broj do 1-50:");

            // ispituje da li je unet ispravan format
            int unetiBroj = proveraInt();
            // ispituje interval vrednosti
            if (51 > unetiBroj && 0 < unetiBroj) {
                // ispituje uspesnost u pogadjanju broja
                if (slucajanBroj == unetiBroj) {
                    System.out.println("Neverovatno!Pogodili ste tacan broj!");
                } else if (5 >= Math.abs(unetiBroj - slucajanBroj)) {

                    System.out.println("Dobar pokusaj, bili ste jako blizu!");

                } else {
                    System.out.println("Vise srece drugi put!");
                }

                System.out.println(stringBuild);
                System.out.println(slucajanBroj);
                
                System.out.println("Da li zelite da nastavite sa programom (da ili ne)?");
                String nastavak = ulaz.next();
                if (nastavak.equalsIgnoreCase("da")) {
                    slucajanBroj = random.nextInt(50) + 1;
                    pomocna=true;
                } else {
                    System.out.println("Kraj!");
                    pomocna=false;
                }
            } else {
                System.out.println("Pogresan interval, uneti broj treba da bude u intervalu 1-50!");
                pomocna=true;
            }

        }
        ulaz.close();
    }

    public static int proveraInt() {
        while (!ulaz.hasNextInt()) {
            System.out.println("Pogresan parametar, unesite ceo broj!");
            ulaz.next();
        }
        return ulaz.nextInt();
    }
}
