package homework.MihaiAlexe.WizardsAndWarriors;

public class Wizard extends Fighter {
    public boolean spellPrepared = false;

    public void prepareSpell() {
        spellPrepared = true;
    }

    @Override
    public boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";

    }
}
