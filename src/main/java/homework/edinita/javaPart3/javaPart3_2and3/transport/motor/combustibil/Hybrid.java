package homework.edinita.javaPart3.javaPart3_2and3.transport.motor.combustibil;

public class Hybrid implements Combustibil{
    private final String Hybrid = "Hybrid";

    public String getHybrid() {
        return Hybrid;
    }

    @Override
    public String toString() {
        return "Hybrid{" +
                "Hybrid='" + Hybrid + '\'' +
                '}';
    }
}
