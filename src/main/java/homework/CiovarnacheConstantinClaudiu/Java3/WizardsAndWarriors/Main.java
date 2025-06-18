package homework.CiovarnacheConstantinClaudiu.Java3.WizardsAndWarriors;

public class Main {
    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        Fighter wizard = new Wizard();

        System.out.println(warrior);  // => "Fighter is a Warrior"
        System.out.println(wizard);   // => "Fighter is a Wizard"

        System.out.println("Is warrior vulnerable? " + warrior.isVulnerable()); // false
        System.out.println("Is wizard vulnerable? " + wizard.isVulnerable());   // true

        ((Wizard) wizard).prepareSpell();
        System.out.println("Wizard prepared a spell.");

        System.out.println("Is wizard vulnerable now? " + wizard.isVulnerable()); // false

        System.out.println("Wizard attacks warrior: " + wizard.damagePoints(warrior)); // 12
        System.out.println("Warrior attacks wizard: " + warrior.damagePoints(wizard)); // 10
    }
}
