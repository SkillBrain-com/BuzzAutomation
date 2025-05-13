package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_1.exercitiiDupaHeartbeat.needforspeed;

public class RaceTrack extends NeedForSpeed {
    int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {

        int a = this.distance / car.speed;
        int b = a * car.batteryDrain;
        int c = this.battery - b;
        if (c > 0) {
            System.out.println("\t\t// carCanFinish => true");
            return true;
        }else {
            System.out.println("\t\t// carCanFinish => false");
            return false;
        }
    }

    public static void main(String[] args) {
        int speed = 5;
        int batteryDrain = 2;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

//        Object x = new Object();
//        ArrayList<NeedForSpeed> toateMasinilie2 = new ArrayList<>(3);
//
//        NeedForSpeed z = (NeedForSpeed) x;
//        toateMasinilie2.add(z);
//
//        System.out.println(toateMasinilie2.get(0));


//        ArrayList<Object> toateMasinilie = new ArrayList<>(3);
//        toateMasinilie.add(0, new NeedForSpeed(5, 2));
//        toateMasinilie.add(1, new NeedForSpeed(5, 2) );
//        toateMasinilie.add(2, new NeedForSpeed(4, 2));
//        toateMasinilie.get(0).

        int distance = 100;
        RaceTrack raceTrack = new RaceTrack(distance);
        raceTrack.carCanFinish(car);
    }
}
