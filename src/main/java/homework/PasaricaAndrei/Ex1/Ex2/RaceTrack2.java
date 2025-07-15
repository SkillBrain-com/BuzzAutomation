package homework.PasaricaAndrei.Ex1.Ex2;

public class RaceTrack2 {

    public class Main {
        public static void main(String[] args) {
            int distance = 800;
            RaceTrack raceTrack = new RaceTrack(distance);
            System.out.println("Track distance: " + raceTrack.getDistance() + " meters");


            NeedForSpeed car = new NeedForSpeed(5, 2);
            RaceTrack race = new RaceTrack(100);
            System.out.println(race.carCanFinish(car)); // adev
        }
    }

}

