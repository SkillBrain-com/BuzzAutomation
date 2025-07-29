package homework.Andrei.Paun.java3Homework;

public class WizardsAndWarriors {


        // Clasa abstractă de bază
        static abstract class Fighter {
            public boolean isVulnerable() {
                return false;
            }

            public abstract int damagePoints(Fighter target);

            @Override
            public String toString() {
                return "Fighter is a " + this.getClass().getSimpleName();
            }
        }

        // Clasa Wizard
        static class Wizard extends Fighter {
            private boolean spellPrepared = false;

            public void prepareSpell() {
                spellPrepared = true;
            }

            @Override
            public boolean isVulnerable() {
                return !spellPrepared;
            }

            @Override
            public int damagePoints(Fighter target) {
                return spellPrepared ? 12 : 3;
            }
        }

        // Clasa Warrior
        static class Warrior extends Fighter {
            @Override
            public int damagePoints(Fighter target) {
                return target.isVulnerable() ? 10 : 6;
            }
        }

        // Main pentru rulare în IntelliJ
        public static void main(String[] args) {
            Fighter warrior = new Warrior();
            System.out.println(warrior);  // "Fighter is a Warrior"
            System.out.println("Warrior vulnerable? " + warrior.isVulnerable());  // false

            Wizard wizard = new Wizard();
            System.out.println(wizard);  // "Fighter is a Wizard"
            System.out.println("Wizard vulnerable (before spell)? " + wizard.isVulnerable());  // true

            wizard.prepareSpell();
            System.out.println("Wizard vulnerable (after spell)? " + wizard.isVulnerable());  // false

            System.out.println("Wizard attacks Warrior: " + wizard.damagePoints(warrior));  // 12
            System.out.println("Warrior attacks Wizard: " + warrior.damagePoints(wizard));  // 10
        }
    }


