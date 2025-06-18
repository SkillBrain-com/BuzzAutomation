package homework.CiovarnacheConstantinClaudiu.Java3.WizardsAndWarriors;

public class Wizard extends Fighter {
    private boolean spellPrepared = false;

    public void prepareSpell() {
        spellPrepared = true; // Task 3
    }

    @Override
    public boolean isVulnerable() {
        return !spellPrepared; // Task 4
    }

    @Override
    public int damagePoints(Fighter opponent) {
        // Task 5
        return spellPrepared ? 12 : 3;
    }
}
