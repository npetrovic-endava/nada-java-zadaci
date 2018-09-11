/*
 * Program ispisuje ime studenta sa najvecim brojem poena na testu
 * prvo se unosi ukupan broj studenata, a zatim ime i broj poena svakog studenta
 */
package zadatak4;
/**
 *
 * @author Nadezda Petrovic
 */
import java.util.Scanner;

public class Student {

    static Scanner ulaz = new Scanner(System.in);

    public static void main(String[] args) {
    	
//maxPoeni dodeljujemo vrednost 0 da bismo u prvom toku if naredbe imali vrednost maxPoeni= broj poena prvog studenta
        int maxPoeni = 0;
        StringBuilder sb = new StringBuilder("Najbolji student je: ");
        String imeNajboljegStudenta = "";
        String imeStudenta;
        int poeni;
        while (true) {
            System.out.println("Uneti broj studenata:");
            int n = proveraInt();
            n = proveraBroj(n);
            for (int i = 0; i < n; i++) {
                System.out.println("Unesite ime studenta:");
                imeStudenta = proveraString();
                System.out.println("Unesite broj poena:");

                poeni = proveraInt();
                poeni = proveraBroj(poeni);
                if (poeni > maxPoeni) {
                    //dodeljujemo maxPoeni vrednost trenutnog najveceg  broja poena
                    maxPoeni = poeni;
                    imeNajboljegStudenta = imeStudenta;
                }
            }
            System.out.println(sb.append(imeNajboljegStudenta));

            System.out.println("Da li zelite da nastavite sa programom (da ili ne)?");
            String nastavak = ulaz.next();
            if (nastavak.equalsIgnoreCase("da")) {
                sb = new StringBuilder("Najbolji student je: ");
            } else {
                System.out.println("Kraj!");
                break;
            }
        }

    }

    public static String proveraString() {
        String ime = "";
        while (!ime.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$")) {
            if (!ime.equals("")) {
                System.out.print("Pogresan parametar, unesite ime studenta (String): ");
            }
            ime = ulaz.nextLine();
        }
        return ime;
    }

    public static int proveraInt() {

        while (!ulaz.hasNextInt()) {
            System.out.println("Pogresan parametar, unesite ceo broj:");
            ulaz.next();
        }
        return ulaz.nextInt();
    }

    public static int proveraBroj(int n) {
        while (n <= 0) {
            System.out.print("Pogresan parametar, unesite ceo broj veci od 0: ");
            n = ulaz.nextInt();
        }
        return n;
    }
}
