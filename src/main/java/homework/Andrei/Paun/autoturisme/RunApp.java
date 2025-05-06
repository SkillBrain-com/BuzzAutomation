package homework.Andrei.Paun.autoturisme;

public class RunApp {
    public static void main(String[] args) {

        Vapor vapor = new Vapor("Croaziera", "Royal Caribbean International", "Diesel-electrică",
                225.282, 6780, "22 noduri", "362 metri");

        Avion avion = new Avion("Airbus 500", 2025, "Kerosene", 850,
                "Emirates");

        Tractor tractor = new Tractor("John Deere", "8R 410", 2023, "Automata PowerShift");


        System.out.println(vapor);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(avion);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(tractor);
    }





   }




