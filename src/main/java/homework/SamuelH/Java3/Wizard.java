package homework.SamuelH.Java3;

public class Wizard extends Fighter {

    private boolean spellPrepared = false;

    public void prepareSpell() {
        spellPrepared = true;
    }

    @Override
    public boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    public int damagePoints(Fighter opponent) {
        return spellPrepared ? 11 : 4;
    }
}