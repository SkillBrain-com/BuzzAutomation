package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_1;

public class Ex {
    public static void main(String[] args) {

        hasEqualSum(1,1,1); //false
        hasEqualSum(1,1,2); //true
        hasEqualSum(1,-1,0); //true




        hasTeen(9, 99, 19); //true
        hasTeen(23, 15, 42); //true
        hasTeen(22, 23, 34); //false


        isTeen(9); //false
        isTeen(13); //true


        multiplierPerDaysSkipped(3); //1
        multiplierPerDaysSkipped(7); //0.85


        multiplierPerProductsSold(21); //13
        bonusForProductSold(5); //50


        finalSalary(2,3); //1030


        salariuPerZi(2000);
        salariuPerSaptamana(2000);
    }


    public static boolean hasEqualSum (int a, int b, int c) {
        int sum = 0;

        sum = a + b;

        if(sum == c) {
            System.out.println("true");
            return true;

        }else {
            System.out.println("false");
            return false;
        }
    }



    public static boolean hasTeen (int a, int b, int c) {
        if(a >= 13 && a <= 19){
            System.out.println("true");
            return true;
        }else if (b >= 13 && b <= 19) {
            System.out.println("true");
            return true;
        }else if (c >= 13 && c <= 19) {
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }
    }



    public static boolean isTeen (int a) {
        if (a >= 13 && a <= 19) {
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }
    }



    public static void salariuPerZi (int salariu) {
        System.out.println("perZi => : '" + (double)(salariu / 20) + "'");
    }

    public static void salariuPerSaptamana (int salariu) {
        System.out.println("perSaptamana => : " + (double)(salariu / 4) + "'");
    }



    public static double multiplierPerDaysSkipped (int daysSkipped) {
        double salariu = 2000;
        int salariuSchimbat;
//        int salariuPerMonth;
//
//        salariuPerMonth = (20 * salariuPerDay) - (salariuPerDay * daysSkipped);

        if(daysSkipped > 5) {
            salariu = salariu - (salariu * 15) / 100;
        }

        System.out.println("\t=>: '" + salariu + "'");
        return salariu;
    }




    public static int multiplierPerProductsSold (int productsSold) {
        int ics = 10;
        if(productsSold > 20) {
            ics += 3;
            System.out.println("\t=> : " + ics);
        }


        return ics;
    }

    public static int bonusForProductSold (int productsSold) {

        System.out.println("\t=> '" + (productsSold * multiplierPerProductsSold(productsSold)) + "'");
        return productsSold * multiplierPerProductsSold(productsSold);

    }

    public static int finalSalary (int daysSkipped, int productsSold) {
        int salary = 1000;
        int result;

        result = salary + bonusForProductSold(productsSold);

        System.out.println("\t=> '" + result + "'");
        return result;
    }


}
