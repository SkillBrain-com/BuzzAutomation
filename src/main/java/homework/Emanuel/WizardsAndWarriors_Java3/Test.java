package homework.Emanuel.WizardsAndWarriors_Java3;

public class Test {

    public static void main(String[] args) {
        System.out.println( );
        System.out.println("                                                       --->WIZARDS AND WARRIORS<---");
        System.out.println( );
//   1. ==> "Luptatorul este un Razboinic";
        Luptatori razboinici = new Razboinici(100,"Ateliums", 6, 10);
        System.out.println("Descriere luptator: -->" + razboinici.totring() + "!");
//   2. ==> false;
        System.out.println("Vulnerabilitate razboinic: -->" + razboinici.isVulnerable());
        Vrajitori vrajitori = new Vrajitori(100,"Miracol", 12, 3);
        System.out.println("Descriere luptator: -->" + vrajitori.totring());
//   3. ==> Permiterea vrajitorilor sa pregateasca o vraja;
        System.out.println("Atac: -->" + vrajitori.preparareVrajaAvans());
//   4. ==> true;
        System.out.println("Vulnerabilitate vrajitor: -->" + vrajitori.isVulnerable());
//   5. ==> 12;
//      ==> 3;
        System.out.println("                                                         RAZBOINICI vs VRAJITORI");
        System.out.println("Puterea atacului este de " + vrajitori.provocariLuptatoriInAvans() +
                           " atunci cand Vrajitorul a pregatit o vraja in avans.");
        System.out.println("Puterea atacului este de " + vrajitori.provocariLuptatoriNuSuntInAvns() +
                           " atunci cand Vrajitorul nu a pregatit o vraja in avans.");
//   6. ==> 10;
//      ==> 6;
        System.out.println("Puterea atacului este de " + razboinici.provocariLuptatoriInAvans() +
                           " atunci cand Razboinicul ataca inamicul vulnerabil.");
        System.out.println("Puterea atacului este de " + razboinici.provocariLuptatoriNuSuntInAvns() +
                           " atunci cand Razboinicul ataca inamicul care nu este vulnerabil. ");
    }
}
