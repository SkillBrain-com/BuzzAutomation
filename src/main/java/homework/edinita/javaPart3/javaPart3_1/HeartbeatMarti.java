package homework.edinita.javaPart3.javaPart3_1;

import java.util.ArrayList;

public class HeartbeatMarti {
    public static void main(String[] args) {
        ArrayList<String> culori = new ArrayList<>(11);
        culori.add(0, "albastru ");
        culori.add(1, "galben ");
        culori.add(2, "roz ");
        culori.add(3, "maro ");
        culori.add(4, "gri ");

        System.out.println(culori.size() + "\n");


        for (int i = 0; i < culori.size(); i ++) {
            System.out.println(culori.get(i));
        }


        for (int i = 0; i < culori.size(); i ++) {
            if (i == 3) {culori.set(i, "maro deschis ");}
        }
        System.out.println("\n" + culori.get(3));

        for (int i = 0; i < culori.size(); i ++) {
            if(culori.get(i) == "galben ") {
                System.out.println("\n" + culori.get(i));
            }
        }
    }
}
