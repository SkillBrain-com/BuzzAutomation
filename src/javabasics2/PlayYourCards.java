package javabasics2;

public class PlayYourCards {

//     Ex.1

    public static void main(String[] args) {
        System.out.println(parseCard("ace"));
        System.out.println(parseCard("king"));
        System.out.println(parseCard("queen"));
        System.out.println(parseCard("jack"));
        System.out.println(parseCard("2"));
        System.out.println(parseCard("10"));

    }

    public static int parseCard(String card) {
        card = card.toLowerCase();
        switch (card){
            case "ace":
                return 11;
            case "king":
            case "queen":
            case "jack":
                return 10;
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
                return Integer.parseInt(card);
            default:
                throw new IllegalArgumentException("Invalid card:" + card);

        }
    }

//     Ex.2

    public static boolean isBlackjack(String card1, String card2) {
        int value1 = parseCard(card1);
        int value2 = parseCard(card2);
        return (value1 == 11 && value2 == 10) || (value1 == 10 && value2 == 11);

    }

    public static int parseCard1(String card) {
        card = card.toLowerCase();
        switch (card) {
            case "ace":
                return 11;
            case "king":
            case "queen":
            case "jack":
            case "10":
                return 10;
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                return Integer.parseInt(card);
            default:
                throw new IllegalArgumentException("Invalid card:" + card);
        }
    }

    // Ex.3

    public static String largeHand(boolean isBlackJack, int dealerScore) {
        if (isBlackJack) {
            return "W";
        } if (dealerScore >= 17) {
            return "W";
        } else if (dealerScore >= 12) {
            return "W";
        }else if (dealerScore >= 0) {
            return "W";
        }else {
            throw new IllegalArgumentException("Invalid dealer score!");
        }
    }

    // Ex.4

    public static String SmallHand(int handScore, int dealerScore) {
       if (handScore < 17) {
            return "H";
       } if (handScore >= 17 && handScore <= 20) {
           return "S";
        }
       return null;

    }
}



