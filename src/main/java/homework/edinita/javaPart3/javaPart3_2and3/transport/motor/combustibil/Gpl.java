package homework.edinita.javaPart3.javaPart3_2and3.transport.motor.combustibil;

public class Gpl implements Combustibil{
    private final String gpl = "Gpl";

    public String getGpl() {
        return gpl;
    }

    @Override
    public String toString() {
        return "Gpl{" +
                "gpl='" + gpl + '\'' +
                '}';
    }
}
