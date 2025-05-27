package homework.Emanuel.WizardsAndWarriors_Java3;

public class Razboinici extends Luptatori {

    private int dauneInamicNuEsteVulnerabil;
    private int dauneInamicVulnerabil;

    @Override
    public String totring() {
        return "Numele meu este " + numeLuptator + " si sunt un razboinic";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    public int provocariLuptatoriNuSuntInAvns() {
        return dauneInamicNuEsteVulnerabil;
    }
    @Override
    public int provocariLuptatoriInAvans() {
        return dauneInamicVulnerabil;
    }

    Razboinici(int viataLuptator, String numeLuptator, int dauneInamicNuEsteVulnerabil, int dauneInamicVulnerabil ) {
        this.viataLuptator = viataLuptator;
        this.numeLuptator = numeLuptator;
        this.dauneInamicNuEsteVulnerabil = dauneInamicNuEsteVulnerabil;
        this.dauneInamicVulnerabil = dauneInamicVulnerabil;
    }
}
