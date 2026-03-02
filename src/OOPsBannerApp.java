/**
 * OOPS Banner App - UC7
 * Store Character Pattern in a Class
 */

public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Define patterns
        CharacterPatternMap oPattern = new CharacterPatternMap('O', new String[]{
                "  *****   ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                "  *****   "
        });

        CharacterPatternMap pPattern = new CharacterPatternMap('P', new String[]{
                "  ******  ",
                " *     *  ",
                " *     *  ",
                "  ******  ",
                " *        ",
                " *        ",
                " *        "
        });

        CharacterPatternMap sPattern = new CharacterPatternMap('S', new String[]{
                "  ******  ",
                " *        ",
                " *        ",
                "  *****   ",
                "       *  ",
                "       *  ",
                "  *****   "
        });

        // Word to print
        CharacterPatternMap[] word = {oPattern, oPattern, pPattern, sPattern};

        // Print banner
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap ch : word) {
                line.append(ch.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}