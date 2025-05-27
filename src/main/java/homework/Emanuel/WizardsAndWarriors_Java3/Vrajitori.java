package homework.Emanuel.WizardsAndWarriors_Java3;

public class Vrajitori extends Luptatori{

    private int dauneInamicVrajaInAvans;
    private int dauneInamicVrajaNuEsteinAvans;

    @Override
    public String totring() {
        return "Numele meu este Miracol si sunt un vrajitor!";
    }

    @Override
    public boolean isVulnerable() {
        return true;
    }

    @Override
    public int provocariLuptatoriNuSuntInAvns() {
        return dauneInamicVrajaNuEsteinAvans;
    }
    @Override
    public int provocariLuptatoriInAvans() {
        return dauneInamicVrajaInAvans;
    }

    protected String preparareVrajaAvans(){
        return "Vrajitorilor ii sa permis sa faca o vraja in avans care va avea un atac de " + dauneInamicVrajaInAvans + " puncte.";
    }

    Vrajitori(int viataLuptator, String numeLuptator, int dauneInamicVrajaInAvans, int dauneInamicVrajaNuEsteinAvans) {
        this.viataLuptator = viataLuptator;
        this.numeLuptator = numeLuptator;
        this.dauneInamicVrajaInAvans = dauneInamicVrajaInAvans;
        this.dauneInamicVrajaNuEsteinAvans = dauneInamicVrajaNuEsteinAvans;
    }
}
