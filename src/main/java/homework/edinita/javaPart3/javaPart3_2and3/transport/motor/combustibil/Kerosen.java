package homework.edinita.javaPart3.javaPart3_2and3.transport.motor.combustibil;

public class Kerosen implements Combustibil{
    private final String Kerosen = "Kerosen";

    public String getKerosen() {
        return Kerosen;
    }

    @Override
    public String toString() {
        return "Kerosen{" +
                "Kerosen='" + Kerosen + '\'' +
                '}';
    }
}
