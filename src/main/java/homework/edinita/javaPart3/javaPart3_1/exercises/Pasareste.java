package homework.edinita.javaPart3.javaPart3_1.exercises;

import java.util.Scanner;

public class Pasareste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți o frază: ");
        String fraza = scanner.nextLine();

        System.out.print("Introduceți caracterul de adăugat: ");
        char caracterDeAdaugat = scanner.next().charAt(0);

        String frazaModificata = modificaFraza(fraza, caracterDeAdaugat);

        System.out.println("Fraza modificată: " + frazaModificata);
    }

    public static String modificaFraza(String fraza, char caracterDeAdaugat) {
        // 1. Împărțim fraza în cuvinte individuale, folosind spațiul ca delimitator.
        String[] cuvinte = fraza.split(" ");

        // 2. Creăm un StringBuilder pentru a construi fraza modificată.
        StringBuilder frazaModificata = new StringBuilder();

        // 3. Iterăm prin fiecare cuvânt din array-ul de cuvinte.
        for (String cuvant : cuvinte) {
            // 4. Creăm un StringBuilder pentru a construi cuvântul modificat.
            StringBuilder cuvantModificat = new StringBuilder();

            // 5. Iterăm prin fiecare caracter din cuvântul curent.
            for (int i = 0; i < cuvant.length(); i++) {
                char caracter = cuvant.charAt(i);

                // 6. Adăugăm caracterul curent la cuvântul modificat.
                cuvantModificat.append(caracter);

                // 7. Verificăm dacă caracterul curent este o vocală (indiferent dacă e majusculă sau minusculă).
                if ("aeiouAEIOU".indexOf(caracter) != -1) {
                    // 8. Dacă este vocală, adăugăm caracterul specificat și vocala la cuvântul modificat.
                    cuvantModificat.append(caracterDeAdaugat).append(caracter);
                }
            }

            // 9. Adăugăm cuvântul modificat și un spațiu la fraza modificată.
            frazaModificata.append(cuvantModificat).append(" ");
        }

        // 10. Returnăm fraza modificată, eliminând spațiul de la final (dacă există).
        return frazaModificata.toString().trim();
    }
}