package homework.edinita.javaPart3.javaPart3_2and3.composition;

public class Monitor extends Product{
    private String diagonal;
    private String rezolution;
    private String typeOfImage;



    public Monitor(String model, String manufacturer, String company) {
        super(model, manufacturer, company);
        this.diagonal = "21";
        this.rezolution = "1980x1281";
        this.typeOfImage = "Oled HiVision";
    }


    public String getDiagonal() {
        return diagonal;
    }

    public String getRezolution() {
        return rezolution;
    }

    public String getTypeOfImage() {
        return typeOfImage;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "diagonal='" + diagonal + '\'' +
                ", rezolution='" + rezolution + '\'' +
                ", typeOfImage='" + typeOfImage + '\'' +
                '}';
    }
}
