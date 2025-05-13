package homework.edinita.javaPart3.courses;

public class Main {
    public static void main(String[] args) {
        int [] array=  {1,2,3,45,6,6};

        for( int variable : array ) {
            System.out.println(variable);
        }

        String [] namesList = {"cristian", "marco", "alexandra"};

        for(String name : namesList  ) {
            System.out.println(name);
        }

        double [] noteExamen = {5.75, 9.5, 8.25, 9.99};

        for(double note: noteExamen ) {
            System.out.println(note);
        }

    }
}
