package homework.edinita.javaPart3.javaPart3_2and3.transport.motor.combustibil;

public class Benzina implements Combustibil{
    private final String benzina = "Benzina";

    public String getBenzina() {
        return benzina;
    }

    @Override
    public String toString() {
        return "Benzina{" +
                "benzina='" + benzina + '\'' +
                '}';
    }
}
