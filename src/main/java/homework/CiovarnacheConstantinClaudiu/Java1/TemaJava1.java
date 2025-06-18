package homework.CiovarnacheConstantinClaudiu.Java1;

import java.util.Scanner;

public class TemaJava1 {

    public static void main(String[] args) {
        System.out.println("1. Afisare 'Imi place Java':");
        afiseazaImiPlaceJava();

        System.out.println("\n2. Afisare propozitie de 6 ori:");
        afiseazaPropozitieDe6Ori();

        System.out.println("\n3. Varsta lui David:");
        afiseazaVarstaDavid();

        System.out.println("\n4. Citire propozitie de la tastatura:");
        citestePropozitie();

        System.out.println("\n5. Metoda cu 3 variabile:");
        myVariables();

        System.out.println("\n6. Citire si afisare 2 numere:");
        readAndPrintTwoNumbers();

        System.out.println("\n7. Operatii cu un numar:");
        calculeazaOperatii();

        System.out.println("\n8. Exercitiu comentarii pentru afisarea 12 si 2:");
        exercitiuComentarii();
    }

    
    public static void afiseazaImiPlaceJava() {
        System.out.println("Imi place Java");
    }


    public static void afiseazaPropozitieDe6Ori() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Cursul acesta este foarte fain!");
        }
    }

    public static void afiseazaVarstaDavid() {
        int anaAge = 24;
        int davidAge = anaAge - 6;
        System.out.println("David are " + davidAge + " ani.");
    }


    public static void citestePropozitie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Scrie o propozitie: ");
        String input = scanner.nextLine();
        System.out.println("Ai scris: " + input);
    }


    public static void myVariables() {
        int age = 30;
        String name = "Claudiu";
        boolean isStudent = true;

        System.out.println("int: " + age);
        System.out.println("String: " + name);
        System.out.println("boolean: " + isStudent);
    }


    public static void readAndPrintTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu primul numar: ");
        int a = scanner.nextInt();
        System.out.print("Introdu al doilea numar: ");
        int b = scanner.nextInt();

        System.out.println("Numerele introduse sunt: " + a + " si " + b);
    }


    public static void calculeazaOperatii() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu un numar: ");
        double num = scanner.nextDouble();

        System.out.println("Suma cu 5: " + (num + 5));
        System.out.println("Scaderea cu 12.3: " + (num - 12.3));
        System.out.println("Inmultirea cu -3.2: " + (num * -3.2));
        System.out.println("Impartirea cu 4: " + (num / 4));
        System.out.println("Modulul cu 6: " + (num % 6));
    }


    public static void exercitiuComentarii() {
        int x = 2;
        int y = 12;


        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x); // 12
        System.out.println(y); // 2
    }
}
