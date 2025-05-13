package homework.edinita.javaPart3.javaPart3_2and3.abstractizarea;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Persoane> persoaneLista = List.of(
                new Student("nita", "edi", 23, "pecetei 9", "fmi", "mate-info"),
                new Student("aouhsd", "ajhsd", 33, "aisygdgia 9", "nnn", "aoushdhouasd-info"),
                new Student("akjbsbkj", "ospopo", 11, "aosuhdhouas 19", "aknsd", "papappa-info"),
                new Student("mwmwmwmw", "wmwmw", 22, "aposdjp 339", "aosijdipasd", "pqpqppq-info"),
                new Student("abjjbksbd", "aoisidop", 44, "paspodoaaaa 9", "aklsdn", "mate-aljsndnanana")
        );

        System.out.println(persoaneLista.get(0));
        System.out.println(persoaneLista.get(2).isAgeMoreThan30());
        System.out.println(persoaneLista.get(2).prenume());
        persoaneLista.get(2).nume();


        Persoane persoana = new Student("nita", "edi", 23, "pecetei 9", "fmi", "mate-info");
        System.out.println("---------=-=------------------------------------");

        System.out.println(persoana.isAgeMoreThan30());
        System.out.println(persoana);
    }
}
