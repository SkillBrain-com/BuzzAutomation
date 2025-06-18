package homework.CiovarnacheConstantinClaudiu.Java3.PigLatin;
public class PigLatin {

      public String translate (String input){
          String[] words = input.split(" ");
          StringBuilder result = new StringBuilder();

          for (String word : words) {
              if (result.length() > 0) result.append(" ");
              result.append(translateWord(word));
          }

          return result.toString();
      }

      private String translateWord (String word){
          if (startsWithVowelSound(word)) {
              return word + "ay";
          }

          int quIndex = word.indexOf("qu");
          if (quIndex > 0 && isConsonant(word.charAt(0))) {
              return word.substring(quIndex + 2) + word.substring(0, quIndex + 2) + "ay";
          }

          for (int i = 0; i < word.length(); i++) {
              char c = word.charAt(i);
              if (isVowel(c) || (c == 'y' && i != 0)) {
                  return word.substring(i) + word.substring(0, i) + "ay";
              }
          }

          return word + "ay"; // fallback
      }

      private boolean startsWithVowelSound (String word){
          return word.matches("^(?:[aeiou]|xr|yt).*");
      }

      private boolean isVowel ( char c){
          return "aeiou".indexOf(Character.toLowerCase(c)) >= 0;
      }

      private boolean isConsonant ( char c){
          return !isVowel(c);
      }
  }

