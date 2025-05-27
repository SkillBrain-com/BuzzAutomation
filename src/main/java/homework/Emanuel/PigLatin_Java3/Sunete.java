package homework.Emanuel.PigLatin_Java3;

public abstract class Sunete {

    public String sunetVocalic;
    public String sunetVocalic2;
    public String sunet;
    public String sunetConsonaticurmat;





    public abstract String adaugareaSunetului();


    Sunete(String sunetVocalic, String sunetVocalic2, String sunet, String sunetConsonat){
        this.sunetVocalic = sunetVocalic;
        this.sunetVocalic2 = sunetVocalic2;
        this.sunet = sunet;
        this.sunetConsonaticurmat = sunetConsonat;
    }
}



