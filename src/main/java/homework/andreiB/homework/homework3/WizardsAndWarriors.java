package homework.andreiB.homework.homework3;


abstract class Fighter {
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }
    public boolean isVulnerable() {
        return false;
    }
    public abstract int damagePoints(Fighter fighter);
}

class Warrior extends Fighter {
    public int damagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        }
        return 6;
    }
}

class Wizard extends Fighter {
    private boolean spellPrepared = false;
    public void prepareSpell() {
        spellPrepared = true;
    }
    public boolean isVulnerable() {
        return !spellPrepared;
    }
    public int damagePoints(Fighter fighter) {
        if (spellPrepared) {
            return 12;
        }
        return 3;
    }
}

public class WizardsAndWarriors {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();
        System.out.println(warrior.toString());
        System.out.println(warrior.isVulnerable());
        System.out.println(wizard.toString());
        System.out.println(wizard.isVulnerable());
        wizard.prepareSpell();
        System.out.println(wizard.isVulnerable());
        System.out.println(wizard.damagePoints(warrior));
        System.out.println(warrior.damagePoints(wizard));
    }
}
