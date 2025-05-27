package homework.Emanuel.Homework_Java2;

import java.util.Arrays;

public class BirdWatcher {

    public static void main(String[] args) {

        System.out.println("======================");
        System.out.println("Numararile din saptamana trecuta in care avem: " + getLastWeek () + " zile");
        System.out.println("======================");
        System.out.println("Pasarile numarate in ziua de azi " + getToday());
        System.out.println("======================");
        System.out.println("Cresterea numarului de pasari pentru azi " + icrementTodaysCount());
        System.out.println("======================");
        System.out.println("Este adevarat ca a fost o zi in care a sunt zero vizitatori " + hasDayWithoutBirds());
        System.out.println("======================");
        System.out.println("Numarul de pasari este: " + getCountForFirstDays());
        System.out.println("======================");
        System.out.println("Numarul de  zile cu vizitatori in gradina sunt " + getBusyDays());
    }

     // 1. Verificati care au fost numararile saptamana trecuta
       public static int getLastWeek (){
        int[] intArray = {0, 2, 5, 3, 7, 8, 4};
           System.out.println(Arrays.toString(intArray));
          return intArray.length;
       }

      // 2. Verificati cate pasari au vizitat astazi gradina
      public static int getToday(){
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};

        return birdsPerDay[birdsPerDay.length -1];
      }

      // 3. Cresteti numarul de astazi
      public static int icrementTodaysCount(){
        int[] BrdsPerDay = {2, 5, 0, 7, 4, 1};
        BrdsPerDay[BrdsPerDay.length-1]++;
          return BrdsPerDay[BrdsPerDay.length-1];
      }
      // 4. Verificati daca a existat o zi fara pasari in vizita (return 2)
      public static boolean hasDayWithoutBirds(){
          int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
          for (int i = 0; i < birdsPerDay.length ; i++) {
             if(i == 0){
                 System.out.println("Este adevarat");
                 return true;
             }

          }
          return false;
      }
      // 5.Calculati numarul de pasari in vizita pentru primul numar de zile
      public static int getCountForFirstDays(){
          int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
          int sum = 0;


          for (int i = 0; i < birdsPerDay.length; i++) {
              sum += birdsPerDay[i];

          }
          return sum;
      }
      // 6. Calculati numarul de zile aglomerate, stiind ca o zi aglomerata inseamna ca trece de 5 pasari sua egal
      public static int getBusyDays(){
          int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
          int zile = 0;
          for (int i = 0; i < birdsPerDay.length; i++) {
              if(birdsPerDay[i] >= 5){
                  zile++;
              }
          }
          return zile;
      }
}
