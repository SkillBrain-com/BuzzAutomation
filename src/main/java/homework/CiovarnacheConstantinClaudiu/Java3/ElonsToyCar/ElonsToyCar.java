package homework.CiovarnacheConstantinClaudiu.Java3.ElonsToyCar;

public class ElonsToyCar {

    private int battery = 100;
    private int distance = 0;

    private ElonsToyCar() {
        // constructor privat
    }

    // Task 1: Creează o mașinuță nouă
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    // Task 2: Afișează distanța parcursă
    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    // Task 3: Afișează bateria rămasă
    public String batteryDisplay() {
        if (battery == 0) {
            return "Battery empty";
        }
        return "Battery at " + battery + "%";
    }

    // Task 4–6: Conduce mașina (20m, -1% baterie) dacă mai are baterie
    public void drive() {
        if (battery > 0) {
            distance += 20;
            battery -= 1;
        }
    }
}
