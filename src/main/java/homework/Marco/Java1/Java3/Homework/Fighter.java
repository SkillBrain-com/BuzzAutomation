package Java3.Homework;

public class Fighter {

    public boolean isVulnerable() {
        return false;
    }

    public int damagePoints(Fighter fighter) {
        return 0; // To be overridden by subclasses
    }

    @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }
}
