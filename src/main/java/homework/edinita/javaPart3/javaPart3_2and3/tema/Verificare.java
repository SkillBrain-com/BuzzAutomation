package homework.edinita.javaPart3.javaPart3_2and3.tema;

import temeNotion_si_heartBeat.javaPart3_2and3.tema.aerian.Avion;
import temeNotion_si_heartBeat.javaPart3_2and3.tema.aerian.BalonCuAerCald;
import temeNotion_si_heartBeat.javaPart3_2and3.tema.aerian.Elicopter;
import temeNotion_si_heartBeat.javaPart3_2and3.tema.aerian.NavaSpatiala;
import temeNotion_si_heartBeat.javaPart3_2and3.tema.naval.Barca;

public class Verificare {
    public static void main(String[] args) {
        System.out.printf("-------------------------------------------------------------------------------------\n");

        System.out.printf("------------------------------------------A v i o a n e-------------------------------------------\n");

        Avion avion1 = new Avion(2020, 300, 450, 5000, 'D');
        System.out.println(avion1);
        System.out.println(avion1.tipAvion());


        System.out.printf("--------------------------------------------B a l o a n e _ C u _ A e r _ C a l d------------------------------------------\n");


        BalonCuAerCald balonCuAerCald = new BalonCuAerCald(6, 1080);
        System.out.println(balonCuAerCald);
        System.out.println(balonCuAerCald.tipBalonCuAerCald());

        System.out.printf("-------------------------------------------E l i c o p t e r e------------------------------------------\n");

        Elicopter elicopter = new Elicopter(2004, 2, 250, 5000);
        System.out.println(elicopter);
        System.out.println(elicopter.tipElicopter());


        System.out.printf("------------------------------------------N a v a _ S p a t i a l a-------------------------------------------\n");

        NavaSpatiala navaSpatiala = new NavaSpatiala(45000, 400);
        System.out.println(navaSpatiala);
        System.out.println(navaSpatiala.tipNavaSpatiala());

        System.out.printf("----------------------------------------B a r c a---------------------------------------------\n");

        Barca barca = new Barca("Titanic", 2000, 100);
        System.out.println(barca);
        barca.navigheazaPeMare();
        barca.navigheazaPeRaul();

    }
}
