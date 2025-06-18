package Java3.Homework;

public class Wizard extends Fighter{


    private boolean spellPrepared = false;

    public void prepareSpell() {
        this.spellPrepared = true;
    }

    @Override
    public boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    public int damagePoints(Fighter fighter) {
        return spellPrepared ? 12 : 3;
    }

    }

