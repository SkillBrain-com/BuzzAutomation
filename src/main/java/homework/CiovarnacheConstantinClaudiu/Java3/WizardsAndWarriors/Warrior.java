package homework.CiovarnacheConstantinClaudiu.Java3.WizardsAndWarriors;

public class Warrior extends Fighter {

    @Override
    public boolean isVulnerable() {
        return false; // Task 2
    }

    @Override
    public int damagePoints(Fighter opponent) {
        // Task 6
        return opponent.isVulnerable() ? 10 : 6;
    }
}
