package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.interfaceandabstract;

public class Amoxacilina implements Prospect{
    private String nume = "Amoxacilina";
    private String fabrica  = "Antibiotice SA";
    private int numarCapsule = 100;
    @Override
    public String informatiiProspect() {
        System.out.println(numarPagProspect);
        return "Amoxacilina se va lua la 6h dupa masa si nu inainte de culcare";
    }

    @Override
    public String toString() {
        return "Amoxacilina{" +
                "nume='" + nume + '\'' +
                ", fabrica='" + fabrica + '\'' +
                ", numarCapsule=" + numarCapsule +
                '}';
    }
}
