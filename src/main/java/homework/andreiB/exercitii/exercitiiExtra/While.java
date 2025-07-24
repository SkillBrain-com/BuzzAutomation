package homework.andreiB.exercitii.exercitiiExtra;

import java.util.ArrayList;
import java.util.List;

public class While {
    public static void main(String[] args) {


    List<Integer> numere = new ArrayList<>();
    int i = 0;

    while(i <= 10 ) {
        numere.add(i);
        i++;
    }
        System.out.println(numere);
}
}