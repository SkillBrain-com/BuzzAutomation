package homework.edinita.javaPart3.javaPart3_1.exercises.needforspeed;

public class NeedForSpeed {
    int battery = 100;
    int batteryDrain;
    int speed;
    int totalMeters = 0;

    public NeedForSpeed() {
        this.battery = 100;
        this. totalMeters = 0;
        this.speed = 50;
        this.batteryDrain = 4;
    }

    static NeedForSpeed nitro(){
        return new NeedForSpeed();
    }

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }


    public void drive() {
        if(this.battery > 0) {
            this.battery -= batteryDrain;
            this.totalMeters += speed;
        }
    }

    public void batteryDrained() {
        if (this.battery > batteryDrain) {
            System.out.println("\t\t//batteryDrained => false");
        } else {
            System.out.println("\t\t//batteryDrained => positive");
        }
    }
    public void distanceDriven () {
        System.out.println("\t\t//driven => " + this.totalMeters);
    }

        public static void main (String[]args){
            int speed = 5;
            int batteryDrain = 2;
            NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();

            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();


            car.distanceDriven();
            car.batteryDrained();
        }
}

