package homework.Emanuel.Elon_sToycar_Java3;

public abstract class Vehicul implements TelecomandaLed {


    public String brend;
    public int distantaParcursa;
    public String numeTelecomanda;
    public int baterieDescarcata;
    public int distantaFoarteMare;

    public Vehicul(){
        brend = "AUDI";
        numeTelecomanda ="Maneta";
    }

    public static String ElonsToyCar(){
        return "Masina cumparata este: -->NOU-NOUTA!";
    }




    public void atentieDistantaMare(int distantaFoarteMare){
        this.distantaFoarteMare = distantaFoarteMare;
        System.out.println("Bateria este descarcata pentru ca ati mers: -->" + distantaFoarteMare + "METRI");
    }
    public void atentieBaterieDescarcata(){
        System.out.println("Atentie bateria este descarcata: -->" + baterieDescarcata);
    }







}
