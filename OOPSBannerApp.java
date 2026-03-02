/**
 * @author Developer
 * @version 2
 */
/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 * Refactored using Static Helper Methods
 */

/**
 * OOPSBannerApp UC7 Store Character Pattern in a Class
 * * This use case implements a CharacterPatternMap class to encapsulate 
 * character-to-pattern mappings for enhanced organization and modularity. [cite: 24, 25]
 * * @author Developer
 * @version 7.0
 */
public class OOPSBannerApp {

    /*
     * CharacterPatternMap – Inner static class for storing character-to-pattern mapping
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }


    // Create CharacterPatternMap array
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] P = {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };

        String[] S = {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };

        String[] space = {
                "  ",
                "  ",
                "  ",
                "  ",
                "  ",
                "  ",
                "  "
        };

        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        maps[0] = new CharacterPatternMap('O', O);
        maps[1] = new CharacterPatternMap('P', P);
        maps[2] = new CharacterPatternMap('S', S);
        maps[3] = new CharacterPatternMap(' ', space);

        return maps;
    }


    // Get pattern for a character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {

        for (CharacterPatternMap m : maps) {
            if (m.getCharacter() == ch) {
                return m.getPattern();
            }
        }

        return maps[3].getPattern(); // space
    }


    // Print banner message
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        for (int line = 0; line < 7; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = getCharacterPattern(ch, maps);
                sb.append(pattern[line]).append("  ");
            }

            System.out.println(sb.toString());
        }
    }


    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, maps);
    }
}