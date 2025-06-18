package homework.CiovarnacheConstantinClaudiu.Java3.PigLatin;

public class Main {
    public static void main(String[] args) {
        PigLatin translator = new PigLatin();

        // Câteva exemple
        String[] examples = {
                "apple",        // appleay
                "xray",         // xrayay
                "yttria",       // yttriaay
                "chair",        // airchay
                "square",       // aresquay
                "rhythm",       // ythmrhay
                "my",           // ymay
                "quick fast run" // ickquay astfay unray
        };

        for (String word : examples) {
            System.out.println("Original: " + word);
            System.out.println("Pig Latin: " + translator.translate(word));
            System.out.println("---");
        }
    }
}
