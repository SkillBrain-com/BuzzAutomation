package homework.SamuelH.Java3;

public class Warrior extends Fighter {

    @Override
    public int damagePoints(Fighter opponent) {
        return opponent.isVulnerable() ? 9 : 5;
    }
}