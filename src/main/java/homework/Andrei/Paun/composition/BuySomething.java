package homework.Andrei.Paun.composition;

public class BuySomething {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("DELL Latitude","Made in China", "Dell Company" );
        Monitor monitor = new Monitor("Acer", "Made in UK", "Acer Company");
        laptop.setMonitor(monitor);
        laptop.setMonitor(new Monitor("Apple Smart 19", "Moldova", "Apple"));
        System.out.println(laptop.getMonitor());
        //System.out.println(laptop.getMouse());
        //System.out.println(laptop.getSsd());
        System.out.println(laptop);


    }
}
