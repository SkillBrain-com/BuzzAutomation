package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.composition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuySomething {
    public static void main(String[] args) {
        System.out.println(" \n\n--------------------------Crearea produselor------------------------------------------------\n\n");

        Laptop laptop = new Laptop("ZenBook 17", "Made in Iimis", "Asus");
        laptop. setMonitor (new Monitor ("Apple Smart 19", "Moldova", "Apple"));
        Mouse mouse = new Mouse("plus4873874" , "Indonezia" ,"HP");
        mouse.setDefaultColor ("blue");
        mouse.guarantee (10);
        laptop.setMouse(mouse);
        laptop.setSdd(new SSD("3489723783", "made in China", "KingStone"));
        System.out. println(laptop);


        Xbox xbox = new Xbox ("PS4" ,"made in China", "pS");
        xbox.setResolution("1920x1920");
        xbox. setGamingGPU("40GB");
        xbox.setNumberOfControllers ("4");
        xbox.setMonitor(new Monitor ("Apple Smart 19", "Moldava", "Apple"));
        xbox.setMouse(new Mouse("plus4B73874", "Angonezio", "HP"));
        xbox.setKeyboard(new Keyboard("dfedvaf" ,"indonna", "HP"));
        System.out.println(xbox);



        Laptop laptop1 = new Laptop ("ZenBook 17", "Made in Timis", "Asus");
        laptop. setMonitor (new Monitor("Apple Smart 19", "Moldova", "Apple"));
        Mouse mouse1 = new Mouse("plus4873874" ,"Indonezia","DeLU");
        mouse1.setDefaultColor ("blue");
        mouse1.guarantee (1000);
        laptop.setMouse(mouse1);
        laptop.setSdd(new SSD("3489723783", "made in China", "KingStone"));


        System.out.println("\n\n ---------------------------------------Listarea produselor dintro lista de products----------------------------------- \n\n");


        List<Product> products = new ArrayList<>();

        products.add(laptop);
        products.add(mouse);
        products.add(xbox);

        for (Product product : products) {
            System.out.println(product);
        }


        List<Product> products1 = List.of(xbox, mouse, laptop);
        products1.add(laptop1);
        System.out.println(products1);
        for (Product product: products1){
            System.out.println("\n\n ---------------------------------------Listarea produselor dintro lista de products creata cu List.of() ----------------------------------- \n\n");
            System.out.println(product);
        }

        Product [] products2 = {xbox, mouse, laptop};
        List<Product> products3 = Arrays.asList(laptop1, laptop);
        System.out.println(products3);
        products3.set(1, xbox);
        System.out.println(products3);
    }
}
