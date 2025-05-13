package homework.edinita.javaPart2.extraExercises;
/*

// 1. Check if a fast attack can be made
// Implement the (static) AnnalynsInfiltration.canFastAttack() method that takes a boolean value that indicates if the knight is awake.
// This method returns true if a fast attack can be made based on the state of the knight. Otherwise, returns false:

//boolean knightIsAwake = true;
//AnnalynsInfiltration.canFastAttack(knightIsAwake);
// => false

// 2. Check if the group can be spied upon
// Implement the (static) AnnalynsInfiltration.canSpy() method that takes three boolean values, indicating if the knight,
archer and the prisoner, respectively, are awake.
// The method returns true if the group can be spied upon, based on the state of the three characters. Otherwise, returns false:

//boolean knightIsAwake = false;
//boolean archerIsAwake = true;
//boolean prisonerIsAwake = false;
//AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
// => true

// 3. Check if the prisoner can be signalled
// Implement the (static) AnnalynsInfiltration.canSignalPrisoner() method that takes two boolean values,
indicating if the archer and the prisoner, respectively, are awake.
// The method returns true if the prisoner can be signalled, based on the state of the two characters. Otherwise, returns false:

//boolean archerIsAwake = false;
//boolean prisonerIsAwake = true;
//AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake);
// => true

// 4. Check if the prisoner can be freed
// Implement the (static) AnnalynsInfiltration.canFreePrisoner() method that takes four boolean values.
// The first three parameters indicate if the knight, archer and the prisoner, respectively, are awake.
// The last parameter indicates if Annalyn's pet dog is present.
// The method returns true if the prisoner can be freed based on the state of the three characters and Annalyn's pet dog presence.
Otherwise, it returns false:

//boolean knightIsAwake = false;
//boolean archerIsAwake = true;
//boolean prisonerIsAwake = false;
//boolean petDogIsPresent = false;
//AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
// => false
 */
public class AnnalynsInfiltration {
    public void canFastAttack(boolean knightIsAwake){
        if (knightIsAwake == true){
            System.out.printf("\t\tcanFastAttack=> false" + "\n");
        }
        else {
            System.out.printf("\t\tcanFastAttack=> true" + "\n");
        }
    }

    public void canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake){
        if (knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true){
            System.out.printf("\t\tcanSpy=> true" + "\n");
    }else {
            System.out.printf("\t\tcanSpy=> false" + "\n");
        }

    }

    public void canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake){
        if (archerIsAwake == false || prisonerIsAwake == true){
            System.out.printf("\t\tcanSignalPrisoner=> true" + "\n");
        }else {
            System.out.printf("\t\tcanSignalPrisoner=> false" + "\n");
        }
    }

    public void canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent){
        if (archerIsAwake == false && petDogIsPresent == true){
            System.out.printf("\t\tcanFreePrisoner=> true" + "\n");
        }else {
            System.out.printf("\t\tcanFreePrisoner=> false" + "\n");
        }

        if (petDogIsPresent == false && knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true){
            System.out.printf("\t\tcanFreePrisoner=> true" + "\n");
        } else {
            System.out.printf("\t\tcanFreePrisoner=> false" + "\n");
        }
    }




    public static void main(String[] args) {
        AnnalynsInfiltration annalynsInfiltration = new AnnalynsInfiltration();
        boolean knightIsAwake = false;
        annalynsInfiltration.canFastAttack(knightIsAwake);

        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        annalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);

        annalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake);

        boolean petDogIsPresent = false;
        annalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);


    }
}
