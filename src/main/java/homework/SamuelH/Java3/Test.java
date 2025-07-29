package homework.SamuelH.Java3;

public class Test {
    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        System.out.println(warrior.toString());         // Fighter is a Warrior
        System.out.println(warrior.isVulnerable());     // false

        Wizard wizard = new Wizard();
        System.out.println(wizard.isVulnerable());      // true
        wizard.prepareSpell();
        System.out.println(wizard.isVulnerable());      // false

        System.out.println("Wizard attacks Warrior: " + wizard.damagePoints(warrior));  // 12
        System.out.println("Warrior attacks Wizard: " + warrior.damagePoints(wizard));  // 10
    }
}