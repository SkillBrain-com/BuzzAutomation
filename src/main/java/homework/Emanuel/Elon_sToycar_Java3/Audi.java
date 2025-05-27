package homework.Emanuel.Elon_sToycar_Java3;

public class Audi extends Vehicul implements ActualizareMetriSiDistanta{

    public int baterieAudi = 100;
    public int distantaActualizata = 40;


     public int baterieActualizata = baterieAudi - 2;





    @Override
    public void setDistantaParcursa() {
        System.out.println("Distanta parcursa afisata pe " + numeTelecomanda + " este: -->" + distantaParcursa + " METRI!");
    }
 // @Overload
    public void setDistantaParcursa(int distanta) {
        System.out.println("Distanta actualizata este: -->" + distantaActualizata + " METRI!");
    }

    @Override
    public void setProcentBaterie() {
        System.out.println("Bateria de la " + brend + " afisata pe ledul de la " + numeTelecomanda + " este: -->" + baterieAudi + "%");
    }
 // @Overload
    public void setProcentBaterie(int baterieActualizata) {
        this.baterieActualizata = baterieActualizata;
        System.out.println("Bateria, dupa ce a parcurs " + distantaActualizata + " de metri este: -->" + baterieActualizata + "%");
    }
}
