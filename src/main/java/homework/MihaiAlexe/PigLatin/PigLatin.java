package homework.MihaiAlexe.PigLatin;

import java.util.Scanner;

public class PigLatin {

    public static String[] ConsonantCluster = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr",
            "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc",
            "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th",
            "tr", "tw", "wh", "wr", "xr", "yt"};
    public static String[] ConsonantCluster1 = {"squash", "square", "squid", "squirt", "squabble",
            "squalid", "squint", "squirm", "squire", "squaw"};

    public static void main(String[] args) {
        System.out.println("ENGLISH - PIG LATIN TRANSLATOR");
        System.out.println("RULE 1. Let's start with something symple: type a Word that starts with a vowel sound like 'xr' or 'yt' (Ex. xrays, xref, yttrium, ytterbium, yttria) ");
        Scanner scanner = new Scanner(System.in);
        String Word = scanner.next();
        if (Word.startsWith("xr") || Word.startsWith("yt")) {
            System.out.println("PIG LATIN: " + Word + "ay");
            System.out.println("RULE 2. Next, type a Word that begins with a consonant sound from this list: 'bl', 'br', 'ch', 'ck', 'cl', 'cr', 'dr', 'fl', 'fr'," +
                    "'gh', 'gl', 'gr', 'ng', 'ph', 'pl', 'pr', 'qu', 'sc'," +
                    "'sh', 'sk', 'sl', 'sm', 'sn', 'sp', 'st', 'sw', 'th'," +
                    "'tr', 'tw', 'wh', 'wr', 'xr', 'yt'");
            String NewWord = scanner.next();
            for (int i = 0; i < ConsonantCluster.length; i++) {
                String cluster = ConsonantCluster[i];
                if (NewWord.startsWith(cluster)) {
                    String RestWord = NewWord.substring(cluster.length());
                    String NewWordPL = RestWord + cluster + "ay";
                    System.out.println("PIG LATIN: " + NewWordPL + "!");
                    break;
                }
            }
            System.out.println("RULE 3. Let's carry on! Now, type a word that starts with a consonant followed by 'qu'. Ex. squash, square, squid, squirt, squabble, " +
                    " squalid,squint, squirm, squire, squaw: ");
            String NewWord1 = scanner.next();
            for (int i = 0; i < ConsonantCluster1.length; i++) {
                String cluster1 = "squ";
                if (NewWord1.startsWith(cluster1)) {
                    String RestWord1 = NewWord1.substring(cluster1.length());
                    String NewWordPL1 = RestWord1 + cluster1 + "ay";
                    System.out.println("PIG LATIN: " + NewWordPL1 + "!");
                    break;
                }
            }
            System.out.println("RULE 4. Last option! Type a word that has a 'y' as the second letter in a two letter word or after the consonant cluster from the above list at RULE 2. " +
                    "Here are a few examples: my, by, crying, crypt, crystal, drying, etc.");
            String NewWord2 = scanner.next();
            if (NewWord2.startsWith("oy)") || NewWord2.startsWith("by") || NewWord2.startsWith("my") || NewWord2.startsWith("oy") || NewWord2.startsWith("ay")) {
                System.out.println("PIG LATIN: " + NewWord2 + "ay!");
            } else {
                for (int i = 0; i < ConsonantCluster.length; i++) {
                    String cluster2 = ConsonantCluster[i];
                    if (NewWord2.startsWith(cluster2 + "y")) {
                        String RestWord2 = NewWord2.substring(cluster2.length());
                        String NewWordPL2 = RestWord2 + cluster2 + "ay";
                        System.out.println("PIG LATIN: " + NewWordPL2 + "!");
                        break;
                    }

                }

            }
        }
    }
}

