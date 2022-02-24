import java.util.Scanner;

public class main {

    choice test = new choice();

    public static class MorseMain {

        MorseMain mm = new MorseMain();

        public static void main(String[] args) {
            Hashmap<Character, String> map = new Hashmap<>();
            MorseMain morseMain = new MorseMain();
            morseMain.run();
        }

        public void run() {

            menu();
            int choice = getChoice();
            try {
                if (choice == 1) {
                    System.out.println("Skriv en Engelsk mening: ");
                    String engStr = getScanner().nextLine();
                    String result = mm.englishToMorse(engStr);
                    System.out.println("Engelsk: " + engStr + " Morse code: " + result);
                } else if (choice == 2) {
                    System.out.println("skriv morse code, separerat med:");
                    String Schoice = "";
                    try {
                        Schoice = getScanner().nextLine();
                    } catch (Exception d) {
                        System.out.println("Morsecode endast, starta om");
                        System.exit(0);
                    }
                    String result = mm.MorseToEnglish(Schoice);
                    System.out.println("morse  " + Schoice + " eng : " + result);
                } else {
                    System.out.println("Fel: välj 1 elr 2. Starta om programet\n");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }


        private String MorseToEnglish(String Schoice) {
            return Schoice;

        }

        private String englishToMorse(String engStr) {
            return engStr;
        }


        private int getChoice() {
            int choice = 0;
            try {
                choice = getScanner().nextInt();
            } catch (Exception e) {
                System.out.println("Error");
            }
            return choice;
        }

        private void menu() {
            mm.mapMorseCode();
            System.out.println("Morse code Translator\n");
            System.out.println("----------------------\n");
            System.out.println("1.English to Morse\n");
            System.out.println("2. Morse to English\n");
        }

        private void mapMorseCode() {
        }

        private static Scanner getScanner() {
            return new Scanner(System.in);
        }
    }

    private static class Hashmap<T, T1> {
    }

    private class choice {
    }
}
