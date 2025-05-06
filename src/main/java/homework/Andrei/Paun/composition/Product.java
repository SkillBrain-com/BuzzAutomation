package homework.Andrei.Paun.composition;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Product {

    private String model;

    private String manufacturer;

    private String company;

    private int garantee = 2;

    private double priceRecommandedByCompany = 1000;

    public Product(String model, String manufacturer, String company) {
        this.model = model;
        this.company = company;
        this.manufacturer = manufacturer;
    }

    public void setPriceRecommandedByCompany(double priceRecommandedByCompany) {
        this.priceRecommandedByCompany = priceRecommandedByCompany;
    }
    public void model(){
        System.out.println("Modelul cumparat este: " + model );
    }

    public void company(){
        System.out.println("Compania care a produs modelul " + model + " este " + company );
    }

    public void manufacturer(){
        System.out.println("Fabrica se afla in Romania in judetul Cluj cu denumirea " + manufacturer );
    }

    public void garantee(double priceFromShop){
        if (priceRecommandedByCompany < priceFromShop){
            garantee = 4;
            System.out.println("Garantia produsului va fi marita cu 2 ani deoarece costa mai " +
                    "mult decat pretul recomandat de producator si va fi : " + garantee);

        }
        System.out.println("Garantia va fi de " + garantee);
    }



}
