package homework.CiovarnacheConstantinClaudiu.Java2;

public class Blackjack {

    // 1. Calculează valoarea cărții
    public static int parseCard(String card) {
        return switch (card.toLowerCase()) {
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

    // 2. Verifică dacă este Blackjack
    public static boolean isBlackjack(String card1, String card2) {
        return parseCard(card1) + parseCard(card2) == 21;
    }

    // 3. Decizie pentru mâini mari (> 20 puncte)
    public static String largeHand(boolean isBlackjack, int dealerScore) {
        if (!isBlackjack) {
            return "P"; // Dacă nu e blackjack dar avem >20, singurul caz valid este o pereche de ași → split
        } else {
            return (dealerScore >= 10 || dealerScore == 15) ? "S" : "W";
        }
    }

    // 4. Decizie pentru mâini mici (< 21 puncte)
    public static String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        } else if (handScore <= 44) {
            return "H";
        } else {
            return (dealerScore >= 7) ? "H" : "S";
        }
    }

    // Opțional: testare rapidă
    public static void main(String[] args) {
        System.out.println(parseCard("ace"));                      // 11
        System.out.println(isBlackjack("queen", "ace"));           // true
        System.out.println(largeHand(true, 7));                    // S
        System.out.println(smallHand(15, 12));                     // H
        System.out.println(smallHand(18, 6));                      // S
        System.out.println(smallHand(10, 8));                      // H
    }
}
