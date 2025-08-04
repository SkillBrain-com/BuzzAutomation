package homework.Marco.Java3.Homework;

public class Main {

    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        System.out.println(warrior);
        System.out.println(warrior.isVulnerable());

        Wizard wizard = new Wizard();
        System.out.println(wizard.isVulnerable());
        wizard.prepareSpell();
        System.out.println(wizard.isVulnerable());

        System.out.println(wizard.damagePoints(warrior));
        System.out.println(warrior.damagePoints(wizard));
    }
}

