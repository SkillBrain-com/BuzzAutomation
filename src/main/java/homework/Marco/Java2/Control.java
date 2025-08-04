package homework.Marco.Java2;

public class Control {

    public static void main(String[] args) {

//        boolean canDriver = true;
//
//        if (canDriver == true) {
//            System.out.println("Yes,I can drive!");
//        }
//
//        if (canDriver) {
//            System.out.println("Yes,I can drive");
//        }
//
//        System.out.println(canDriver); //daca comentam codul de mai sus, ne va rezulta la output: true
//        System.out.println(!canDriver); //daca adaugam semnul "!", vom nega afirmatia

//        if(9 > 10) {
//            System.out.println("True!");
//        }else if (9 < 10 || 9 > 6) {
//            System.out.println("9 is between 6 and 10.");
//        } else {
//            System.out.println("False!");
//        }
//
//        boolean isTrue = true;
//        if (isTrue == true){
//            System.out.println("Yes!");
//        }else {
//            System.out.println("No! ");
//        }
//
//        System.out.println(isTrue == true ? "Yes!" : "No!");

        String today = "Marti";
        switch (today.toLowerCase()) {
            case "luni" :
                System.out.println("mergem la plimbare");
                break;
            case "marti" :
                System.out.println("Facem teme :(");
                break;
            case "vineri" :
                System.out.println("Petrecem!");
                break;
            default:
                System.out.println("E timpul saptamanii");

        }

    }

}
