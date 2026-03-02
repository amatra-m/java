import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - UC8
 * Using HashMap for Character Patterns
 */

public class OOPSBannerApp {

    // Map to store character patterns
    private static Map<Character, String[]> patternMap = new HashMap<>();

    // Initialize all patterns
    public static void initializePatterns() {

        patternMap.put('O', new String[]{
                "  *****   ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                "  *****   "
        });

        patternMap.put('P', new String[]{
                "  ******  ",
                " *     *  ",
                " *     *  ",
                "  ******  ",
                " *        ",
                " *        ",
                " *        "
        });

        patternMap.put('S', new String[]{
                "  ******  ",
                " *        ",
                " *        ",
                "  *****   ",
                "       *  ",
                "       *  ",
                "  *****   "
        });
    }

    // Function to render banner
    public static void renderBanner(String word) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        initializePatterns();
        renderBanner("OOPS");
    }
}