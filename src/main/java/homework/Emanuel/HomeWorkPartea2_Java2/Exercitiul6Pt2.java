package homework.Emanuel.HomeWorkPartea2_Java2;

public class Exercitiul6Pt2 {

    public static void main(String[] args) {
        /*
        6. Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere).
           Daca iteratia este la indexul 2, sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca iteratia.
           Altfel, sa se afiseze mesajul “Index valid” pe ecran.
         */
//
        String[] myArray = {"Ana", "Maria", "Izabela", "Cristina", "Simina", "Bianca", "Ioana", "Dinu", "Selena"};
        for (int i = 0; i < myArray.length ; i++) {
            if(myArray[i] == "Izabela"){
                String sarePeste = myArray[i+1];
                System.out.println("Iteratia a fost la indexul cu numele: " + myArray[2] +
                                   " si a sarit la indexul cu numele: " +  sarePeste + "!");
            }
            if(myArray[i] == myArray[7]){
                System.out.println("INDEX VALID!");
            }
        }
        System.out.println("========================");
        System.out.println("METODA 2:");
        Metoda2();
    }
//  =>Metoda 2
    public static void Metoda2(){

        String[] myArray = {"Ana", "Maria", "Izabela", "Cristina", "Simina", "Bianca", "Ioana", "Dinu", "Selena"};
        String i = myArray[2+1];
        for(String nume : myArray) {
            if (nume.equals(i)) {
                System.out.println(nume);
            }
        }
        String text = "INDEX VALID";
        String i2 = myArray[8-1];
        for(String nume2 : myArray){
            if(nume2.equals(i2)){
                System.out.println(text);
            }
        }
    }
}
