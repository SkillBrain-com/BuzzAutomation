package homework.PasaricaAndrei.Ex1;

public class ElonsToyCar {

    public ElonsToyCar() {
    }

    // Cumpăra o nouă mașinuță
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    // Confirmă că mașina funcționează
    public void drive() {
        System.out.println("Vrom");
    }

    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy(); // cumpărăm
        car.drive(); // testăm
    }
}

