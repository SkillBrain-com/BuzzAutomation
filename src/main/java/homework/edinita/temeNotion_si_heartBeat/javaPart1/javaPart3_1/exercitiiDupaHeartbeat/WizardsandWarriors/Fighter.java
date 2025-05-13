package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_1.exercitiiDupaHeartbeat.WizardsandWarriors;

public interface Fighter {
    public String toString();
    public boolean isVulnerable();
    public boolean prepareSpell();
    public int damagePoints(Warrior warrior);
    public int damagePoints(Wizard wizard);
}
