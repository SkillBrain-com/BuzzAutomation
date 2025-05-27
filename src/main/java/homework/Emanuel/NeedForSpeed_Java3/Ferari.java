package homework.Emanuel.NeedForSpeed_Java3;

public class Ferari extends Vehicule{
    public int baterie = 100;

    public String Marca (String brend){
        return brend;
    }

    Ferari(int speed, int baterryDrain) {
        super(speed, baterryDrain);
    }

    @Override
    public int drive(){
       int metriParcusi = speed;
        return metriParcusi;
    }

    @Override
    public int distanceDrive(){
        return drive();
    }

    @Override
    public boolean baterryDraine() {
        int bateriaMasiniRamase = baterryDrain;
        int baterieScazuta = 0;
        return baterieScazuta > bateriaMasiniRamase ;
    }

    public boolean liniaDeSosire(){
        int pista = 800;
        int distanta = 5;
        int descarcareBaterie = 2;
        int x = baterie / descarcareBaterie;     //50
        int XY = x * distanta;
        return XY > pista;
    }
}
