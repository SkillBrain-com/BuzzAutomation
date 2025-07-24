package homework.andreiB.homework.homework3;

public class PigLatin {

    String translate(String phrase) {
        String[] words = phrase.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += translateWord(words[i]);
            if (i < words.length - 1) result += " ";
        }
        return result;
    }

    String translateWord(String word) {
        if (startsWithVowelSound(word)) return word + "ay";
        if (word.matches("^(squ|qu|thr|sch|ch|th|rh).*")) {
            String prefix = word.replaceFirst("^(squ|qu|thr|sch|ch|th|rh).*", "$1");
            return word.substring(prefix.length()) + prefix + "ay";
        }
        if (word.matches("^[^aeiou]+y.*")) {
            int index = word.indexOf('y');
            return word.substring(index) + word.substring(0, index) + "ay";
        }
        if (word.matches("^[^aeiou]+.*")) {
            int index = firstVowelIndex(word);
            return word.substring(index) + word.substring(0, index) + "ay";
        }
        return word + "ay";
    }

    boolean startsWithVowelSound(String word) {
        return word.matches("^(xr|yt|[aeiou]).*");
    }

    int firstVowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ("aeiou".indexOf(c) >= 0) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        PigLatin pigLatin = new PigLatin();
        System.out.println(pigLatin.translate("apple"));
        System.out.println(pigLatin.translate("chair"));
        System.out.println(pigLatin.translate("square"));
        System.out.println(pigLatin.translate("rhythm"));
        System.out.println(pigLatin.translate("my"));
        System.out.println(pigLatin.translate("xray"));
        System.out.println(pigLatin.translate("quick fast run"));
    }

}
