package homework.PaulaVasiliu.javabascis2;

public class Control {


    public static void main(String[] args) {


//        boolean canDriver = true;

//        if (canDriver == true) {
//            System.out.println("Yes I can drive!");
//        }
//
//        if (canDriver) {
//            System.out.println("Yes I can drive!");
//        }
//     flow control
//        if (9 > 10) {
//            System.out.println("True!");
//        } else if (9 < 10 || 9 < 6) {
//            System.out.println("9 is between 6 and 10.");
//        } else {
//            System.out.println("False!");
//        }
//        boolean isTrue = false;
//        if (isTrue == true) {
//            System.out.println("Yes!");
//        } else {
//            System.out.println("No!");
//        }

//        System.out.println(isTrue == true ? "Yes of course!" : "No !!1!!!" );

        String today = "MaRtI";

        switch (today.toLowerCase()) {
            case "luni":
                System.out.println("mergem la plimbare");
                break;
            case "marti":
                System.out.println("Facem teme :(");
                break;
            case "vineri":
                System.out.println("Petrecem!");
                break;
            default:
                System.out.println("E timpul saptamanii");

        }




    }


}
