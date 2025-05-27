package homework.Emanuel.Homework_Java2;

public class JocInfiltrarea {

    public static void main(String[] args) {

        //Eroii
        String personajPrincipal = "Annalyn";
        String cainele = "Prot";
        String prietenaRapita = "Elizabet";

        //Raufacatorii
        String cavalerulPuternic = "Dark";
        String arcasulViclean = "Spin";

        System.out.println("PRIMA ACTIUNE");
        System.out.println("Sa verisicam daca cavalerul " + cavalerulPuternic + " este treaz sau nu:");
        AnnalynsInfiltrationcanfastatack();
        System.out.println("---------------------------------");
        System.out.println("A DOUA ACTIUNE:");
        System.out.println("Sa verificam daca raufacatori " + cavalerulPuternic + "," + arcasulViclean +
                           " si " + prietenaRapita + " sunt treji");
        AnnaylinsInfiltrationcanSpy();
        System.out.println("---------------------------------");
        System.out.println("A TREIA ACTIUNE");
        System.out.println("Sa verificam daca raufacatorul " + arcasulViclean + " si prizionerul " + prietenaRapita
                           + " sunt treji");
        AnnalynsInfiltrationCanSignalPrisoner();
        System.out.println("---------------------------------");
        System.out.println("A PATRA ACTIUNE");
        System.out.println("SA verifica daca cei doi raufacatori " + cavalerulPuternic + "," + arcasulViclean + " si "
                           + prietenaRapita + " sunt treji, iar daca cainele " + cainele + " este prezent cu " + personajPrincipal);
        AnnalynsInfiltrationCanFreePrisoner();
    }
    // 1. Verificati daca se poate face un atatc rapid: (return false)
    public static void AnnalynsInfiltrationcanfastatack(){
        boolean cavalertreaz = true;

        if(!cavalertreaz){
            System.out.println("Cavalerul se simte obosit si a adormit!");
        }else {
            System.out.println("Cavalerul nu se simte obosit si este treaz!");
        }
    }
    // 2. Verificati daca grupul poate fi spionat;     (return true)
    public static void AnnaylinsInfiltrationcanSpy() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;


        System.out.println(!knightIsAwake && archerIsAwake && !prisonerIsAwake == true? "Sunt treji!" : "Nu sunt treji");
    }
    // 3. Verificati daca prizionierul poate fi semnalizat:  (return true)
    public static void AnnalynsInfiltrationCanSignalPrisoner(){
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        if(!archerIsAwake && prisonerIsAwake == true){
            System.out.println("Cei doi sunt treji");
        }else{
            System.out.println("Cei doi nu sunt treji");
        }
    }
    // 4. Verificati daca prizionierul poate fi salvat si daca cainele este prezent: (return false)
    public static void AnnalynsInfiltrationCanFreePrisoner(){
        boolean knightIsAwake = false;
        boolean archerIsAwakec = true;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = false;

        if(knightIsAwake && !archerIsAwakec  &&  prisonerIsAwake || petDogIsPresent ){
            System.out.println("Cei trei sunt treji");
        }else {
            System.out.println("Cei trei nu sunt treji");
        }
        if(petDogIsPresent) {
            System.out.println("Cainele este prezent cu Annalyn");
        }else{
            System.out.println("Cainele nu este prezent cu Annalyn");
        }
    }
}
