package homework.AndreiB.Homework.homework2;

public class BlackjackGame {

    static int parseCard(String card) {
        return switch (card) {
            case "ace" -> 11;
            case "two" -> 2;
            case "three" -> 3;
            case "four" -> 4;
            case "five" -> 5;
            case "six" -> 6;
            case "seven" -> 7;
            case "eight" -> 8;
            case "nine" -> 9;
            case "ten", "jack", "queen", "king" -> 10;
            default -> 0;
        };
    }

    static boolean isBlackjack(String card1, String card2) {
        return parseCard(card1) + parseCard(card2) == 21;
    }

    static String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack) {
            return (dealerScore >= 10 || dealerScore == 11) ? "S" : "W";
        } else {
            return "P";
        }
    }

    static String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        } else if (handScore <= 11) {
            return "H";
        } else {
            return (dealerScore >= 7) ? "H" : "S";
        }
    }

    public static void main(String[] args) {
        System.out.println(parseCard("ace"));
        System.out.println(isBlackjack("queen", "ace"));
        System.out.println(largeHand(true, 9));
        System.out.println(largeHand(true, 11));
        System.out.println(largeHand(false, 5));
        System.out.println(smallHand(15, 12));
        System.out.println(smallHand(15, 6));
        System.out.println(smallHand(10, 10));
        System.out.println(smallHand(18, 10));
    }

}
