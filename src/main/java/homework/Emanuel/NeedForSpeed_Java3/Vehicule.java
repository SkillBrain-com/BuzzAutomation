package homework.Emanuel.NeedForSpeed_Java3;

public abstract class Vehicule {

    public int speed;
    public int baterryDrain;

    public abstract int drive();

    public abstract int distanceDrive();

    public abstract boolean baterryDraine();

    Vehicule(int speed, int baterryDrain){
        this.speed = speed;
        this.baterryDrain = baterryDrain;
    }
}
