package homework.MihaiAlexe.Java3.WizardsAndWarriors;

public class MainWizardsAndWarriors {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        System.out.println(fighter);

        Fighter warrior = new Warrior();
        System.out.println(warrior);
        System.out.println(warrior.isVulnerable());

        Fighter wizard = new Wizard();
        System.out.println(wizard);
        System.out.println(wizard.isVulnerable());

        Wizard actualWizard = new Wizard();
        actualWizard.prepareSpell();
        System.out.println(actualWizard.isVulnerable());
    }
}

