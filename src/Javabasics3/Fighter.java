package Javabasics3;

public abstract class Fighter {

    @Override
    public String toString () {
        return "Fighter is a " + this.getClass().getSimpleName();
    }

    public boolean isVulnerable() {
        return false;
    }

    public abstract int damagePoints (Fighter fighter);

}
