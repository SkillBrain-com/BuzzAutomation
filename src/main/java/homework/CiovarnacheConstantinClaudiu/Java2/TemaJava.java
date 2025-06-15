package homework.CiovarnacheConstantinClaudiu.Java2;

import java.util.*;

public class TemaJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Introdu un numar: ");
        int inputNumber = scanner.nextInt();
        int randomNumber = random.nextInt(100) + 1;
        if (inputNumber < randomNumber) {
            System.out.println("Numarul introdus este mai mic decat " + randomNumber);
        } else if (inputNumber > randomNumber) {
            System.out.println("Numarul introdus este mai mare decat " + randomNumber);
        } else {
            System.out.println("Numarul introdus este egal cu " + randomNumber);
        }

        System.out.print("\nIntrodu un caracter (a/s/i/p/m): ");
        char operation = scanner.next().charAt(0);
        System.out.print("Introdu primul numar: ");
        int n1 = scanner.nextInt();
        System.out.print("Introdu al doilea numar: ");
        int n2 = scanner.nextInt();

        switch (operation) {
            case 'a' -> System.out.println("Adunare: " + (n1 + n2));
            case 's' -> System.out.println("Scadere: " + (n1 - n2));
            case 'i' -> System.out.println("Inmultire: " + (n1 * n2));
            case 'p' -> {
                if (n2 != 0) System.out.println("Impartire: " + (double) n1 / n2);
                else System.out.println("Impartire la zero!");
            }
            case 'm' -> System.out.println("Modul: " + (n1 % n2));
            default -> System.out.println("Caracter invalid!");
        }

        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        System.out.println("\nArray 2D - capete:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Rand " + i + ": primul=" + matrix[i][0] + ", ultimul=" + matrix[i][matrix[i].length - 1]);
        }

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        System.out.println("\nFiecare al doilea caracter:");
        for (int i = 1; i < letters.length; i += 2) {
            System.out.print(letters[i] + " ");
        }
        System.out.println();

        double[] decimals = {3.1, 4.5, 5.0, 6.3, 4.5};
        System.out.println("\nVerificare array double:");
        for (double d : decimals) {
            if (d == 4.5) {
                System.out.println("Valoare exacta: 4.5");
            } else if (d > 5) {
                System.out.println("Element peste 5: " + d);
            }
        }

        int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("\nIterare array cu conditii:");
        for (int i = 0; i < values.length; i++) {
            if (i == 2) continue;
            if (i == 7) break;
            System.out.println("Index valid: " + i);
        }

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int suma = 0;
        for (int num : nums) {
            suma += num;
        }
        System.out.println("\nSuma elementelor din lista: " + suma);

        int[] emptyArray = {};
        List<String> emptyList = new ArrayList<>();
        System.out.println("\nArray gol? " + (emptyArray.length == 0));
        System.out.println("Lista goala? " + emptyList.isEmpty());

        int[] arr = {5, 3, 8, 1, 9};
        System.out.println("\nSortare crescator:");
        sortArray(arr, true);
        System.out.println(Arrays.toString(arr));
        System.out.println("Sortare descrescator:");
        sortArray(arr, false);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(int[] array, boolean ascending) {
        Arrays.sort(array);
        if (!ascending) {
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        }
    }
}
