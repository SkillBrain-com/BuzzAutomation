package Javabasics3;

public class TestTheFunctionalityWW {
    public static void main(String[] args) {

        Fighter warrior = new Warrior();
        System.out.println(warrior.toString());
        System.out.println(warrior.isVulnerable());
        System.out.println(warrior.damagePoints(new Wizard()));

        Fighter wizard = new Wizard();
        System.out.println(wizard.toString());
        System.out.println(wizard.isVulnerable());

        ((Wizard) wizard).prepareSpell();
        System.out.println(wizard.isVulnerable());
        System.out.println(((Wizard) wizard).damagePoints(new Warrior()));

        ((Wizard) wizard).prepareSpell();
        System.out.println(((Wizard) wizard).damagePoints(new Warrior()));
    }
}
