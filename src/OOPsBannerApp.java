/**
 * OOPSBannerApp UC3 - OOPS Banner Application
 * Using String.join() instead of + for concatenation
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join("", "  *****   ", "  *****   ", "  ******  ", "  ******  "));
        System.out.println(String.join("", " *     *  ", " *     *  ", " *     *  ", " *        "));
        System.out.println(String.join("", " *     *  ", " *     *  ", " *     *  ", " *        "));
        System.out.println(String.join("", " *     *  ", " *     *  ", " ******   ", "  *****   "));
        System.out.println(String.join("", " *     *  ", " *     *  ", " *        ", "       *  "));
        System.out.println(String.join("", " *     *  ", " *     *  ", " *        ", "       *  "));
        System.out.println(String.join("", "  *****   ", "  *****   ", " *        ", "  *****   "));

    }
}