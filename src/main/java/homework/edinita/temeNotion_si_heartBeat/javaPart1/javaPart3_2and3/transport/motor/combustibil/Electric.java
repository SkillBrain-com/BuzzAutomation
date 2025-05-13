package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.transport.motor.combustibil;

public class Electric implements Combustibil{
    private final String electric = "Electric";

    public String getElectric() {
        return electric;
    }

    @Override
    public String toString() {
        return "Electric{" +
                "electric='" + electric + '\'' +
                '}';
    }
}
