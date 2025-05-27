package homework.Emanuel.NeedForSpeed_Java3;

public class Formula1 extends Vehicule{

    public int baterie = 100;
    public static int viteza = 50;
    public static int baterieDescarcare = 4;

    public static String marca(){
        return "FORMULA-1";
    }
    public static int distantaDrumului(){
        return viteza;
    }

    public int viteza(){
        return viteza;
    }

    public int baterieScurgere(){
        return baterieDescarcare;
    }

    Formula1(int speed, int baterryDrain) {
        super(speed, baterryDrain);
    }

    @Override
    public int drive() {
        return 0;
    }

    @Override
    public int distanceDrive() {
        return 0;
    }

    @Override
    public boolean baterryDraine() {
        int baterieRamasa = baterieDescarcare - baterie;
        return baterie < baterieRamasa;
    }

    public boolean liniaDeSosire2(){
        int pista = 800;
        int distanta = 50;
        int descarcareBaterie = 4;
        int x = baterie / descarcareBaterie;  //25
        int XY = distanta * x;
        return XY > pista;
    }
}
