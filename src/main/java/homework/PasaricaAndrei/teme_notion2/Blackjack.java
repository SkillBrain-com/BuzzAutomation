package homework.PasaricaAndrei.teme_notion2;

public class Blackjack {

    public static int parseCard(String card) {
        switch (card) {
            case "ace":
                return 11;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                return 10;
            default:
                return 0; // pentru alte carti
        }
    }
    public static boolean isBlackjack(String card1, String card2) {
        return parseCard(card1) + parseCard(card2) == 21;
    }

    public static String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack) {
            if (dealerScore < 10) {
                return "W"; // Win
            } else {
                return "S"; // Stand
            }
        } else {
            return "P"; // Split dacă nu e blackjack
        }
    }

    public static String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S"; // Stand
        } else if (handScore <= 11) {
            return "H"; // Hit
        } else {
            // intre 12 si 16
            if (dealerScore >= 7) {
                return "H";
            } else {
                return "S";
            }
        }
    }

    public static void main(String[] args) {
        //1
        System.out.println(Blackjack.parseCard("ace"));   //11
        System.out.println(Blackjack.parseCard("three")); // 3
        System.out.println(Blackjack.parseCard("queen")); // 10
        System.out.println(Blackjack.parseCard("other")); //0

        //2
        System.out.println(Blackjack.isBlackjack("queen", "ace"));   // adev
        System.out.println(Blackjack.isBlackjack("seven", "five"));  // fals
        System.out.println(Blackjack.isBlackjack("ten", "jack"));    // fals

        //3
        System.out.println(Blackjack.largeHand(true, 7));  // S
        System.out.println(Blackjack.largeHand(true, 8));  // S
        System.out.println(Blackjack.largeHand(true, 5));  // W
        System.out.println(Blackjack.largeHand(false, 9)); // P

        //4
        System.out.println(Blackjack.smallHand(15, 12)); // H
        System.out.println(Blackjack.smallHand(15, 6));  // S
        System.out.println(Blackjack.smallHand(11, 10)); // H
        System.out.println(Blackjack.smallHand(17, 9));  // S
    }
}


