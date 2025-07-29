package homework.Andrei.Paun.java2Homework;

public class BlackJack {



        // 1. Transformă cartea în valoare numerică
        public static int parseCard(String card) {
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

        // 2. Verifică dacă două cărți formează Blackjack (21)
        public static boolean isBlackjack(String card1, String card2) {
            return parseCard(card1) + parseCard(card2) == 21;
        }

        // 3. Logică pentru "Large Hand" (peste 20 puncte)
        public static String largeHand(boolean isBlackJack, int dealerScore) {
            if (isBlackJack) {
                // Dacă dealerul NU are 10 sau AS => câștigi direct
                if (dealerScore < 10) {
                    return "W";
                } else {
                    return "S";
                }
            } else {
                // E pereche de ași → split
                return "P";
            }
        }

        // 4. Logică pentru "Small Hand" (sub 21)
        public static String smallHand(int handScore, int dealerScore) {
            if (handScore >= 17) {
                return "S";
            } else if (handScore <= 11) {
                return "H";
            } else if (handScore >= 12 && handScore <= 16) {
                if (dealerScore >= 7) {
                    return "H";
                } else {
                    return "S";
                }
            }
            return "S"; // fallback
        }

        // Testare (main)
        public static void main(String[] args) {
            System.out.println("parseCard(\"ace\") → " + parseCard("ace")); // 11
            System.out.println("isBlackjack(\"queen\", \"ace\") → " + isBlackjack("queen", "ace")); // true
            System.out.println("largeHand(true, 7) → " + largeHand(true, 7)); // S
            System.out.println("largeHand(true, 4) → " + largeHand(true, 4)); // W
            System.out.println("largeHand(false, 10) → " + largeHand(false, 10)); // P
            System.out.println("smallHand(15, 12) → " + smallHand(15, 12)); // H
            System.out.println("smallHand(11, 7) → " + smallHand(11, 7)); // H
            System.out.println("smallHand(18, 10) → " + smallHand(18, 10)); // S
        }
    }


