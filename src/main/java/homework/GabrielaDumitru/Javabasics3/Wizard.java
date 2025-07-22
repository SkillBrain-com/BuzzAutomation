package homework.GabrielaDumitru.Javabasics3;

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
    public int damagePoints(Fighter fighter) {
        if (spellPrepared) {
            return 12;
        }
        return 3;
    }
}
