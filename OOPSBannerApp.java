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
import java.util.HashMap;

/**
 * OOPSBannerApp - UC8
 * Uses a Map for Character Patterns and Renders via Function
 */
public class OOPSBannerApp {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     * @return a HashMap where keys are characters and values are String arrays.
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        // 9-line exact matching patterns from the screenshot
        String[] patternO = {
            "   *** ",
            " **    ** ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            " **    ** ",
            "   *** "
        };

        String[] patternP = {
            "****** ",
            "**    ** ",
            "**     **",
            "**     **",
            "****** ",
            "** ",
            "** ",
            "** ",
            "** "
        };

        String[] patternS = {
            "  ***** ",
            "** ",
            "** ",
            " ** ",
            "  *** ",
            "    ** ",
            "    ** ",
            "    ** ",
            " ***** "
        };

        // Populate charMap with patterns for 'O', 'P', 'S'
        charMap.put('O', patternO);
        charMap.put('P', patternP);
        charMap.put('S', patternS);

        return charMap;
    }

    /**
     * Displays a banner message using the provided character map.
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        // Getting pattern height. Assuming all patterns have the same height
        int patternHeight = charMap.get('O').length;

        // Loop through each line of the pattern height and build the banner line
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                if (pattern != null) {
                    // Adding a single space between characters to match the snapshot
                    sb.append(pattern[line]).append(" "); 
                }
            }
            System.out.println(sb.toString());
        }
    }

    /**
     * Main entry point of the application.
     */
    public static void main(String[] args) {
        // Initialize the character map
        HashMap<Character, String[]> charMap = createCharacterMap();
        
        // Define message
        String message = "OOPS";
        
        // Display banner
        displayBanner(message, charMap);
    }
}