package homework.Emanuel.HomeWorkPartea2_Java2;

public class Exercitiul4Pt2 {

    public static void main(String[] args) {
         /*
          1. Definiti un array de char-uri. Iterati array-ul folosind structura for,
          si afisati pe ecran cate al doilea caracter din sir.
          */
        char[] nrChar = {'M', 'J', 'F', 'D', 'Z', 'T', 'R'};
        System.out.println("Metoda1:");
        System.out.print("[");
        for (char i = 0; i < nrChar.length; i++) {
            System.out.print(nrChar[0] + ", ");
            System.out.print(nrChar[i+3] + ", ");
            System.out.print(nrChar[i+6]);

            break;
        }
        System.out.print("]");

        System.out.println("!");
        System.out.println("Metoda 2:");
        System.out.print("[");
        metoda2();
        System.out.print("]");
    }

    public static void metoda2(){

        char[] nrChar = {'M', 'J', 'F', 'D', 'Z', 'T', 'R'};

        for(char dublareChar : nrChar){
            char incepere = 0;
            if(incepere < dublareChar){
                char index = nrChar[0];
                char index1 = nrChar[3];
                char index2 = nrChar[6];
                System.out.print(index + ",");
                System.out.print(index1 + ",");
                System.out.print(index2 + ",");
                break;
            }
        }
    }
}
