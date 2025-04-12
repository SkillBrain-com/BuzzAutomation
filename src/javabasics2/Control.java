package javabasics2;

public class Control {

    public static void main(String[] args) {

        boolean canDrive = true;



//        if (9 < 10) {
//            System.out.println("True!");
//        }
//            else if ( 9 < 10 && 9 > 6) {
//            System.out.println("9 is between 6 and 10");
//            }
//        else {
//            System.out.println("Fals!");

//        boolean isTrue = true ;
//        if (isTrue == true) {
//            System.out.println("yes!");
//
//        }
//        else {
//            System.out.println("no!");
//        }
//        System.out.println(isTrue == true ? "yes of course!" : "No !!1!!!");


        String today = "marti";

        switch (today) {
            case "luni":
                System.out.println("mergem la plimbare");
                break;
            case "marti":
                System.out.println("facem teme : (");
                break;
            case "vineri":
                System.out.println("petrecem");
            default:
                System.out.println("e timpul saptamanii");
        }



        }






    }

