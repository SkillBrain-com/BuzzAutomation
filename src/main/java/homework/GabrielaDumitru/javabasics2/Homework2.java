package homework.GabrielaDumitru.javabasics2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Exercitiu1();
        Exercitiu2();
        Exercitiu3();
        Exercitiu4();
        Exercitiu5();
        Exercitiu6();
        Exercitiu7();

      }

       public static void Exercitiu1() {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Introduceti un numar: ");
           int NumarIntrodus = scanner.nextInt();
           Random random = new Random();
           int NumarRandom = random.nextInt(100);
           if (NumarIntrodus < NumarRandom) ;
           System.out.println("Numarul introdus este mai mic decat" + NumarRandom);
           scanner.close();
       }

    public static void Exercitiu2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un caracter ('a' adunare, 's' scadere, 'i' inmultire, 'p' impartire, 'm' modul");
        char operatie = scanner.next().charAt(0);
        System.out.println("Introduceti primul numar: ");
        double Numar1 = scanner.nextDouble();
        System.out.println("Introduceti al doilea numar");
        double Numar2 = scanner.nextDouble();
        double rezultat;
        switch (operatie){
            case 'a':
                rezultat = Numar1 + Numar2;
                System.out.println("Rezultatul adunarii este: ");
                break;
            case 's':
                rezultat = Numar1 - Numar2;
                System.out.println("Rezultatul scaderii este: ");
                break;
            case 'i':
                rezultat = Numar1*Numar2;
                System.out.println("Rezultatul inmultirii este: ");
                break;
            case 'p':
                if (Numar2 !=0);
            {
                rezultat = Numar1 / Numar2;
                System.out.println("Rezultatul impartirii este: ");
                System.out.println("Eroare! Nu se poate imparti la 0");
            }
            break;
            case 'm':
                rezultat = Numar1 % Numar2;
                System.out.println("Rezultatul operatiei de modul este: ");
                break;
            default:
                System.out.println("Eroare! Caracter invalid introdus");
                break;

        }
        scanner.close();

    }

    public static void Exercitiu3(){
        char [] caractere = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 1; i < caractere.length; i += 2);{
            System.out.println(caractere);
        }
    }

    public static void Exercitiu4 () {
        double[] valori = {3.5, 4.5, 5.5, 6.7, 7.5};
        for (int i = 0; i < valori.length; i++) {
            if (valori[i] == 4.5) {
                System.out.println("Elementul egal cu 4.5 " + valori[i]);
            } else if (valori[i] > 5) {
                System.out.println("Element peste 5: " + valori[i]);
            }
        }
    }

    public static void Exercitiu5() {
        int[] array = {11, 28, 34, 46, 50, 66, 78, 81};
        for (int i = 0; i < array.length; i++) {
            if (i == 2) {
            }
            if (i == 7)
                System.out.println("Index valid" + i);
        }

    }

    public static void Exercitiu6 () {
        List<Integer> lista = new ArrayList<>();
        lista.add (1);
        lista.add (3);
        lista.add (5);
        lista.add (7);
        lista.add (9);

        int suma = 0;
        for (int numar : lista) {
            suma += numar;
        }
        System.out.println("Suma elementelor listei este: " + suma);
    }

    public static void Exercitiu7 () {
        int [] array = {};
        List<Integer> lista = new ArrayList<>();
        if (array.length == 0);{
            System.out.println("Array-ul este gol.");
            System.out.println("Array-ul nu este gol.");
        }
        if (lista.isEmpty()) {
            System.out.println("Lista este goala.");
            System.out.println("Lista nu este goala");
        }
        }

    }








