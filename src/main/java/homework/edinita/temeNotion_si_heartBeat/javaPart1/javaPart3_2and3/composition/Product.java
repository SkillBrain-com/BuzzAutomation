package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.composition;

public class Product {
    private String model;
    private String manufacturer;
    private String company;
    private int gurantee = 2;
    private double priceRecomandedByCompany = 100;





    public Product(String model, String manufacturer, String company){
        this.model = model;
        this.manufacturer = manufacturer;
        this.company = company;
    }

//    public Product(String model, String manufacturer, String company, String gurantee, double priceRecomandedByShop){
//        this.model = model;
//        this.manufacturer = manufacturer;
//        this.company = company;
//        this.gurantee = gurantee;
//        this.priceRecomandedByCompany = priceRecomandedByShop;
//    }


    public void setPriceRecomandedByCompany(double priceRecomandedByCompany) {
        this.priceRecomandedByCompany = priceRecomandedByCompany;
    }

    public void model() {
        System.out.println("\t\tModelul cumparat este: " + model);
    }

    public void company() {
        System.out.println("Compania care a produs modelul " + model + " este: " + company );
    }


    public  void  manufacturer() {
        System.out.println("\t\tFabrica se afla in Romania in judetul Timis cu denumirea" + manufacturer);
    }


    public  void guarantee(double priceByShop) {
        if(priceRecomandedByCompany < priceByShop) {
            gurantee = 4;
            System.out.println("\t\tGarantia produsului va fi marita cu 2 ani deoarece " +
                    "costa mai mult decat pretul recomandat de producator si va fi :" + gurantee + " ani");
        }else {
            System.out.println("\t\tGarantia va fi de : " + gurantee + " ani");

        }

    }

}
