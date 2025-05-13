package homework.edinita.javaPart2.exercitiiCurs;

public class TheEx {
    public static void main(String[] args) {
        /*
        1. Convert Fahrenheit to Celsius. Read the temperature from keyboard.
            formula : (F-32) *5/9 = C;
         */
//        Scanner scanner = new Scanner(System.in);
//        double c;
//        double f;
//
//
//        System.out.println("\t\tInsert the Fahrenheit value u wanna convert in Celsius value...");
//        f = scanner.nextInt();
//
//
//        c = (f - 31) * 5/9;
//
//
//        System.out.println("\t\tHere is the value in Celsius: '" + c + "' for '" + f + "' Fahrenheit" );


        /*
           2. How to swap two values without using 3rd variable: a and b will be read from keyboard.
         */

//        Scanner scanner = new Scanner(System.in);
//
//        String a;
//        String b;
//        String c;
//
//
//        System.out.println("\t\tTell me something to insert into first variable...");
//
//        a = scanner.nextLine();
//
//        System.out.println("\t\tOk good, now again for the second variable...");
//
//        b = scanner.nextLine();
//
//        System.out.println("\t\tYou typed first: '" + a + "' and you typed second: '" + b + "' now let's switch the order\n");
//
//        c = a;
//        a = b;
//        b = c;
//
//        System.out.println("\t\tNow you typed first: '" + a + "' and you typed second: '" + b + "'");
//
//        System.out.println();

        /*
            3. Check if two strings are equals and compare them. Use Scanner to takes the string values
         */


//        Scanner scanner = new Scanner(System.in);
//
//        String a;
//        String b;
//
//        System.out.println("\t\tLets see if 2 phrases written from keyboard are the same length\n");
//
//        System.out.print("\t\tFirst string: ");
//        a = scanner.nextLine();
//
//        System.out.print("\t\tSecond string: ");
//        b = scanner.nextLine();
//
//        if (a.equals(b)) {  // .equals(),
//            System.out.println("\t\tAre the same.");
//        } else {
//            System.out.println("\t\tNot the same.");
//        }
//
//        int r;
//        r = a.compareTo(b); // .compareTo(), compara lungimile de texte din 2 variavile
//
//        if (r == 0) {
//            System.out.println("\t\tThey have same length.");
//        } else if (r < 0) {
//            System.out.println("\t\tFirst one is shorter.");
//        } else {
//            System.out.println("\t\tFirst one is longer.");
//        }




        checkNumber(23);
        System.out.println("\n");

        toMilesPerHour(40);
        System.out.println("\n");


        printConversion(20);
        System.out.println("\n");


        printConv(20);
        System.out.println("\n");

        printMegaBytesAndKiloBytes(4900);
        System.out.println("\n");


        shouldWakeUp(true, 9);
        System.out.println("\n");

        isLeapYear(2024);
        System.out.println("\n");


    }


    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("positive");
        }else if (number < 0){
            System.out.println("negative");
        }else if(number == 0){
            System.out.println("zero");
        }
    }



    public static long toMilesPerHour(double kilometersPerHour){
        long miles;

        if(kilometersPerHour < 0){
            return -1;
        }else {

            miles = (long) (kilometersPerHour / 1.609);
            System.out.println(miles);
        }
        return miles;
    }


    public static void printConversion(double kilometersPerHour){
        long milesPerHour;

        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else {
            milesPerHour = Math.round(kilometersPerHour / 1.609);
            System.out.println("'" + kilometersPerHour + "' km/h = '" + milesPerHour + "' mi/h");
        }
    }


    public static void printConv(double kilometersPerHour){
        long conversion = Math.round(toMilesPerHour(kilometersPerHour));
        System.out.println("'" + kilometersPerHour + "' km/h = '" + conversion + "' mi/h");
    }


    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megabytes;
        int remainingKilobytes;

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {
            megabytes = kiloBytes / 1024;
            remainingKilobytes = kiloBytes % 1024;
            System.out.println("'" + kiloBytes + "' KB = '" + megabytes + "' MB and '" + remainingKilobytes + "' KB");
        }
    }


    public static void shouldWakeUp(boolean barking, int hourOfDay){
        if ( hourOfDay < 0 && hourOfDay >= 23){
            System.out.println("Invalid Value");
        }else if(hourOfDay < 8 && hourOfDay >= 22 && barking == true){
            System.out.println("Wake UP!!!");
        }else{
            System.out.println("SweetDreams");
        }
    }


    public static void isLeapYear(int year){
        if (year >=1 && year <= 9999){
            if (year % 4 == 0){
                if(year % 100 == 0){
                    if (year % 400 == 0){
                        System.out.println("The year is a leap year (it has 366 days). The method isLeapYear needs to return true");
                    }else {
                        System.out.println("The year is not a leap year ( it has 365 days ). The method isLeapYear needs to return 'false'");
                    }
                }else {
                    System.out.println("The year is a leap year (it has 366 days). The method isLeapYear needs to return true");
                }
            }else{
                System.out.println("The year is not a leap year ( it has 365 days ). The method isLeapYear needs to return 'false'");
            }
        }else {
            System.out.println("Invalid Value");
        }
    }
}