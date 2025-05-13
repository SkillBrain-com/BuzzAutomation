package homework.edinita.javaPart2;


public class MoreExercises {
    public static void main(String[] args) {


        /*
    1. Citit un numar de la tastatura si stocati valoarea lui intr-o variabila.
    Generati un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila.
    Daca numarul introdus de la tastatura este mai mic decat numarul random generat,
    afisati mesajul “Numarul introdus este mai mic decat <numar_random>”
    (inserati valoarea numarului random generat in textul afisat).
 */


//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.println("\t\tType a number to see if your number is less than a number generated.\n");
//
//        int num = scanner.nextInt();
//        int gen = random.nextInt(100);
//
//        if (num < gen) {
//            System.out.println("Input number " + num + " is less than: '" + gen + "'");
//        }


            /*
            2. Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile.
            Folosind structura switch, daca s-a introdus un caracter anume,
            realizati operatia respectiva cu cele 2 numere,
            si afisati rezultatul pe ecran:-‘a’: adaugare-‘s’: scadere-‘i’: inmultire-‘p’: impartire-‘m’: modul
            Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.
             */


//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.println("\t\tPRESS___'a' for sum");
//        System.out.println("\t\tPRESS___'s' for dif");
//        System.out.println("\t\tPRESS___'i' for multiply");
//        System.out.println("\t\tPRESS___'p' for division");
//        System.out.println("\t\tPRESS___'m' for mod\n\n");
//
//        String abc = scanner.nextLine();
//
//        System.out.println("Now enter the first number: ");
//        int a = scanner.nextInt();
//        System.out.println("\nNow enter the secondNumber: ");
//        int b = scanner.nextInt();
//
//
//        switch (abc) {
//            case ("a"): {
//                System.out.println("You pressed 'a' for sum\t" + (a + b) + " <- this is the end..");
//                break;
//            }
//            case "s": {
//                System.out.println("You pressed 's' for dif\t" + (a - b) + " <- this is the end..");
//                break;
//            }
//            case "i": {
//                System.out.println("You pressed 'i' for multiply\t" + (a * b) + " <- this is the end..");
//                break;
//            }
//            case "p": {
//                System.out.println("You pressed 'p' for division\t" + (a / b) + " <- this is the end..");
//                break;
//            }
//            case "m": {
//                System.out.println("You pressed 'm' for mod\t" + (a % b) + " <- this is the end..");
//                break;
//            }
//            default: {
//                System.out.println("The input is not valid");
//            }


        /*
        3. Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3,
        respectiv 5 elemente. Initializati array-ul.
        Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.
         */


//        int[][] matrix = {{1, 2, 3}, {1, 2, 3, 4, 5}};
//
//  System.out.println(matrix[1][0] + " " + matrix[1][1] + " " + matrix[1][2] + "\n" + matrix[1][0] + " " + matrix[1][1] + " " + matrix[1][2]);


        /*
            4. Definiti un array de char-uri. Iterati array-ul folosind structura for,
            si afisati pe ecran cate al doilea caracter din sir.
         */

//            String[] aray = {"q", "w", "e", "r", "t", "y", "U"};
//            char[] array = {'a', 's'};
//
//            for (int i = 0; i <= aray.length; i += 2) {
//                System.out.println("\t" + aray[i]);
//            }


        /*
            5. Definiti un array de double, cu valori zecimale.
            Iterati array-ul folosind strutura for,
            si daca un element este egal cu valoarea 4.5, afisati-l pe ecran.
            Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”
         */

//            double[] nr = {1.1, 4.5, 1.3, 1.4, 2.1, 6, 2.3, 8};
//
//            for (int i = 0; i < nr.length; i++ ) {
//                if (nr[i] == 4.5) {
//                    System.out.println(nr[i]);
//                }else if(nr[i] > 5) {
//                    System.out.println("Is over 5");
//                }
//            }

        /*
            6. Definiti un array cu 9 elemente si parcugeti-l cu structura for
            (tipul de date este la alegere). Daca iteratia este la indexul 2,
            sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca iteratia.
            Altfel, sa se afiseze mesajul “Index valid” pe ecran.
         */


//            int[] sir = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//
//            for (int i = 0; i < sir.length; i++ ) {
//                if (i == 2) {
//                    continue; //i++
//                }
//                if(i == 7) {
//                    break;
//                }else {
//                    System.out.println("Index valid");
//                }
//            }




        /*
            7. Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
         */

//            ArrayList<Integer> list = new ArrayList<>();
//            list.add(1);
//            list.add(2);
//            list.add(3);
//            list.add(4);
//            list.add(5);
//
//            int s = 0;
//            for (int i = 0; i < list.size(); i++ ) {
//                s += list.get(i);
//            }
//        System.out.println(s);


        /*
            8. Definiti un array si o lista. Determinati daca ele sunt goale sau nu.
         */


//            String[] aray;
//            ArrayList<String> list = new ArrayList<>();
//        System.out.println(aray[0]);
//        System.out.println(list.get(0));


        }
    }