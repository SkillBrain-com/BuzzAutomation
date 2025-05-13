package homework.edinita.javaPart3.javaPart3_2and3.tema;

public class MijloaceDeTransport {
    private String vitezaRidicata;
    private String vitezaModerata;
    private String vitezaVariabila;


    private String capacitateMare;
    private String capacitateVariabila;



    private String consumRidicat;
    private String consumVariabil;



    private String tehnologieAvansata;
    private String tehnologieSpecializata;
    private String tehnologieVariata;



    private String costRidicat;
    private String costVariat;


    public String getVitezaRidicata() {
        return vitezaRidicata;
    }

    public void setVitezaRidicata(String vitezaRidicata) {
        this.vitezaRidicata = vitezaRidicata;
    }

    public String getVitezaModerata() {
        return vitezaModerata;
    }

    public void setVitezaModerata(String vitezaModerata) {
        this.vitezaModerata = vitezaModerata;
    }

    public String getVitezaVariabila() {
        return vitezaVariabila;
    }

    public void setVitezaVariabila(String vitezaVariabila) {
        this.vitezaVariabila = vitezaVariabila;
    }

    public String getCapacitateMare() {
        return capacitateMare;
    }

    public void setCapacitateMare(String capacitateMare) {
        this.capacitateMare = capacitateMare;
    }

    public String getCapacitateVariabila() {
        return capacitateVariabila;
    }

    public void setCapacitateVariabila(String capacitateVariabila) {
        this.capacitateVariabila = capacitateVariabila;
    }

    public String getConsumRidicat() {
        return consumRidicat;
    }

    public void setConsumRidicat(String consumRidicat) {
        this.consumRidicat = consumRidicat;
    }

    public String getConsumVariabil() {
        return consumVariabil;
    }

    public void setConsumVariabil(String consumVariabil) {
        this.consumVariabil = consumVariabil;
    }

    public String getTehnologieAvansata() {
        return tehnologieAvansata;
    }

    public void setTehnologieAvansata(String tehnologieAvansata) {
        this.tehnologieAvansata = tehnologieAvansata;
    }

    public String getTehnologieSpecializata() {
        return tehnologieSpecializata;
    }

    public void setTehnologieSpecializata(String tehnologieSpecializata) {
        this.tehnologieSpecializata = tehnologieSpecializata;
    }

    public String getTehnologieVariata() {
        return tehnologieVariata;
    }

    public void setTehnologieVariata(String tehnologieVariata) {
        this.tehnologieVariata = tehnologieVariata;
    }

    public String getCostRidicat() {
        return costRidicat;
    }

    public void setCostRidicat(String costRidicat) {
        this.costRidicat = costRidicat;
    }

    public String getCostVariat() {
        return costVariat;
    }

    public void setCostVariat(String costVariat) {
        this.costVariat = costVariat;
    }


    @Override
    public String toString() {
        return "MijloaceDeTransport{" +
                "vitezaRidicata='" + vitezaRidicata + '\'' +
                ", vitezaModerata='" + vitezaModerata + '\'' +
                ", vitezaVariabila='" + vitezaVariabila + '\'' +
                ", capacitateMare='" + capacitateMare + '\'' +
                ", capacitateVariabila='" + capacitateVariabila + '\'' +
                ", consumRidicat='" + consumRidicat + '\'' +
                ", consumVariabil='" + consumVariabil + '\'' +
                ", tehnologieAvansata='" + tehnologieAvansata + '\'' +
                ", tehnologieSpecializata='" + tehnologieSpecializata + '\'' +
                ", tehnologieVariata='" + tehnologieVariata + '\'' +
                ", costRidicat='" + costRidicat + '\'' +
                ", costVariat='" + costVariat + '\'' +
                '}';
    }
}
