import java.util.HashMap;
import java.util.Map;

public class hashmap {
    



    public class MorseMain {


        HashMap<String, Character> morseToEng = new HashMap<>();
        HashMap<Character, String> fun = new HashMap<>();

        public String englishToMorse(String s) {
            char[] arr = s.toLowerCase().toCharArray();
            String result = "";
            for (int i = 0; i < arr.length; i++) {
                char bokstav = arr[i];
                String morsekod = getEngToMorse(bokstav);
                result += morsekod;
            }
            return result;
        }

        public String MorseToEnglish(String s) {

            String result = "";
            String[] arr = s.split(" ");
            for (String m : arr) {
                result += getMorseToEng(m) + " ";
            }

            return result;
        }

        private String getMorseToEng(String m) {
            if (!morseToEng.containsKey(m)) {
                throw new IllegalArgumentException(" ogiltig bokstav");
            }
            return morseToEng.get(m) + " ";
        }

        private String getEngToMorse(char m) {
            if (!fun.containsKey(m)) {
                throw new IllegalArgumentException("ogiltig bokstav");
            }
            return fun.get(m);
        }


    }
}
