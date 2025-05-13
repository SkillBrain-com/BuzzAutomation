package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.interfaceandabstract;

public class Paracetamol implements Prospect{
    @Override
    public String informatiiProspect() {
        System.out.println(numarPagProspect);
        return "Paracetamolul nu se ia pe stomacul gol si se tine cont de un interval de 4h intre pastile";
    }
}
