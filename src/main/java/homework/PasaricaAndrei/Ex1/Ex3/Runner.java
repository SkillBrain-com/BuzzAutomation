package homework.PasaricaAndrei.Ex1.Ex3;


public class Runner {
    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        Wizard wizard = new Wizard();

        //1
        System.out.println(warrior.toString()); // Fighter este un Warrior
        System.out.println(wizard.toString());  // Fighter este un Wizard

        System.out.println("Wizard vulnerable? " + wizard.isVulnerable()); // adev
        System.out.println("Warrior damage to Wizard: " + warrior.damagePoints(wizard)); // 10
        System.out.println("Wizard damage to Warrior: " + wizard.damagePoints(warrior)); // 3

        wizard.prepareSpell();

        System.out.println("Wizard vulnerable after spell? " + wizard.isVulnerable()); // fals
        System.out.println("Wizard damage to Warrior after spell: " + wizard.damagePoints(warrior)); // 12

        System.out.println("----------------------2---------------------");
        // 2
        System.out.println(warrior.isVulnerable());  // fals

        System.out.println(wizard.isVulnerable());   // adev dupa override
        wizard.prepareSpell();
        System.out.println(wizard.isVulnerable());   // fals

        System.out.println("----------------------3---------------------");
        //3
        System.out.println(wizard.isVulnerable()); // adev
        System.out.println("Damage: " + wizard.damagePoints(new Fighter())); // 3

        wizard.prepareSpell();

        System.out.println(wizard.isVulnerable()); // fals
        System.out.println("Damage: " + wizard.damagePoints(new Fighter())); // 12

        System.out.println("----------------------4---------------------");
        //4
        System.out.println(wizard.isVulnerable()); // adev

        ((Wizard) wizard).prepareSpell();
        System.out.println(wizard.isVulnerable()); // fals

        System.out.println("---------------------5--------------------");
        //5
        System.out.println("Damage fără vrajă: " + wizard.damagePoints(warrior)); // 3

        wizard.prepareSpell();
        System.out.println("Damage cu vrajă: " + wizard.damagePoints(warrior)); // 12

        System.out.println("-------------------6---------------------");
        //6
        System.out.println("Damage dealt to wizard (vulnerable): " + warrior.damagePoints(wizard)); // 10

        wizard.prepareSpell();
        System.out.println("Damage dealt to wizard (not vulnerable): " + warrior.damagePoints(wizard)); // 6
    }
}




