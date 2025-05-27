package homework.Emanuel.Elon_sToycar_Java3;

public class TestVehicul {

    public static void main(String[] args) {
        System.out.println( );
        System.out.println("                                             ---->MASINUTA DE JUCARIE A LUI ELON!<----");
        System.out.println( );
        Audi vehicul = new Audi();
        System.out.println("Masina: -->" + vehicul.brend + "!");
        // 1. Implementați metoda (statică) ElonsToyCar.buy() pentru a returna o instanță de mașină cu telecomandă nou-nouță:
        System.out.println("============================");
        System.out.println(vehicul.ElonsToyCar());
        //2. Implementați metoda ElonsToyCar.distanceDisplay() pentru a returna distanța așa cum este afișată pe afișajul LED:
        System.out.println("============================");
        vehicul.setDistantaParcursa();
        //3.
        // => "Battery at 100%"
        System.out.println("============================");
        vehicul.setProcentBaterie();
        //4.
        // => "Parcurs 40 de metri"
        System.out.println("============================");
        vehicul.setDistantaParcursa(40);
        //5.
        // => "Baterie 98%"
        System.out.println("============================");
        vehicul.setProcentBaterie(98);
        //6.
        // => "Parcurs 2000 de metri"
        // => "Baterie descarcata"
        System.out.println("============================");
        vehicul.atentieDistantaMare(2000);
        vehicul.atentieBaterieDescarcata();
        System.out.println("Bateria trebuie pusa la incarcat! :) ");
    }
}
