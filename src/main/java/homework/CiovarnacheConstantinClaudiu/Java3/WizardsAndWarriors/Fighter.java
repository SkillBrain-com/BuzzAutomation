package homework.CiovarnacheConstantinClaudiu.Java3.WizardsAndWarriors;

public abstract class Fighter {
    public abstract boolean isVulnerable();

    public abstract int damagePoints(Fighter opponent);

    @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }
}
