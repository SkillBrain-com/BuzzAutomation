package Java3.Homework;

public class Warrior extends Fighter {

    @Override
    public int damagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
}
