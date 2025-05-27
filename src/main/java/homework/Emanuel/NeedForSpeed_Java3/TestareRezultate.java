package homework.Emanuel.NeedForSpeed_Java3;

public class TestareRezultate {

    public static void main(String[] args) {
//   1. ==> int speed = 5;
//      ==> int batteryDrain = 2;
        System.out.println( );
        System.out.println("                                                         ---->NEED FOR SPEED<----");
        System.out.println( );
        Ferari masina = new Ferari( 5, 2 );
        System.out.println( "Masina: -->" + masina.Marca("FERARI"));
        System.out.println("Viteza: -->" + masina.speed);
        System.out.println("Baterie scurgere: -->" + masina.baterryDrain);
//   2. ==> int distance = 800m;
        PistaDeCurse pistadecurse = new PistaDeCurse(0);
        pistadecurse.setDistantaPista(800);
        System.out.println("Distanta pistei de curse: -->" + pistadecurse.getDistantaPista() + " METRI.");
//   3. ==> DistanceDrive() = 5;
        Ferari car = new Ferari(5, 2);
        System.out.println("Numar metri parcursi: -->" + car.distanceDrive());
//   4. ==> BaterryDraine() = false;
        System.out.println("Baterie descarcata? -->" + car.baterryDraine());
//   5. ==> distanceDrive = 50m;
        Formula1 formula1 = new Formula1(50, 4);
        System.out.println("===============================");
        System.out.println("Masina: -->" + Formula1.marca());
        System.out.println("Viteza: -->" + formula1.viteza());
        System.out.println("Distanta drumului: -->" + Formula1.distantaDrumului());
        System.out.println("Baterie scurgere: -->" + formula1.baterieScurgere());
        System.out.println("Baterie descarcata? -->" + formula1.baterryDraine());
//   6. ==> Verificati daca o masina a trecut linia de sosire = true;
        System.out.println("===============================");
        System.out.println("                                                             LINIA DE SOSIRE:");
        Ferari linieDeSosire = new Ferari(5, 2);
        System.out.println("Ferari: -->" + linieDeSosire.liniaDeSosire());
        if(linieDeSosire.liniaDeSosire()){
            System.out.println("MASINA FERARI A REUSIT SA PARCURGA CEI 800 DE METRI FARA CA BATERIA SA SE DESCARCE!");
        }else{
            System.out.println("MASINA FERARI NU A REUSIT SA PARCURGA CEI 800 DE METRI PENTRU CA II SA DESCARCAT BATERIA!");
        }
        Formula1 liniaDeSosire2 = new Formula1(40, 4);
        System.out.println("Formula1: -->" + liniaDeSosire2.liniaDeSosire2());
        if(liniaDeSosire2.liniaDeSosire2()){
            System.out.println("MASINA FORMULA-1 A REUSIT SA PARCURGA CEI 800 DE METRI FARA CA BATERIA SA SE DESCARCE!");
        }else{
            System.out.println("MASINA FORMULA-1 NU A REUSIT SA PARCURGA CEI 800 DE METRI PENTRU CA II SA DESCARCAT BATERIA!");
        }
    }
}
