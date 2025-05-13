package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_1.exercitiiDupaHeartbeat.WizardsandWarriors;

public class Wizard implements Fighter{
    private boolean isVulnerable = true;
    private boolean prepareSpell = false;
    private int atackDamage;


    @Override
    public String toString() {
        return "\t\tFighter is a Wizard";
    }
    @Override
    public boolean isVulnerable() {
        System.out.println("Vulnerable:");
        return isVulnerable;
    }

    @Override
    public boolean prepareSpell() {
        isVulnerable = false;
        prepareSpell = true;
        System.out.println("PreparedSpell:");
        return prepareSpell;
    }

    @Override
    public int damagePoints(Warrior warrior) {
        if (!isVulnerable) {
            atackDamage = 12;
            System.out.println("Attack :: Not vulnerable ::, so damage is //=> ");
            return atackDamage;
        } else {
            atackDamage = 3;
            System.out.println("Attack :: Much vulnerable ::, so damage is //=> ");
            return  atackDamage;
        }
    }

    @Override
    public int damagePoints(Wizard wizard) {
        return 0;
    }


    public boolean getIsVulnerable() {
        return isVulnerable;
    }


}
