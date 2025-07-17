package homework.PasaricaAndrei.Ex1.Ex3;



class Fighter {
    public boolean isVulnerable() {
        return false;
    }

    public int damagePoints(Fighter opponent) {
        return 1; // 0 pentru ex6
    }

    @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }
}

class Warrior extends Fighter {

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int damagePoints(Fighter opponent) {
        return opponent.isVulnerable() ? 10 : 6;
    }
}
class Wizard extends Fighter {
    private boolean spellPrepared;

    public void prepareSpell() {
        this.spellPrepared = true;
    }

    @Override
    public boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    public int damagePoints(Fighter opponent) {
        return spellPrepared ? 12 : 3;
    }
}


