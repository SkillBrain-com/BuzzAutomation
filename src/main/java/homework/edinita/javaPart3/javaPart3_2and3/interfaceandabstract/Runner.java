package homework.edinita.javaPart3.javaPart3_2and3.interfaceandabstract;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Amoxacilina amoxacilina =  new Amoxacilina();
        Detrical detrical =  new Detrical();
        Nurofen nurofen =  new Nurofen();
        Paracetamol paracetamol = new Paracetamol();

        List<Prospect> medicamente =  new ArrayList<>();
        medicamente.add(amoxacilina);
        medicamente.add(detrical);
        medicamente.add(nurofen);
        medicamente.add(paracetamol);
        System.out.println(medicamente);
    }
}
