/**
 * OOPSBannerApp UC5 - Array Initialization with String.join()
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Combined declaration and initialization
        String[] lines = {
            String.join("", "  *****   ", "  *****   ", "  ******  ", "  ******  "),
            String.join("", " *     *  ", " *     *  ", " *     *  ", " *        "),
            String.join("", " *     *  ", " *     *  ", " *     *  ", " *        "),
            String.join("", " *     *  ", " *     *  ", " ******   ", "  *****   "),
            String.join("", " *     *  ", " *     *  ", " *        ", "       *  "),
            String.join("", " *     *  ", " *     *  ", " *        ", "       *  "),
            String.join("", "  *****   ", "  *****   ", " *        ", "  *****   ")
        };

        // Enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}