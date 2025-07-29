package homework.Andrei.Paun.java3Homework;

public class PigLatinApp {


        public static void main(String[] args) {
            PigLatinApp app = new PigLatinApp();

            // Teste
            System.out.println(app.translate("apple"));       // appleay
            System.out.println(app.translate("xray"));        // xrayay
            System.out.println(app.translate("chair"));       // airchay
            System.out.println(app.translate("square"));      // aresquay
            System.out.println(app.translate("rhythm"));      // ythmrhay
            System.out.println(app.translate("my"));          // ymay
            System.out.println(app.translate("quick fast run")); // ickquay astfay unray
        }

        public String translate(String input) {
            String[] words = input.split("\\s+");
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                result.append(translateWord(word)).append(" ");
            }

            return result.toString().trim();
        }

        private String translateWord(String word) {
            word = word.toLowerCase();

            // Rule 1: starts with vowel sound (includes "xr", "yt")
            if (startsWithVowelSound(word)) {
                return word + "ay";
            }

            // Rule 3: starts with consonant + "qu"
            if (word.matches("^[^aeiou]*qu.*")) {
                int quIndex = word.indexOf("qu") + 2;
                return word.substring(quIndex) + word.substring(0, quIndex) + "ay";
            }

            // Rule 2: consonant cluster
            int firstVowel = firstVowelIndex(word);
            if (firstVowel > 0) {
                return word.substring(firstVowel) + word.substring(0, firstVowel) + "ay";
            }

            // Rule 4: y as vowel (like "my", "rhythm")
            int yIndex = word.indexOf('y');
            if (yIndex > 0) {
                return word.substring(yIndex) + word.substring(0, yIndex) + "ay";
            }

            // fallback
            return word + "ay";
        }

        private boolean startsWithVowelSound(String word) {
            return word.matches("^(?:[aeiou]|xr|yt).*");
        }

        private int firstVowelIndex(String word) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if ("aeiou".indexOf(c) >= 0) {
                    return i;
                }
            }
            return -1;
        }
    }


