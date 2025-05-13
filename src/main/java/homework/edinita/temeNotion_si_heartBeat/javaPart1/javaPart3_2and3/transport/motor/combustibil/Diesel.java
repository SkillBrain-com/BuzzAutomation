package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.transport.motor.combustibil;

public class Diesel implements Combustibil{
    private final String Diesel = "Diesel";

    public String getDiesel() {
        return Diesel;
    }

    @Override
    public String toString() {
        return "Diesel{" +
                "Diesel='" + Diesel + '\'' +
                '}';
    }
}
