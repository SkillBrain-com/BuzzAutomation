package homework.edinita.javaPart3.javaPart3_1.exercises.WizardsandWarriors;

public class Runner {
    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        Fighter wizard = new Wizard();


        System.out.println(warrior);

        System.out.println(wizard.isVulnerable());
        System.out.println(wizard.prepareSpell());

        System.out.println(wizard.isVulnerable());

        Wizard wizard0 = new Wizard();
        Warrior warrior0 = new Warrior();

        System.out.println(wizard0.toString());

        System.out.println(wizard0.prepareSpell());
        System.out.println(wizard0.damagePoints(warrior0));


        Warrior warrior1 = new Warrior();
        Wizard wizard1 = new Wizard();

        System.out.println(warrior1.damagePoints(wizard1));
    }
}
