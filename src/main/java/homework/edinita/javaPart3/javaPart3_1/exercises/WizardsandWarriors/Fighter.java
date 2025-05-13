package homework.edinita.javaPart3.javaPart3_1.exercises.WizardsandWarriors;

public interface Fighter {
    public String toString();
    public boolean isVulnerable();
    public boolean prepareSpell();
    public int damagePoints(Warrior warrior);
    public int damagePoints(Wizard wizard);
}
