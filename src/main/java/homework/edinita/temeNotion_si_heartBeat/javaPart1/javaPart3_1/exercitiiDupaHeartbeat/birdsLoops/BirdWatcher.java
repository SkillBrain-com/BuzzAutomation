package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_1.exercitiiDupaHeartbeat.birdsLoops;

public class BirdWatcher {
    int[] birds;



    public  BirdWatcher(int[] birds){
        this.birds = birds;
    }


    public static BirdWatcher getLastWeek(){
        int[] birds = {2, 5, 0, 7, 4, 1};
        System.out.println("\t\tgetLastWeek => [" + birds[0] + ", " + birds[1] + ", " + birds[2] + ", " + birds[3] + ", " + birds[4] + ", " + birds[5] + "]");
        return new BirdWatcher(birds);
    }


    public void getToday(){
        for (int i = 0; i < this.birds.length; i++) {
            if(i == this.birds.length - 1)  {
                System.out.println("\t\tgetToday => " + this.birds[i]);
            }
        }
    }

    public void incrementTodaysCount(){
        for (int i = 0; i < this.birds.length; i++) {
            if(i == this.birds.length - 1)  {
                System.out.println("\t\tincrementTodaysCount => " + this.birds[i] + " --> " + (this.birds[i] += 1));
            }
        }
    }

    public void hasDayWithoutBirds() {
        boolean zero = false;
        for (int i = 0; i < this.birds.length; i++) {
            if (this.birds[i] == 0)  { zero = true; }
        }
        if(zero == true) {System.out.println("\t\thasDayWithoutBirds => true");}else {
            System.out.println("\t\thasDayWithoutBirds => false");
        }
    }

    public void getCountForFirstDays(int a) {
        int s = 0;
        for (int i = 0; i < a; i ++) {
            s += this.birds[i];
        }
        System.out.println("\t\tgetCountForFirstDays " +"'" + a + "'  => " + s);
    }

    public void getBusyDays() {
        int ct = 0;
        for (int i = 0; i < this.birds.length; i ++) {
            if (this.birds[i] >= 5) {
                ct++;
            }
        }
        System.out.println("\t\tgetBusyDays => " + ct);
    }

    public static void main(String[] args) {
        BirdWatcher.getLastWeek();

        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        birdCount.getToday();
        birdCount.incrementTodaysCount();
        birdCount.getToday();
        birdCount.hasDayWithoutBirds();
        birdCount.getCountForFirstDays(4);
        birdCount.getBusyDays();
    }
}
