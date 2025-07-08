package Java3;

public abstract class Fighter {
    public boolean isVulnerable() {
        return false;
    }

    public abstract int damagePoints(Fighter opponent);

    @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }
}
