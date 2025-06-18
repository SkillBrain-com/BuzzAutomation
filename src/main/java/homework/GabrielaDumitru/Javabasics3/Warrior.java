package homework.GabrielaDumitru.Javabasics3;

public class Warrior extends Fighter {

    @Override
    public int damagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        }
        return 6;
    }

}
