package homework.edinita.javaPart3.javaPart3_1.exercises.WizardsandWarriors;

public class Warrior implements Fighter{
    private int atackDamage;

    @Override
    public String toString() {
        return "\t\t//=> Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public boolean prepareSpell() {
        return false;
    }

    @Override
    public int damagePoints(Warrior warrior) {
        return 0;
    }

    @Override
    public int damagePoints(Wizard wizard) {
        if (wizard.getIsVulnerable()) {
            atackDamage = 10;
            System.out.println("Attack :: Not vulnerable ::, so damage is //=> ");
            return atackDamage;
        } else {
            atackDamage = 3;
            System.out.println("Attack :: Much vulnerable ::, so damage is //=> ");
            return  atackDamage;
        }
    }
}
